package com.hk.snmp.trap;

import org.snmp4j.*;
import org.snmp4j.mp.MPv1;
import org.snmp4j.mp.MPv2c;
import org.snmp4j.mp.MPv3;
import org.snmp4j.security.*;
import org.snmp4j.smi.*;
import org.snmp4j.transport.DefaultTcpTransportMapping;
import org.snmp4j.transport.DefaultUdpTransportMapping;
import org.snmp4j.util.MultiThreadedMessageDispatcher;
import org.snmp4j.util.ThreadPool;

import java.net.InetAddress;

/**
 * Created by LuHj on 2019/7/8.
 */
public class TrapDeamon implements CommandResponder
{
    private Snmp snmp;

    public void init() throws Exception
    {
        //create a threadpool to process the traps
        ThreadPool threadPool = ThreadPool.create("TrapDeamon", 3);
        MultiThreadedMessageDispatcher dispatcher = new MultiThreadedMessageDispatcher(threadPool,  new MessageDispatcherImpl());
        Address listenAddress = GenericAddress.parse("udp:192.168.7.140/163");
        TransportMapping transport = null;
        // tcp or udp
        if (listenAddress instanceof UdpAddress)
        {
            transport = new DefaultUdpTransportMapping((UdpAddress) listenAddress);
        }
        else
        {
            transport = new DefaultTcpTransportMapping((TcpAddress) listenAddress);
        }
        //construct a "snmp" instance to handle the snmp massage
        snmp = new Snmp(dispatcher, transport);
        //add msg handling module
        snmp.getMessageDispatcher().addMessageProcessingModel(new MPv1());
        snmp.getMessageDispatcher().addMessageProcessingModel(new MPv2c());
        snmp.getMessageDispatcher().addMessageProcessingModel(new MPv3());

        //add the enginID in the trap
        OctetString engineID = new OctetString(MPv3.createLocalEngineID());
        //create and add the userSecurityModel
        USM usm = new USM(SecurityProtocols.getInstance(),engineID, 0);
        SecurityModels.getInstance().addSecurityModel(usm);

        //add the securityProtocols,you can skip it if your users are noAuthNoPriv
        SecurityProtocols.getInstance().addDefaultProtocols();


        //create and add the user
        OctetString userName = new OctetString("myuser");
        OctetString password = new OctetString ("mypassword");
        UsmUser usmUser = new UsmUser(userName, AuthMD5.ID, password, null, null);
        snmp.getUSM().addUser(usmUser);

//add other users here...

        snmp.listen();
        snmp.addCommandResponder(this);
        System.out.println("Listening..");

    }

    @Override
    public void processPdu(CommandResponderEvent respEvnt)
    {
        String peerAddr = respEvnt.getPeerAddress().toString();
        try
        {
            String [] remoteAddr = peerAddr.split("/");
            String ip = remoteAddr[0];

            if (respEvnt != null && respEvnt.getPDU() != null)
            {
                PDU pdu = respEvnt.getPDU();
                switch (pdu.getType())
                {
                    case -89://0xA7 represents V2,V3Trap
                        System.out.println(pdu);
//                        parsePduV2(ip, pdu);
                        break;
                    case -92://0xA4 represents V1Trap
                        System.out.println(pdu);
//                        parsePduV1(ip, pdu);
                        break;
                    default://not a Trap,ignore it
                        break;
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Error occured in processPdu() of " + peerAddr);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}