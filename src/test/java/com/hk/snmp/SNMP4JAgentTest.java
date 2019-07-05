package com.hk.snmp;

import com.hk.snmp.agent.SnmpAgent;
import com.hk.snmp.table.IMoTable;
import com.hk.snmp.table.MoTableUtil;
import com.hk.snmp.table.PduMoTable;
import com.hk.snmp.table.PduMoTable2;
import com.hk.snmp.table.row.PduRow;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.snmp4j.agent.mo.DefaultMOTable;
import org.snmp4j.agent.mo.DefaultMOTableRow;
import org.snmp4j.agent.mo.MOTableRow;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.Variable;

import java.io.IOException;

/**
 * Created by LuHj on 2019/7/1.
 */
public class SNMP4JAgentTest {
    SNMP4JAgent sa = null;


    @Before
    public void before(){
        sa = new SNMP4JAgent();
        sa.run();
    }

    @Test
    public void testRun() throws IOException {
        DefaultMOTable emuTable = MoTableUtil.getEmuTable();
//        Variable[] values = new Variable[10];
//        values[0] = new OctetString("a.0." + 2);
//        values[1] = new OctetString("b.0." + 2);
//        values[2] = new OctetString("c.0." + 2);
//        values[3] = new OctetString("d.0." + 2);
//        values[4] = new OctetString("e.0." + 2);
//        values[5] = new OctetString("f.0." + 2);
//        values[6] = new OctetString("g.0." + 2);
//        values[7] = new OctetString("h.0." + 2);
//        values[8] = new OctetString("i.0." + 2);
//        values[9] = new Integer32(2);
//        emuTable.addRow(new DefaultMOTableRow(new OID("1.0.1"), values));

//        IMoTable pduMoTable = new PduMoTable();
//        pduMoTable.addRow(PduRow.builder().id(1).online(1).power(10).voltage(220).current(20).build());
//        pduMoTable.addRow(PduRow.builder().id(2).online(0).power(11).voltage(220).current(20).build());
//        pduMoTable.addRow(PduRow.builder().id(3).online(1).power(12).voltage(220).current(20).build());
//        pduMoTable.addRow(PduRow.builder().id(4).online(1).power(12).voltage(220).current(20).build());
//        pduMoTable.addRow(PduRow.builder().id(5).online(1).power(12).voltage(220).current(20).build());

        DefaultMOTable pdu = new PduMoTable2();
        pdu.addRow(new DefaultMOTableRow(new OID("1"),new Variable[]{
                new Integer32(0),
                new Integer32(1),
                new Integer32(220),
                new Integer32(20),
                new Integer32(100)
        }));
        sa.registerMOTable(pdu);
        pdu.addRow(new DefaultMOTableRow(new OID("2"),new Variable[]{
                new Integer32(0),
                new Integer32(1),
                new Integer32(221),
                new Integer32(21),
                new Integer32(100)
        }));
    }
    @After
    public void after(){
        while (true){}
    }

}