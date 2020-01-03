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
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by LuHj on 2019/7/5.
 */
public class NoSpringbootTest {


//    @Before
    public void before(){
        TrapDeamon trapDeamon = new TrapDeamon();
        try {
            trapDeamon.init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private String[][] alertData;
    @Before
    public void before1(){
        alertData = new String[][]{
                new String[]{"139319","超出工况范围报警"},
                new String[]{"139297","综合报警"},
                new String[]{"139312","EEPROM报警"},
                new String[]{"139315","电子膨胀阀报警"},
                new String[]{"139313","风机1断线报警"},
                new String[]{"139314","风机2断线报警"},
                new String[]{"139328","电加热报警"},
                new String[]{"139301","湿度高报警"},
                new String[]{"139317","高压报警"},
                new String[]{"139327","加湿器一般报警"},
                new String[]{"139323","加湿器高电流报警"},
                new String[]{"139321","加湿器低电流报警"},
                new String[]{"139322","加湿器水位低报警"},
                new String[]{"139324","加湿器板离线"},
                new String[]{"139326","加湿器排水报警"},
                new String[]{"139303","室内温度高报警"},
                new String[]{"139306","室内加湿传感器报警"},
                new String[]{"139302","室内温度低报警"},
                new String[]{"139307","室内温度传感器报警"},
                new String[]{"139308","进风传感器1报警"},
                new String[]{"139309","进风传感器2报警"},
                new String[]{"139304","进口温度高报警"},
                new String[]{"139300","湿度低报警"},
                new String[]{"139316","低压报警"},
                new String[]{"139305","出口温度高报警"},
                new String[]{"139310","出口传感器1报警"},
                new String[]{"139311","出口传感器2报警"},
                new String[]{"139320","工况不一致报警"},
                new String[]{"139299","密码错误报警"},
                new String[]{"139318","风压报警"}
        };
    }

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

    @Test
    public void testCall(){

        String template = "CALL uspCreateAlertTemplateRule(\n" +
                "                50,\n" +
                "                %s, '%s', 1, 1,\n" +
                "                69, %s, 1, 10, 30, 1,\n" +
                "                @code, @message,\n" +
                "                @id\n" +
                "        );";
        for (String[] obj :
                alertData) {
            StringBuffer content = new StringBuffer();
            String name = obj[2].replaceAll("\\d+", "").replace("第路", "");
            if (name.contains("越值")){
                content.append("高");
            }else if (name.contains("欠值")){
                content.append("低");
            }
            if (name.contains("温度")){
                content.append("温");
            }else if(name.contains("湿度")){
                content.append("湿");
            }
            content.append("告警");
            String sql = String.format(template, obj[0], content, "10001");
            System.out.println(sql);
        }
    }
    @Test
    public void testCall1(){
        String template = "CALL uspCreateAlertTemplateRule(\n" +
                "                51,\n" +
                "                %s, '%s', 1, 1,\n" +
                "                69, %s, 1, 10, 30, 1,\n" +
                "                @code, @message,\n" +
                "                @id\n" +
                "        );";
        for (String[] obj :
                alertData) {
            StringBuffer content = new StringBuffer();
            content.append(obj[1]);
            String sql = String.format(template, obj[0], content, "10001");
            System.out.println(sql);
        }
    }
    @Test
    public void testPath(){
        String property = System.getProperty("java.library.path");
        System.out.println(property);
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


//1.tcp同时能连多少个
//2.在1的情况下，平均分10个指标测试每个指标的平均响应速度，最快速度，最慢速度
//3.单个tcp连接时，正常收发的最小发送间隔时间
    @Test
    public void testTcp(){
        try {

            while (true){
                Socket socket = new Socket("192.168.7.212", 502);
                socket.setSoTimeout(3000);
                OutputStream out = socket.getOutputStream();
                InputStream in = socket.getInputStream();
//            String command = "00 00 00 00 00 06 00 03 00 00 00 08";
                byte[] sendCommand = {0x00, 0x00, 0x00, 0x00, 0x00, 0x06, 0x04, 0x03, 0x00, 0x00, 0x00, 0x08};
                out.write(sendCommand);
                out.flush();

                byte[] bytes = new byte[4096];
                int len = in.read(bytes);
                System.out.println(len);

                out.close();
                in.close();
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
