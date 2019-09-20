package com.hk.base.util;

import com.hk.freemarker.dcim.entity.temp.Pdu;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by LuHj on 2018/10/15.
 */
public class FileUtilsTest {

    @Test
    public void getFolderNameTest() {
        for (int i = 1; i < 13; i++) {
            String path = "E:\\homkey_wsp\\软件实施项目汇总\\黄茅坪\\软件\\CD2000黄茅坪IDC-4楼冷通道" + i + "\\collector\\config";
            StringBuffer context = new StringBuffer();
            FileUtils.getFolderName(path).stream().forEach(s -> {
                String[] str = s.split("#");
                switch (str[0]) {
                    case "CAEMH":
                        str[0] = "环境主机";
                        break;
                    case "CRAC":
                        str[0] = "空调";
                        break;
                    case "PDC":
                        str[0] = "配电柜";
                        break;
                    case "Ubit":
                        str[0] = "U位";
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                //            System.out.println(Arrays.toString(str).replaceAll(",", "#").replace("[", "").replace("]", "").trim());
                context.append(str[0] + "#" + str[1] + "#" + str[2] + "\n");
            });
            String fileName = "E:\\homkey_wsp\\软件实施项目汇总\\黄茅坪\\通道" + i + "设备deviceId表.txt";
            try {
                FileUtils.createFile(fileName, context.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void test() {
        String tongdao = "7";
        String path = "E:\\homkey_wsp\\软件实施项目汇总\\黄茅坪\\软件\\CD2000黄茅坪IDC-4楼冷通道" + tongdao + "\\collector\\config";
        DeviceStrHandle deviceStrHandle = new DeviceStrHandle();
        List<String> list = FileUtils.scanFiles(path);
        list.stream().forEach(temp -> {
//            System.out.println(temp);
            FileUtils.readFileWithLine(temp, deviceStrHandle);
        });

        System.out.println("===============");
        StringBuffer sb = new StringBuffer();
        int index = 0;
        sb.append("#环境主机\r\n");
        for (String temp : DeviceStrHandle.caemhList) {
            int id = ++index;
            String[] array = temp.split("=");
            sb.append("# ip:" + array[0] + "\r\n");
            sb.append(array[1] + "=" + id + "\r\n");
            System.out.println(temp + "=" + id);
        }
        System.out.println("#空调+8");
        sb.append("#空调+8\r\n");
        index = 8;
        for (String temp : DeviceStrHandle.cracList) {
            int id = ++index;
            String[] array = temp.split("=");
            sb.append("# ip:" + array[0] + "\r\n");
            sb.append(array[1] + "=" + id + "\r\n");
            System.out.println(temp + "=" + id);
        }
        System.out.println("#pdc+16");
        sb.append("#pdc+16\r\n");
        index = 16;
        for (String temp : DeviceStrHandle.pdcList) {
            int id = ++index;
            String[] array = temp.split("=");
            sb.append("# ip:" + array[0] + "\r\n");
            sb.append(array[1] + "=" + id + "\r\n");
            System.out.println(temp + "=" + id);
        }
        System.out.println("#u+32");
        sb.append("#u+32\r\n");
        index = 32;
        for (String temp : DeviceStrHandle.ubitList) {
            int id = ++index;
            String[] array = temp.split("=");
            sb.append("# ip:" + array[0] + "\r\n");
            sb.append(array[1] + "=" + id + "\r\n");
            System.out.println(temp + "=" + id);
        }

        File devicemap = new File(path + "\\devicemap.properties");
        FileUtils.write(devicemap, sb.toString());

        File serialport = new File(path + "\\serialport.properties");
        String confStr = "appName=SerialPortPassageway" + tongdao + "\n" +
                "portName=/dev/ttyUSB-static-0\n" +
                "timeout=2000\n" +
                "baudrate=9600\n" +
                "databit=8\n" +
                "stopbit=1\n" +
                "parity=0\n" +
                "delaytime=1000\n";
        FileUtils.write(serialport, confStr);

    }

    @Test
    public void testLg() {
        String index = "14";
        String basePath = "E:\\homkey_wsp\\软件实施项目汇总\\黄茅坪\\20190612_因为日志数据量需要升级软件\\黄茅坪实施项目对接\\temp";
        boolean isChangeIP = false;
        String templateTaskPath = "E:\\homkey_wsp\\软件实施项目汇总\\黄茅坪\\20190612_因为日志数据量需要升级软件\\黄茅坪实施项目对接\\44个通道配置文件\\黄茅坪402机房通道01\\collector\\config\\tasks.xml";
        String templateTaskContext = FileUtils.readFileToString(templateTaskPath);
        List<String> list = FileUtils.scanFiles(basePath);
//        System.out.println();
        list.stream().forEach(temp -> {
            final String emhHost = "192.168.13.22";
            final String pdcHost = "192.168.13.24";
            final String uBitHost = "192.168.13.25";
            final String cracHost = "192.168.13.26";
            System.out.println(temp);
            // isState
            if (temp.indexOf("DeviceDefines.xml") > 0) {
                StringBuffer context = new StringBuffer();
                FileUtils.readFileWithLine(temp, new IHandleLineString() {
                    @Override
                    public void handle(String filePath, String str) {
                        context.append(str);
                        context.append(System.getProperty("line.separator"));
                        if (str.toLowerCase().indexOf("<name>") > 0 && str.toLowerCase().indexOf("state") > 0) {
                            context.append("<isState>true</isState>");
                            context.append(System.getProperty("line.separator"));
                        }
                    }
                });
                FileUtils.write(new File(temp), context.toString(), false);
            }
            if (temp.indexOf("tasks.xml") > 0) {
                FileUtils.write(temp, templateTaskContext, false);
            }

            if (isChangeIP) {
                // 改环境主机ip
                if (temp.indexOf("CAEMH#01#") > 0 && temp.indexOf("commands.xml") > 0) {
                    StringBuffer context = new StringBuffer();
                    FileUtils.readFileWithLine(temp, new IHandleLineString() {
                        @Override
                        public void handle(String filePath, String str) {
                            if (str.indexOf("</destinationHost>") > 0) {
                                str = "<destinationHost>" + emhHost + "</destinationHost>";
                            }
                            context.append(str);
                            context.append(System.getProperty("line.separator"));
                        }
                    });
                    FileUtils.write(new File(temp), context.toString(), false);
                }

                if (temp.indexOf("PDC") > 0 && temp.indexOf("commands.xml") > 0) {
                    StringBuffer context = new StringBuffer();
                    FileUtils.readFileWithLine(temp, new IHandleLineString() {
                        @Override
                        public void handle(String filePath, String str) {
                            if (str.indexOf("</destinationHost>") > 0) {
                                str = "<destinationHost>" + pdcHost + "</destinationHost>";
                            }
                            context.append(str);
                            context.append(System.getProperty("line.separator"));
                        }
                    });
                    FileUtils.write(new File(temp), context.toString(), false);
                }

                if (temp.indexOf("CRAC") > 0 && temp.indexOf("commands.xml") > 0) {
                    StringBuffer context = new StringBuffer();
                    FileUtils.readFileWithLine(temp, new IHandleLineString() {
                        @Override
                        public void handle(String filePath, String str) {
                            if (str.indexOf("</destinationHost>") > 0) {
                                str = "<destinationHost>" + cracHost + "</destinationHost>";
                            }
                            context.append(str);
                            context.append(System.getProperty("line.separator"));
                        }
                    });
                    FileUtils.write(new File(temp), context.toString(), false);
                }

                if (temp.indexOf("Ubit") > 0 && temp.indexOf("uBitCommands.xml") > 0) {
                    StringBuffer context = new StringBuffer();
                    FileUtils.readFileWithLine(temp, new IHandleLineString() {
                        @Override
                        public void handle(String filePath, String str) {
                            if (str.indexOf("</destinationHost>") > 0) {
                                str = "<destinationHost>" + uBitHost + "</destinationHost>";
                            }
                            context.append(str);
                            context.append(System.getProperty("line.separator"));
                        }
                    });
                    FileUtils.write(new File(temp), context.toString(), false);
                }
            }
        });
        if (isChangeIP) {
            Map<String, String> replaceMap = new HashMap<>();
            replaceMap.put("192.168.82", "192.168.13");
            FileUtils.replaceFile(basePath + "\\monitor\\config\\device_descript.xml", replaceMap);
        }
    }

    @Test
    public void testGetDeviceId() {
        List<String> list = FileUtils.scanFolders("E:\\homkey_wsp\\软件实施项目汇总\\黄茅坪\\20190612_因为日志数据量需要升级软件\\黄茅坪实施项目对接\\44个通道配置文件");
//        list.stream().forEach(temp -> {});
        String template = "%s : %s";
//        .filter(temp -> temp.contains("402"))
        list.stream().forEach(temp -> {
            StringBuffer stringBuffer = new StringBuffer();
            String name = temp.substring(temp.lastIndexOf("\\") + 1, temp.length());
            System.out.println(name);
            List<String> deviceFolders = FileUtils.scanFolders(temp + "\\collector\\config");
            for (String folder : deviceFolders) {
                String[] result = folder.split("#");
                stringBuffer.append(String.format(template, result[0].substring(result[0].lastIndexOf("\\") + 1, result[0].length()), result[2]) + "\n");
                System.out.println(String.format(template, result[0].substring(result[0].lastIndexOf("\\") + 1, result[0].length()), result[2]));
            }
            try {
                FileUtils.createFile("E:\\homkey_wsp\\软件实施项目汇总\\黄茅坪\\20190612_因为日志数据量需要升级软件\\黄茅坪实施项目对接\\DeviceIds\\"+name + ".txt", stringBuffer.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
    @Test
    public void testWW(){
        Pdu pdu1 = Pdu.builder().index("1").build();
        Pdu pdu2 = Pdu.builder().index("1").build();
        System.out.println("==:" + (pdu1 == pdu2 ));
        System.out.println("hashCode:" + (pdu1.hashCode() == pdu2.hashCode()));
        System.out.println("equals:" + (pdu1.equals(pdu2)));
    }

    @Test
    public void test3() throws Exception{
        final Lock lock=new ReentrantLock();
        lock.lock();
        Thread.sleep(1000);
        Thread t1=new Thread(new Runnable(){
            @Override
            public void run() {
                lock.lock();
                System.out.println(Thread.currentThread().getName()+" interrupted.");
            }
        });
        t1.start();
        Thread.sleep(1000);
        t1.interrupt();
        Thread.sleep(10000);
    }
    @Test
    public void test4() throws Exception{
        final Lock lock=new ReentrantLock();
        lock.lock();
        Thread.sleep(1000);
        Thread t1=new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    lock.lockInterruptibly();
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName()+" interrupted.");
                }
            }
        });
        t1.start();
        Thread.sleep(1000);
        t1.interrupt();
        Thread.sleep(10000);
    }

    @Test
    public void test5() throws Exception{
        final Lock lock=new ReentrantLock();
        Thread t1=new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    lock.lockInterruptibly();
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName()+" interrupted.");
                }
            }
        });
        t1.start();
        t1.interrupt();
        Thread.sleep(10000);
    }
}