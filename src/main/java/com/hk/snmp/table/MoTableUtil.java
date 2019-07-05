package com.hk.snmp.table;

import com.hk.snmp.Constant;
import org.snmp4j.agent.MOAccess;
import org.snmp4j.agent.mo.*;
import org.snmp4j.agent.mo.snmp.RowStatus;
import org.snmp4j.smi.*;

/**
 * Created by LuHj on 2019/6/28.
 */
public class MoTableUtil {
    @SuppressWarnings("rawtypes")
    private static DefaultMOTable emuTable;
    private static final String emuTableEntryOid = "1.3.6.1.4.1.19547.1.6.1.1.1";
    private static final Object[][] columnEmuDefined = {
            { 1, "1", MOAccessImpl.ACCESS_READ_ONLY, SMIConstants.SYNTAX_OCTET_STRING },
            { 2, "2", MOAccessImpl.ACCESS_READ_ONLY, SMIConstants.SYNTAX_OCTET_STRING },
            { 3, "3", MOAccessImpl.ACCESS_READ_ONLY, SMIConstants.SYNTAX_OCTET_STRING },
            { 4, "4", MOAccessImpl.ACCESS_READ_ONLY, SMIConstants.SYNTAX_OCTET_STRING },
            { 5, "5", MOAccessImpl.ACCESS_READ_ONLY, SMIConstants.SYNTAX_OCTET_STRING },
            { 6, "6", MOAccessImpl.ACCESS_READ_ONLY, SMIConstants.SYNTAX_OCTET_STRING },
            { 7, "7", MOAccessImpl.ACCESS_READ_ONLY, SMIConstants.SYNTAX_OCTET_STRING },
            { 8, "8", MOAccessImpl.ACCESS_READ_ONLY, SMIConstants.SYNTAX_OCTET_STRING },
            { 9, "9", MOAccessImpl.ACCESS_READ_ONLY, SMIConstants.SYNTAX_OCTET_STRING },
            { 10, Constant.ROWSTATUS, MOAccessImpl.ACCESS_READ_CREATE, SMIConstants.SYNTAX_INTEGER32 } };


    @SuppressWarnings("rawtypes")
    private static DefaultMOTable edfaTable;
    private static final String edfaTableEntryOid = "1.3.6.1.4.1.19547.1.6.1.2.1";
    private static final Object[][] columnEdfaDefined = {
            { 1, "1", MOAccessImpl.ACCESS_READ_ONLY, SMIConstants.SYNTAX_OCTET_STRING },
            { 2, "2", MOAccessImpl.ACCESS_READ_ONLY, SMIConstants.SYNTAX_OCTET_STRING },
            { 3, "3", MOAccessImpl.ACCESS_READ_ONLY, SMIConstants.SYNTAX_OCTET_STRING },
            { 4, "4", MOAccessImpl.ACCESS_READ_ONLY, SMIConstants.SYNTAX_OCTET_STRING },
            { 5, "5", MOAccessImpl.ACCESS_READ_ONLY, SMIConstants.SYNTAX_OCTET_STRING },
            { 6, "6", MOAccessImpl.ACCESS_READ_ONLY, SMIConstants.SYNTAX_OCTET_STRING },
            { 7, "7", MOAccessImpl.ACCESS_READ_ONLY, SMIConstants.SYNTAX_OCTET_STRING },
            { 8, "8", MOAccessImpl.ACCESS_READ_ONLY, SMIConstants.SYNTAX_OCTET_STRING },
            { 9, "9", MOAccessImpl.ACCESS_READ_ONLY, SMIConstants.SYNTAX_OCTET_STRING },
            { 10, "10", MOAccessImpl.ACCESS_READ_ONLY, SMIConstants.SYNTAX_OCTET_STRING },
            { 11, Constant.ROWSTATUS, MOAccessImpl.ACCESS_READ_CREATE, SMIConstants.SYNTAX_INTEGER32 } };

    //private static DefaultMOTable defaTable;

    @SuppressWarnings("rawtypes")
    public static DefaultMOTable getEmuTable(){
        if(emuTable == null){
            initEmuTable();
        }
        return emuTable;
    }

    @SuppressWarnings("rawtypes")
    public static DefaultMOTable getEdfaTable(){
        if(edfaTable == null){
            initEdfaTable();
        }
        return edfaTable;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static void initEmuTable(){
        int columnLength = columnEmuDefined.length;
        MOColumn[] edfaColumns = new MOColumn[columnLength];
        for( int i=0; i<columnLength; i++){
            Object[] acol = columnEmuDefined[i];
            int index = (Integer) acol[0];
            String name = (String) acol[1];
            MOAccess access = (MOAccess) acol[2];
            int operType = (Integer) acol[3];

            Variable valueDefault = new Integer32(1);

            if(name.startsWith(Constant.ROWSTATUS)){
                edfaColumns[i] = new RowStatus(index);
            }else{
                edfaColumns[i] = new MOMutableColumn<Variable>(index, operType, access, valueDefault, true);
            }
        }

        emuTable = new DefaultMOTable(
                new OID(emuTableEntryOid),

                new MOTableIndex(
                        new MOTableSubIndex[] {
                                new MOTableSubIndex(
                                        new OID(emuTableEntryOid + ".1001"),
                                        SMIConstants.SYNTAX_OCTET_STRING, 1, 16) },
                        true),

                edfaColumns,
                new DefaultMOMutableTableModel<DefaultMOTableRow>()
        );
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static void initEdfaTable(){
        int columnLength = columnEdfaDefined.length;
        MOColumn[] edfaColumns = new MOColumn[columnLength];
        for( int i=0; i<columnLength; i++){
            Object[] acol = columnEdfaDefined[i];
            int index = (Integer) acol[0];
            String name = (String) acol[1];
            MOAccess access = (MOAccess) acol[2];
            int operType = (Integer) acol[3];

            Variable valueDefault = new Integer32(1);

            if(name.startsWith(Constant.ROWSTATUS)){
                edfaColumns[i] = new RowStatus(index);
            }else{
                edfaColumns[i] = new MOMutableColumn<Variable>(index, operType, access, valueDefault, true);
            }
        }

        edfaTable = new DefaultMOTable(
                new OID(edfaTableEntryOid),

                new MOTableIndex(
                        new MOTableSubIndex[] {
                                new MOTableSubIndex(
                                        new OID(edfaTableEntryOid + ".1001"),
                                        SMIConstants.SYNTAX_OCTET_STRING, 1, 16) },
                        true),

                edfaColumns,
                new DefaultMOMutableTableModel<DefaultMOTableRow>()
        );
    }

    @SuppressWarnings("unchecked")
    public static void fillDefaultDataIntoEmuTable(){
        for (int rowId = 1; rowId < 10; rowId++) {
            Variable[] values = new Variable[10];
            values[0] = new OctetString("a.0." + rowId);
            values[1] = new OctetString("b.0." + rowId);
            values[2] = new OctetString("c.0." + rowId);
            values[3] = new OctetString("d.0." + rowId);
            values[4] = new OctetString("e.0." + rowId);
            values[5] = new OctetString("f.0." + rowId);
            values[6] = new OctetString("g.0." + rowId);
            values[7] = new OctetString("h.0." + rowId);
            values[8] = new OctetString("i.0." + rowId);
            values[9] = new Integer32(rowId);
            emuTable.addRow(new DefaultMOTableRow(new OID("1.0." + rowId),
                    values));
        }
    }

    @SuppressWarnings("unchecked")
    public static void fillDefaultDataIntoEdfaTable(){
        for (int rowId = 1; rowId < 5; rowId++) {
            Variable[] values = new Variable[11];
            values[0] = new OctetString("edfa.a.0." + rowId);
            values[1] = new OctetString("edfa.b.0." + rowId);
            values[2] = new OctetString("edfa.c.0." + rowId);
            values[3] = new OctetString("edfa.d.0." + rowId);
            values[4] = new OctetString("edfa.e.0." + rowId);
            values[5] = new OctetString("edfa.f.0." + rowId);
            values[6] = new OctetString("edfa.g.0." + rowId);
            values[7] = new OctetString("edfa.h.0." + rowId);
            values[8] = new OctetString("edfa.i.0." + rowId);
            values[9] = new OctetString("edfa.j.0." + rowId);
            values[10] = new Integer32(rowId);
            edfaTable.addRow(new DefaultMOTableRow(new OID("1.0." + rowId),
                    values));
        }
    }
}
