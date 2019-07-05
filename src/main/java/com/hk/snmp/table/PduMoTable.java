package com.hk.snmp.table;

import com.hk.snmp.Constant;
import com.hk.snmp.table.row.IRow;
import com.hk.snmp.table.row.PduRow;
import org.snmp4j.agent.MOAccess;
import org.snmp4j.agent.mo.*;
import org.snmp4j.agent.mo.snmp.RowStatus;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.SMIConstants;
import org.snmp4j.smi.Variable;

/**
 * Created by LuHj on 2019/7/1.
 */
public class PduMoTable implements IMoTable {
    private static DefaultMOTable<DefaultMOTableRow, MOColumn, DefaultMOMutableTableModel<DefaultMOTableRow>> pduTable;

    private void initMoTable() {
        pduTable = new DefaultMOTable<DefaultMOTableRow, MOColumn, DefaultMOMutableTableModel<DefaultMOTableRow>>(
                new OID(Constant.PDU_TABLE_ENTRY_OID),
                new MOTableIndex(
                        new MOTableSubIndex[]{
                                new MOTableSubIndex(
                                        new OID(Constant.PDU_TABLE_ENTRY_OID),
                                        SMIConstants.SYNTAX_OCTET_STRING, 1, 254)},
                        true),
                new MOColumn[]{
                        new MOMutableColumn<>(0, SMIConstants.SYNTAX_INTEGER, MOAccessImpl.ACCESS_READ_ONLY, new Integer32(0), true),
                        new MOMutableColumn<>(1, SMIConstants.SYNTAX_INTEGER32, MOAccessImpl.ACCESS_READ_ONLY, new Integer32(0), true),
                        new MOMutableColumn<>(2, SMIConstants.SYNTAX_INTEGER32, MOAccessImpl.ACCESS_READ_ONLY, new Integer32(0), true),
                        new MOMutableColumn<>(3, SMIConstants.SYNTAX_INTEGER32, MOAccessImpl.ACCESS_READ_ONLY, new Integer32(0), true)
                },
                new DefaultMOMutableTableModel<>()
        );
    }

    public boolean addRow(IRow pduRow) {
        return pduTable.addRow(new DefaultMOTableRow(pduRow.getOid(), pduRow.toVariables()));
    }

    @Override
    public DefaultMOTable get() {
        if (pduTable == null) {
            initMoTable();
        }
        return pduTable;
    }


}
