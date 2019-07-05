package com.hk.snmp.receiver;

import com.hk.base.log.LogBean;
import org.snmp4j.*;
import org.snmp4j.mp.*;
import org.snmp4j.security.*;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.UdpAddress;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.transport.DefaultUdpTransportMapping;
import org.snmp4j.util.MultiThreadedMessageDispatcher;
import org.snmp4j.util.ThreadPool;

import java.io.IOException;
import java.util.Vector;

/**
 * Created by LuHj on 2019/6/28.
 */
public class SnmpTrapReceiver extends LogBean implements CommandResponder {
    private static int threadNum = 200;
    private static String ipAddress = "udp:10.10.112.177/162";
    private Snmp snmp = null;
    public void init(){
        //1、初始化多线程消息转发类
        ThreadPool threadPool = ThreadPool.create("SnmpTrap", threadNum);
        MessageDispatcher messageDispatcher = new MultiThreadedMessageDispatcher(threadPool, new MessageDispatcherImpl());
        //其中要增加三种处理模型。如果snmp初始化使用的是Snmp(TransportMapping<? extends Address> transportMapping) ,就不需要增加
        messageDispatcher.addMessageProcessingModel(new MPv1());
        messageDispatcher.addMessageProcessingModel(new MPv2c());
        OctetString localEngineID = new OctetString(MPv3.createLocalEngineID());
        USM usm = new USM(SecurityProtocols.getInstance().addDefaultProtocols(), localEngineID, 0);
        UsmUser user = new UsmUser(new OctetString("SNMPV3"), AuthSHA.ID, new OctetString("authPassword"),
                PrivAES128.ID, new OctetString("privPassword"));
        usm.addUser(user.getSecurityName(), user);
        messageDispatcher.addMessageProcessingModel(new MPv3(usm));
        //2、创建transportMapping
        TransportMapping<?> transportMapping = null;
        try {
            UdpAddress updAddr = (UdpAddress) GenericAddress.parse(System.getProperty("snmp4j.listenAddress", ipAddress));
            transportMapping = new DefaultUdpTransportMapping(updAddr);
            //3、正式创建snmp
            snmp = new Snmp(messageDispatcher, transportMapping);
            //开启监听
            snmp.listen();
        } catch (IOException e) {
            logger.error("初始化transportMapping失败：", e.getMessage());
            e.printStackTrace();
        }
    }

    public void start() {
        init();
        //一定要将当前对象添加至commandResponderListeners中
        snmp.addCommandResponder(this);
        System.out.println("开始监听trap信息：");
    }
    /**
     * 处理信息方法
     */
    @Override
    public void processPdu(CommandResponderEvent event) {
        String version = null ;
        String community = null;
        if (event.getPDU().getType() == PDU.V1TRAP) {
            version = "v1";
            community = new String(event.getSecurityName());
        } else if (event.getPDU().getType() == PDU.TRAP){
            if (event.getSecurityModel() == 2) {
                version = "v2";
                community = new String(event.getSecurityName());
            }else {
                version = "v3";
            }
        }
        System.out.println("接收到的trap信息：[发送来源="+event.getPeerAddress()+",snmp版本="+version+",团体名="+community+", 携带的变量="+event.getPDU().getVariableBindings()+"]");

        if (event != null && event.getPDU() != null) {
            PDU src_pdu = event.getPDU();
            // 需要确认trap
            if (src_pdu.getType() == PDU.INFORM) {
                PDU responsePDU = new PDU(src_pdu);
                responsePDU.setErrorIndex(0);
                responsePDU.setErrorStatus(0);
                responsePDU.setType(PDU.RESPONSE);
                StatusInformation statusInfo = new StatusInformation();
                try {
                    event.getMessageDispatcher().returnResponsePdu(
                            event.getMessageProcessingModel(),
                            event.getSecurityModel(),
                            event.getSecurityName(),
                            event.getSecurityLevel(), responsePDU,
                            event.getMaxSizeResponsePDU(),
                            event.getStateReference(),
                            statusInfo);

                } catch (MessageException msgEx) {
                    msgEx.printStackTrace();
                }
            }

            Vector<VariableBinding> recVBs = (Vector<VariableBinding>) event.getPDU()
                    .getVariableBindings();
            for (int i = 0; i < recVBs.size(); i++) {
                VariableBinding recVB = recVBs.elementAt(i);
                System.out
                        .println(recVB.getOid() + " : " + recVB.getVariable());
            }
        }

    }
    public static void main(String[] args) {
        SnmpTrapReceiver handler = new SnmpTrapReceiver();
        handler.start();
    }
}
