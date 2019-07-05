package com.hk.snmp.table;

import com.hk.snmp.table.row.IRow;
import org.snmp4j.agent.mo.DefaultMOTable;

/**
 * Created by LuHj on 2019/7/1.
 */
public interface IMoTable {
    boolean addRow(IRow row);
    DefaultMOTable get();
}
