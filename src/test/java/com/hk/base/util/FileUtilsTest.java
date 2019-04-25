package com.hk.base.util;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

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
                FileUtils.creatFile(fileName,context.toString());
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

}