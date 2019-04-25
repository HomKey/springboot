package com.hk.base.util;

import com.hk.freemarker.entity.DeviceDefine;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LuHj on 2018/10/23.
 */
public class HmpTest {

    @Test
    public void testCollector(){
//        {cnname}#{conn}#{busid}#



    }

    /**
     * 先读取空调数据
     * deviceid host port busid
     * collector操作
     * 1.commands.xml
     * 替换 deviceid host port busid
     * 2.DeviceDefines.xml
     * 替换 deviceid
     * 3.alertDefines.xml
     * 替换host busid deviceid
     * 4.uidataconfig.xml
     * 替换deviceid
     */
    @Test
    public void testCrv() {
//        DeviceDefines devid busid
//        commands devid busid name ip port
        String tongdao = "1";
        String collectorPath = "E:\\homkey_wsp\\软件实施项目汇总\\黄茅坪\\软件\\CD2000黄茅坪IDC-4楼冷通道" + tongdao + "\\collector\\config";
        String monitorPath = "E:\\homkey_wsp\\软件实施项目汇总\\黄茅坪\\软件\\CD2000黄茅坪IDC-4楼冷通道" + tongdao + "\\monitor\\config\\ac\\uidataconfig.xml";
        String templatePath = "C:\\Users\\tandewei\\Desktop\\CD2000配置生成工具\\CD2000_Output\\黄茅坪\\collector\\config";
        String templatePahtMonitor = "C:\\Users\\tandewei\\Desktop\\CD2000配置生成工具\\CD2000_Output\\黄茅坪\\monitor\\config\\ac\\uidataconfig.xml";

        Map<String, String> deviceMap = new HashMap<>();
        Map<String, String> deviceidRepalce = new HashMap<>();
        FileUtils.getFolderName(collectorPath).stream().filter(s -> s.contains("CRAC")).forEach(ac -> {
            String[] array = ac.split("#");
            deviceMap.put(array[0] + "#" + array[1], array[2]);
        });
        FileUtils.getFolderName(templatePath).stream().filter(s -> s.contains("CRAC")).forEach(ac -> {
            String[] array = ac.split("#");
            String deviceid = deviceMap.get(array[0] + "#" + array[1]);
            deviceidRepalce.put(array[1], deviceid);
            if (deviceid != null && !deviceid.equals("")){
                // 替换文件名
                File file = new File(templatePath + File.separator + ac);
                file.renameTo(new File(templatePath + File.separator + ac.replace(array[1], deviceid)));
            }
        });
        FileUtils.replaceFile(templatePahtMonitor,deviceMap);
    }


    /**
     * pdc
     *
     * @throws Exception
     */
    @Test
    public void testPdc() throws Exception {
        String tongdao = "1";
        String path = "E:\\homkey_wsp\\软件实施项目汇总\\黄茅坪\\软件\\CD2000黄茅坪IDC-4楼冷通道" + tongdao + "\\collector\\config";
        String fileName = "E:\\homkey_wsp\\软件实施项目汇总\\黄茅坪\\软件\\CD2000黄茅坪IDC-4楼冷通道1\\collector\\config\\PDC#01#73c6021a-6113-4dde-9db6-825a74b226de";
        GetDeviceInfoHandle handle = new GetDeviceInfoHandle();
        List<String> list = FileUtils.scanFiles(fileName);
        list.stream().forEach(temp -> {
            FileUtils.readFileWithLine(temp, handle);
        });
        Map<String, String> allDatas = new HashMap<>();
        for (Map.Entry<String, String> entry : POIUtils.readFileHmp().entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
            allDatas.put(entry.getKey().trim(), entry.getValue().trim());
        }
        for (String key :
                GetDeviceInfoHandle.datas.keySet()) {
            if (allDatas.get(key) != null && !allDatas.get(key).equals("") && !allDatas.get(key).equals("null")) {
                GetDeviceInfoHandle.datas.put(key, allDatas.get(key));
            }
        }

        POIUtils.writeExcel("E:\\homkey_wsp\\软件实施项目汇总\\黄茅坪\\PDC.xlsx", GetDeviceInfoHandle.datas, new XSSFWorkbook());
    }

    @Test
    public void outputExcelAC() throws IOException {
        String[] defines = new String[]{
                "67|软关机状态标志位|CRAC.State.SoftShutDown",
                "69|本地关机标志位|CRAC.State.LocalShutDown",
                "70|监控关机标志位|CRAC.State.MonitorShutDown",
                "71|远程关机标志位|CRAC.State.RemoteShutDown",
                "81|制冷标志位|CRAC.State.Refrig",
                "82|加热标志位|CRAC.State.Heat",
                "83|加湿标志位|CRAC.State.Humid",
                "84|除湿标志位|CRAC.State.Dehumid",
                "73|风机1状态|CRAC.State.Fan1",
                "74|风机2状态|CRAC.State.Fan2",
                "75|风机3状态|CRAC.State.Fan3",
                "76|风机4状态|CRAC.State.Fan4",
                "12|冷凝水泵输出|CRAC.State.PumpOutput",
                "13|压缩机输出|CRAC.State.CompressorOutput",
                "14|电加热输出|CRAC.State.HeaterOutput",
                "15|风机输出|CRAC.State.FanOutput",
                "16|加湿器输出|CRAC.State.HumidOutput",
                "17|公共告警输出 |CRAC.State.CommonAlarmOutput",
                "19|液路电磁阀输出|CRAC.State.LiquidSolenoidOutput",
                "24|高压告警|CRAC.Alarm.HighPressure",
                "25|低压告警|CRAC.Alarm.LowPressure",
                "26|高压异常告警|CRAC.Alarm.HighPressure.Abnormal",
                "27|排气高温告警|CRAC.Alarm.Exhaust.Temperature.High",
                "28|排气过热度低告警 |CRAC.Alarm.Exhaust.Temperature.Over",
                "29|回风高温告警|CRAC.Alert.ReturnAir.Temperature.Over",
                "30|送风低温告警|CRAC.Alert.OutAir.Temperature.Less",
                "31|送风高温告警|CRAC.Alert.OutAir.Temperature.Over",
                "32|回风高湿告警 |CRAC.Alert.ReturnAir.Humidity.Over",
                "33|回风低湿告警|CRAC.Alert.ReturnAir.Humidity.Less",
                "34|高压锁定告警|CRAC.Alert.Pressure.High.Lock",
                "35|低压锁定告警|CRAC.Alert.Pressure.Low.Lock",
                "36|排气高温锁定告警|CRAC.Alert.Exhaust.Temperature.High.Lock",
                "37|排气过热度低锁定告警|CRAC.Alert.Exhaust.Temperature.Over.LowLock",
                "38|电源丢失告警|CRAC.Alert.Power.Loss",
                "39|电源过压告警|CRAC.Alert.Power.Voltage.Over",
                "40|电源欠压告警|CRAC.Alert.Power.Voltage.Less",
                "41|电源缺相告警|CRAC.Alert.Power.Phase.Miss",
                "42|地板溢水告警|CRAC.Alarm.Flood",
                "43|高水位告警|CRAC.Alarm.WaterLevel.High",
                "44|滤网堵塞告警|CRAC.Alarm.FilterClog",
                "45|滤网维护提醒|CRAC.Alarm.Filter.Maintenance",
                "46|气流丢失告警|CRAC.Alarm.Air.Loss",
                "47|低压传感器锁定|CRAC.Lock.Sensor.LowPressure",
                "51|回风温度传感器故障|CRAC.Alarm.Sensor.ReturnAi.Temperature",
                "52|回风湿度传感器故障|CRAC.Alarm.Sensor.ReturnAir.Humidity",
                "53|气流温差传感器故障|CRAC.Alarm.Sensor.AirDifference.Temperature",
                "54|送风温度传感器故障|CRAC.Alarm.Sensor.OutAir.Temperature",
                "55|远程温度传感器故障|CRAC.Alarm.Sensor.Remote.Temperature",
                "56|高压压力传感器故障|CRAC.Alarm.Sensor.HighPressure",
                "85|电加热故障告警|CRAC.Alarm.ElectricHeating",
                "86|排气温度传感器故障|CRAC.Alarm.Sensor.ExhaustTemperature",
                "87|风机/电源故障|CRAC.Alarm.Fan.Power",
                "88|EEV通信故障|CRAC.Alarm.EEV.Communication",
                "89|未选择制冷剂告警|CRAC.Alarm.NotSelectRefrigerant",
                "90|制冷剂不足告警 |CRAC.Alarm.Refrigerant.Inadequate",
                "91|吸气温度传感器故障|CRAC.Alarm.Sensor.SuctionTemperature",
                "92|低压压力传感器故障|CRAC.Alarm.Sensor.LowPressure",
                "93|压缩机驱动通信故障|CRAC.Alarm.Compressor.DriveCommunication",
                "94|压缩机驱动故障|CRAC.Alarm.Compressor.Drive",
                "95|压缩机散热器过温|CRAC.Alarm.Compressor.RadiatorOver",
                "96|压缩机过流保护|CRAC.Alarm.Compressor.Overcurrent.Protection",
                "97|压缩机缺相保护|CRAC.Alarm.Compressor.Phase.Protection",
                "98|压缩机母线电压异常|CRAC.Alarm.Compressor.BusVoltage",
                "99|加湿器故障告警|CRAC.Alarm.Humidifier",
                "1|送风温度测量值|CRAC.OutAir.Temperature",
                "6|回风温度测量值|CRAC.ReturnAir.Temperature",
                "10|回风湿度测量值|CRAC.ReturnAir.Humidity",
                "24|A相电压|CRAC.A.Voltage",
                "25|B相电压|CRAC.B.Voltage",
                "26|C相电压|CRAC.C.Voltage",
                "27|电源频率|CRAC.Frequency",
                "28|机组运行状态|CRAC.Switch.State|0:关机 1:运行 2:保留(备机) 3:锁定",
                "130|远程温度1测量值|CRAC.Remote.1.Temperature",
                "131|远程温度2测量值|CRAC.Remote.2.Temperature",
                "132|远程温度3测量值|CRAC.Remote.3.Temperature",
                "133|远程温度4测量值|CRAC.Remote.4.Temperature",
                "134|远程温度5测量值|CRAC.Remote.5.Temperature",
                "135|远程温度6测量值|CRAC.Remote.6.Temperature",
                "136|远程温度7测量值|CRAC.Remote.7.Temperature",
                "137|远程温度8测量值|CRAC.Remote.8.Temperature",
                "138|远程温度9测量值|CRAC.Remote.9.Temperature",
                "139|远程温度10测量值|CRAC.Remote.10.Temperature",
                "140|远程平均温度测量值|CRAC.Remote.Average.Temperature",
                "113|压缩机容量|CRAC.Compressor.Capacity",
                "116|风机转速|CRAC.Fan.Speed"
        };

        List<String> list = new ArrayList<>();
        for (String temp :
                defines) {
            list.add(temp);
        }

        POIUtils.writeExcel("E:\\homkey_wsp\\软件实施项目汇总\\黄茅坪\\AC_list.xlsx", list, new XSSFWorkbook());
    }

    @Test
    public void printSensorName() {
        String fileName = "C:\\Users\\tandewei\\Desktop\\CD2000配置生成工具\\CD2000_Collect\\Device\\CRAC\\EmersonCRV\\DeviceDefines.xml";
        FileUtils.readFileWithLine(fileName, new IHandleLineString() {
            @Override
            public void handle(String filePath, String str) {
                if (str.contains("name")) {
                    String name = str.replace("<name>", "").replace("</name>", "").trim();
                    System.out.println(name);
                }

            }
        });
    }

    @Test
    public void printAlertDefine() {
        FileUtils.readFileWithLine("C:\\Users\\tandewei\\Desktop\\CD2000配置生成工具\\CD2000_Collect\\Device\\CRAC\\EmersonCRV\\DeviceDefines.xml", new IHandleLineString() {
            @Override
            public void handle(String filePath, String str) {
                if (str.contains("<name>")) {
                    String name = str.replace("<name>", "").replace("</name>", "").trim();
                    StringBuffer sb = new StringBuffer();
                    sb.append("<AlertDefine>\n" +
                            "    <id>10003</id>\n" +
                            "    <title>{cnname}#{conn}#{busid}#描述</title>\n" +
                            "    <category>4</category>\n" +
                            "    <level>1</level>\n" +
                            "    <descriptionPattern>描述</descriptionPattern>\n" +
                            "    <rule class=\"Equal\">\n" +
                            "      <name>名称</name>\n" +
                            "      <limit>1</limit>\n" +
                            "      <sensorValue class=\"SimpleSensorValue\">\n" +
                            "        <deviceId>{devid}</deviceId>\n" +
                            "        <propertyPath>" + name + "</propertyPath>\n" +
                            "      </sensorValue>\n" +
                            "    </rule>\n" +
                            "    <enable>true</enable>\n" +
                            "  </AlertDefine>");
                    System.out.println(sb.toString());
                }
            }
        });
    }

    @Test
    public void createSensorDefine() {
        String[] define = new String[]{
                "46|气流丢失告警|CRAC.Alarm.Air.Loss",
                "47|低压传感器锁定|CRAC.Lock.Sensor.LowPressure",
                "51|回风温度传感器故障|CRAC.Alarm.Sensor.ReturnAi.Temperature",
                "52|回风湿度传感器故障|CRAC.Alarm.Sensor.ReturnAir.Humidity",
                "53|气流温差传感器故障|CRAC.Alarm.Sensor.AirDifference.Temperature",
                "54|送风温度传感器故障|CRAC.Alarm.Sensor.OutAir.Temperature",
                "55|远程温度传感器故障|CRAC.Alarm.Sensor.Remote.Temperature",
                "56|高压压力传感器故障|CRAC.Alarm.Sensor.HighPressure",
                "57|电加热故障告警|CRAC.Alarm.ElectricHeating",
                "86|排气温度传感器故障|CRAC.Alarm.Sensor.ExhaustTemperature",
                "87|风机/电源故障|CRAC.Alarm.Fan.Power",
                "88|EEV通信故障|CRAC.Alarm.EEV.Communication",
                "89|未选择制冷剂告警|CRAC.Alarm.NotSelectRefrigerant",
                "90|制冷剂不足告警|CRAC.Alarm.Refrigerant.Inadequate",
                "91|吸气温度传感器故障|CRAC.Alarm.Sensor.SuctionTemperature",
                "92|低压压力传感器故障|CRAC.Alarm.Sensor.LowPressure",
                "93|压缩机驱动通信故障|CRAC.Alarm.Compressor.DriveCommunication",
                "94|压缩机驱动故障|CRAC.Alarm.Compressor.Drive",
                "95|压缩机散热器过温|CRAC.Alarm.Compressor.RadiatorOver"
        };
        int index = 10027;
        for (String temp :
                define) {
            String[] conf = temp.split("\\|");
            System.out.println("<AlertDefine>\n" +
                    "    <id>" + index + "</id>\n" +
                    "    <title>{cnname}#{conn}#{busid}#" + conf[1] + "</title>\n" +
                    "    <category>4</category>\n" +
                    "    <level>1</level>\n" +
                    "    <descriptionPattern>" + conf[1] + "</descriptionPattern>\n" +
                    "    <rule class=\"Equal\">\n" +
                    "      <name>" + conf[1] + "</name>\n" +
                    "      <limit>1</limit>\n" +
                    "      <sensorValue class=\"SimpleSensorValue\">\n" +
                    "        <deviceId>{devid}</deviceId>\n" +
                    "        <propertyPath>" + conf[2] + "</propertyPath>\n" +
                    "      </sensorValue>\n" +
                    "    </rule>\n" +
                    "    <enable>true</enable>\n" +
                    "  </AlertDefine>");
            index++;
        }


    }
}
