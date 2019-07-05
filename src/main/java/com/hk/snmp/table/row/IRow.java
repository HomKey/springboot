package com.hk.snmp.table.row;

import org.snmp4j.smi.OID;
import org.snmp4j.smi.Variable;

/**
 * Created by LuHj on 2019/7/1.
 */
public interface IRow {
    OID getOid();
    Variable[] toVariables();
}
