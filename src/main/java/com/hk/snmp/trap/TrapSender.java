package com.hk.snmp.trap;

import org.snmp4j.CommunityTarget;
import org.snmp4j.PDU;
import org.snmp4j.Snmp;
import org.snmp4j.TransportMapping;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.*;
import org.snmp4j.transport.DefaultUdpTransportMapping;

import java.io.IOException;
import java.util.Vector;

/**
 * Created by LuHj on 2019/7/5.
 */
public class TrapSender {
    private Snmp snmp = null;
    private Address targetAddress = null;
    public void initComm() throws IOException {

        // 设置管理进程的IP和端口
        targetAddress = GenericAddress.parse("udp:127.0.0.1/163");
        TransportMapping transport = new DefaultUdpTransportMapping();
        snmp = new Snmp(transport);
        transport.listen();

    }

    /**
     * 向管理进程发送Trap报文
     *
     * @throws IOException
     */
    public void sendPDU() throws IOException {

        // 设置 target
        CommunityTarget target = new CommunityTarget();
        target.setAddress(targetAddress);

        // 通信不成功时的重试次数
        target.setRetries(2);
        // 超时时间
        target.setTimeout(1500);
        // snmp版本
        target.setVersion(SnmpConstants.version2c);

        // 创建 PDU
        PDU pdu = new PDU();
        pdu.add(new VariableBinding(new OID(".1.3.6.1.4.1.0.1.1.1.1.10.1"),
                new OctetString("emh smoke")));
        pdu.setType(PDU.TRAP);

        // 向Agent发送PDU，并接收Response
        ResponseEvent respEvnt = snmp.send(pdu, target);

        // 解析Response
        if (respEvnt != null && respEvnt.getResponse() != null) {
            Vector<? extends VariableBinding> recVBs = respEvnt.getResponse().getVariableBindings();
            for (int i = 0; i < recVBs.size(); i++) {
                VariableBinding recVB = recVBs.elementAt(i);
                System.out.println(recVB.getOid() + " : " + recVB.getVariable());
            }
        }
    }
}
