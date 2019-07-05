package com.hk.snmp;

import com.hk.base.log.LogBean;
import com.hk.snmp.agent.SnmpAgent;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.snmp4j.Snmp;
import org.snmp4j.TransportMapping;
import org.snmp4j.agent.mo.MOAccessImpl;
import org.snmp4j.agent.mo.MOScalar;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.UdpAddress;
import org.snmp4j.transport.DefaultUdpTransportMapping;

import java.io.IOException;

/**
 * Created by LuHj on 2019/7/1.
 */
public class AgentTest extends LogBean {
    private static final String OID_SYS_DESCR = "1.3.6.1.4.1.12321.1.1.1.2.0";

    private static final String AGENT_ADDR = "udp:127.0.0.1/161";

    private static final String MANAGER_ADDR = "udp:127.0.0.1/16200";

    private static UdpAddress agentAddr = (UdpAddress) GenericAddress.parse(AGENT_ADDR);

    private static UdpAddress mgrAddr = (UdpAddress) GenericAddress.parse(MANAGER_ADDR);

    private static SnmpAgent agent;

    private static Snmp mgrSession;

    @Before
    public void before() throws IOException {
        agent = new SnmpAgent(AGENT_ADDR);
        agent.start();
        TransportMapping<UdpAddress> transportMapping = new DefaultUdpTransportMapping(mgrAddr);
        mgrSession = new Snmp(transportMapping);
        transportMapping.listen();
    }

    @After
    public void after() throws Exception {
        agent.stop();
        mgrSession.close();
    }

    @Test
    public void testRun() {
        agent.unregisterManagedObject(agent.getSnmpv2MIB());
        String sysDescr = "Ubuntu 14 - amd64";
        MOScalar<OctetString> mo = new MOScalar<>( //创建一个标量
                new OID(OID_SYS_DESCR), //OID
                MOAccessImpl.ACCESS_READ_ONLY,//最高访问级别
                new OctetString(sysDescr) //值
        );
        agent.registerManagedObject(mo);

        while (true){

        }
    }
}
