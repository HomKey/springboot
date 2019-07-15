package com.hk.test;

import com.hk.snmp.trap.TrapDeamon;
import com.hk.snmp.trap.TrapSender;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.snmp4j.*;
import org.snmp4j.smi.UdpAddress;
import org.snmp4j.transport.DefaultUdpTransportMapping;

import java.io.IOException;

/**
 * Created by LuHj on 2019/7/5.
 */
public class NoSpringbootTest {


//    @Before
//    public void before(){
//        TrapDeamon trapDeamon = new TrapDeamon();
//        try {
//            trapDeamon.init();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    @Test
    public void testTrap() {
        try {
            TrapSender trapSender = new TrapSender();
            trapSender.initComm();
            trapSender.sendPDU();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    @After
//    public void after() {
//        //等待一段测试时间,在这段时间可以发送trap信息测试.
//        try {
//            Thread.sleep(180000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
}
