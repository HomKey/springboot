package com.hk.snmp.table;

import com.hk.snmp.Constant;
import org.snmp4j.agent.mo.*;
import org.snmp4j.agent.mo.snmp.RowStatus;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.SMIConstants;

/**
 * Created by LuHj on 2019/7/1.
 */
public class PduMoTable2 extends DefaultMOTable {
    public PduMoTable2() {
        super(new OID(Constant.PDU_TABLE_ENTRY_OID), new MOTableIndex(
                        new MOTableSubIndex[]{
                                new MOTableSubIndex(
                                        new OID(Constant.PDU_TABLE_ENTRY_OID),
                                        SMIConstants.SYNTAX_OCTET_STRING, 1, 254)},
                        true),
                new MOColumn[]{
                        new RowStatus(0),
                        new MOMutableColumn<>(1, SMIConstants.SYNTAX_INTEGER, MOAccessImpl.ACCESS_READ_ONLY, new Integer32(0), true),
                        new MOMutableColumn<>(2, SMIConstants.SYNTAX_INTEGER32, MOAccessImpl.ACCESS_READ_ONLY, new Integer32(0), true),
                        new MOMutableColumn<>(3, SMIConstants.SYNTAX_INTEGER32, MOAccessImpl.ACCESS_READ_ONLY, new Integer32(0), true),
                        new MOMutableColumn<>(4, SMIConstants.SYNTAX_INTEGER32, MOAccessImpl.ACCESS_READ_ONLY, new Integer32(0), true),
                },
                new DefaultMOMutableTableModel<MOTableRow<org.snmp4j.smi.Variable>>());
    }


}
