package com.hk.keydak.dcim;

import com.hk.base.util.FileUtils;
import com.hk.base.util.IHandleLineString;
import com.hk.base.util.POIUtils;
import com.hk.translate.ITranslate;
import com.hk.translate.service.SensorDataService;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.*;
import java.math.BigDecimal;
import java.util.regex.Pattern;

public class ConfigGenerate {

    @Test
    public void test111(){
        String temp = "                <SimpleObjectPropertyDefine>\n" +
                "                    <deviceId>{{DEVICE_ID}}</deviceId>\n" +
                "                    <sensorKeys>\n" +
                "                        <SimpleEntry>\n" +
                "                            <constant>true</constant>\n" +
                "                            <name>no</name>\n" +
                "                            <sensorId>%s</sensorId>\n" +
                "                        </SimpleEntry>\n" +
                "                        <SimpleEntry>\n" +
                "                            <constant>true</constant>\n" +
                "                            <name>description</name>\n" +
                "                            <sensorId>单路A1</sensorId>\n" +
                "                        </SimpleEntry>\n" +
                "                        <SimpleEntry>\n" +
                "                            <constant>true</constant>\n" +
                "                            <name>displayName</name>\n" +
                "                            <sensorId>A-1</sensorId>\n" +
                "                        </SimpleEntry>\n" +
                "                        <SimpleEntry>\n" +
                "                            <constant>false</constant>\n" +
                "                            <name>current</name>\n" +
                "                            <sensorId>PDC.C1.B1.Current</sensorId>\n" +
                "                        </SimpleEntry>\n" +
                "                        <SimpleEntry>\n" +
                "                            <constant>false</constant>\n" +
                "                            <name>voltage</name>\n" +
                "                            <sensorId>PDC.C1.B1.Voltage</sensorId>\n" +
                "                        </SimpleEntry>\n" +
                "                        <SimpleEntry>\n" +
                "                            <constant>false</constant>\n" +
                "                            <name>activePower</name>\n" +
                "                            <sensorId>PDC.C1.B1.ActivePower</sensorId>\n" +
                "                        </SimpleEntry>\n" +
                "                        <SimpleEntry>\n" +
                "                            <constant>false</constant>\n" +
                "                            <name>activeEnergy</name>\n" +
                "                            <sensorId>PDC.C1.B1.ActiveEnergy</sensorId>\n" +
                "                        </SimpleEntry>\n" +
                "                        <SimpleEntry>\n" +
                "                            <constant>false</constant>\n" +
                "                            <name>switch</name>\n" +
                "                            <sensorId>PDC.C1.B1.SwitchState</sensorId>\n" +
                "                        </SimpleEntry>\n" +
                "                    </sensorKeys>\n" +
                "                </SimpleObjectPropertyDefine>";
    }


    // 电流过载 371 372
    // 开关故障 373 374
    //A面主路开关故障
    //A面防雷器开关故障
    //A面备路开关故障
    //A面主路跳闸
    //A面备路跳闸
    //A面备路防雷器开关故障
    //二段电流过载 375 376
    @Test
    public void test() {
        int b = 63;
        int start = 1269;
        String template = "('134', 'PDC.C%s.B%s.SD.Fault', '%s面分路%sSD故障', '', '%s', '0', NULL, '1', '1', '0', '1', '0', '0', '92', NULL, NULL, '%s'),";

        String[] templateArr = new String[]{
                "('134', 'PDC.C%s.Switch.Fault', '%s面主路开关故障', '', '%s', '0', NULL, '1', '1', '0', '1', '0', '0', '92', NULL, NULL, '%s'),",
                "('134', 'PDC.C%s.FangLei.Switch.Fault', '%s面防雷器开关故障', '', '%s', '0', NULL, '1', '1', '0', '1', '0', '0', '92', NULL, NULL, '%s'),",
                "('134', 'PDC.C%s.Backup.Switch.Fault', '%s面备路开关故障', '', '%s', '0', NULL, '1', '1', '0', '1', '0', '0', '92', NULL, NULL, '%s'),",
                "('134', 'PDC.C%s.Trip', '%s面主路跳闸', '', '%s', '0', NULL, '1', '1', '0', '1', '0', '0', '92', NULL, NULL, '%s'),",
                "('134', 'PDC.C%s.Backup.Trip', '%s面备路跳闸', '', '%s', '0', NULL, '1', '1', '0', '1', '0', '0', '92', NULL, NULL, '%s'),",
                "('134', 'PDC.C%s.Backup.FangLei.Switch.Fault', '%s面备路防雷器开关故障', '', '%s', '0', NULL, '1', '1', '0', '1', '0', '0', '92', NULL, NULL, '%s'),"
        };
        for (int i = 382; i <= 383; i++) {
            for (int j = 1; j <= b; j++) {
                String format = String.format(template, getFenzhi(i), j, getFenzhi2(i), j, start + j - 1, i);
                System.out.println(format);
            }
//            for (int j = 0; j < templateArr.length; j++) {
//                String format2 = String.format(templateArr[j], getFenzhi(i), getFenzhi2(i), start + 63 + j, i);
//                System.out.println(format2);
//            }
            start = 1339;
        }
    }

    private String getFenzhi(int i) {
        return i % 2 == 0 ? "1" : "2";
    }

    private String getFenzhi2(int i) {
        return i % 2 == 0 ? "A" : "B";
    }


    @Test
    public void testFile() throws FileNotFoundException {
        FileUtils.readFileWithLine("E:\\wsp\\wsp_intellij\\springboot\\src\\main\\resources\\data\\nnga2\\temp2", (filePath, str) -> {
            String[] arr = str.split(",");
            id = print(id, "134", arr[2], arr[0], Integer.parseInt(arr[1]) + 4600, 406);
        });
    }

    private static int id = 150011;
    private static final String templateParent = "INSERT INTO `monitor`.`n_SensorDefine` (`id`, `deviceModelId`, `name`, `displayName`, `description`, `registerIndex`, `scale`, `unit`, `isState`, `isBit`, `bitOrder`, `dividedBy`, `start`, `len`, `classId`, `parentId`, `attributeName`, `defaultCommandId`) VALUES ('%s', '%s', '%s', '%s', 'null', '0', '1', NULL, '0', '0', '0', '0', NULL, NULL, '82', NULL, NULL, '%s');";
    private static final String templateH = "INSERT INTO `monitor`.`n_SensorDefine` (`id`, `deviceModelId`, `name`, `displayName`, `description`, `registerIndex`, `scale`, `unit`, `isState`, `isBit`, `bitOrder`, `dividedBy`, `start`, `len`, `classId`, `parentId`, `attributeName`, `defaultCommandId`) VALUES ('%s', '%s', '%s', '%s', 'null', '%s', '1', NULL, '0', '0', '0', '100', NULL, NULL, '92', '%s', 'highPropertyDefines', '%s');";
    private static final String templateL = "INSERT INTO `monitor`.`n_SensorDefine` (`id`, `deviceModelId`, `name`, `displayName`, `description`, `registerIndex`, `scale`, `unit`, `isState`, `isBit`, `bitOrder`, `dividedBy`, `start`, `len`, `classId`, `parentId`, `attributeName`, `defaultCommandId`) VALUES ('%s', '%s', '%s', '%s', 'null', '%s', '1', NULL, '0', '0', '0', '100', NULL, NULL, '92', '%s', 'lowPropertyDefines', '%s');";

    private int print(int id, String deviceModelId, String name, String displayName, int index, int commandId) {
        index = index + 100;
        name = name.replace(".C1.", ".C2.");
//        displayName = displayName.replace("A面","B面");
        String parent = String.format(templateParent, id, deviceModelId, name, displayName, commandId);
        System.out.println(parent);
        String h = String.format(templateH, id + 1, deviceModelId, name + "_h", name + "_h", index, id, commandId);
        System.out.println(h);
        String l = String.format(templateL, id + 2, deviceModelId, name + "_l", name + "_l", index + 1, id, commandId);
        System.out.println(l);
        return id + 3;
    }

    @Test
    public void testFen() {
        int index = 2700;
        for (int i = 1; i <= 63; i++) {
            id = print(id, "134", "PDC.C2.B" + i + ".Voltage", "B面分路" + i + "电压", index, 404);
            index += 2;
        }
    }

    @Test
    public void test11() {
        Integer a = Integer.MAX_VALUE;
        System.out.println(a);

        BigDecimal h = new BigDecimal(0x7fff);
        BigDecimal l = new BigDecimal(0xffff);
        BigDecimal add = h.multiply(BigDecimal.valueOf(65536)).add(l);
        System.out.println(add);
    }

    @Test
    public void testJinXian() {
        String back = "    </propertyDefines>\n" +
                "</ComposePropertyDefine>";

        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.append(getJinFront(Jin.A)).append(getJinMid(Jin.A)).append(back).toString());
        stringBuffer.setLength(0);
        System.out.println(stringBuffer.append(getJinFront(Jin.B)).append(getJinMid(Jin.B)).append(back).toString());
    }

    private String getJinFront(Jin jin) {
        String template = "<ComposePropertyDefine>\n" +
                "    <name>%s</name>\n" +
                "    <propertyDefines>\n" +
                "        <ConstantProperty>\n" +
                "            <name>id</name>\n" +
                "            <value>%s</value>\n" +
                "        </ConstantProperty>\n";
        return String.format(template, jin.getValue(), jin.getValue());
    }
    private String getJinMid(Jin jin){
        String[][] arr = new String[][]{
                {"switchFault", "Switch.Fault", "A面主路开关故障"},
                {"switchState", "SwitchState", "A面主路开关状态"},
                {"trip", "Trip", "A面主路跳闸"},
                {"backupLineVoltageAB", "Backup.LineVoltage.AB", "A面备路AB线电压"},
                {"backupACTRatio", "Backup.A.CT.Ratio", "A面备路A相CT变比"},
                {"backupAPowerFactor", "Backup.A.PowerFactor", "A面备路A相功率因数"},
                {"backupAReactivePower", "Backup.A.ReactivePower", "A面备路A相无功功率"},
                {"backupAReactiveEnergy", "Backup.A.ReactiveEnergy", "A面备路A相无功电能"},
                {"backupAActivePower", "Backup.A.ActivePower", "A面备路A相有功功率"},
                {"backupAActiveEnergy", "Backup.A.ActiveEnergy", "A面备路A相有功电能"},
                {"backupAVoltage", "Backup.A.Voltage", "A面备路A相电压"},
                {"backupACurrent", "Backup.A.Current", "A面备路A相电流"},
                {"backupAApparentPower", "Backup.A.ApparentPower", "A面备路A相视在功率"},
                {"backupLineVoltageBC", "Backup.LineVoltage.BC", "A面备路BC线电压"},
                {"backupBCTRatio", "Backup.B.CT.Ratio", "A面备路B相CT变比"},
                {"backupBPowerFactor", "Backup.B.PowerFactor", "A面备路B相功率因数"},
                {"backupBReactivePower", "Backup.B.ReactivePower", "A面备路B相无功功率"},
                {"backupBReactiveEnergy", "Backup.B.ReactiveEnergy", "A面备路B相无功电能"},
                {"backupBActivePower", "Backup.B.ActivePower", "A面备路B相有功功率"},
                {"backupBActiveEnergy", "Backup.B.ActiveEnergy", "A面备路B相有功电能"},
                {"backupBVoltage", "Backup.B.Voltage", "A面备路B相电压"},
                {"backupBCurrent", "Backup.B.Current", "A面备路B相电流"},
                {"backupBApparentPower", "Backup.B.ApparentPower", "A面备路B相视在功率"},
                {"backupLineVoltageCA", "Backup.LineVoltage.CA", "A面备路CA线电压"},
                {"backupCCTRatio", "Backup.C.CT.Ratio", "A面备路C相CT变比"},
                {"backupCPowerFactor", "Backup.C.PowerFactor", "A面备路C相功率因数"},
                {"backupCReactivePower", "Backup.C.ReactivePower", "A面备路C相无功功率"},
                {"backupCReactiveEnergy", "Backup.C.ReactiveEnergy", "A面备路C相无功电能"},
                {"backupCActivePower", "Backup.C.ActivePower", "A面备路C相有功功率"},
                {"backupCActiveEnergy", "Backup.C.ActiveEnergy", "A面备路C相有功电能"},
                {"backupCVoltage", "Backup.C.Voltage", "A面备路C相电压"},
                {"backupCCurrent", "Backup.C.Current", "A面备路C相电流"},
                {"backupCApparentPower", "Backup.C.ApparentPower", "A面备路C相视在功率"},
                {"backupSwitchFault", "Backup.Switch.Fault", "A面备路开关故障"},
                {"backupSwitchState", "Backup.SwitchState", "A面备路开关状态"},
                {"backupPowerFactor", "Backup.PowerFactor", "A面备路总功率因数"},
                {"backupReactivePower", "Backup.ReactivePower", "A面备路总无功功率"},
                {"backupReactiveEnergy", "Backup.ReactiveEnergy", "A面备路总无功电能"},
                {"backupActivePower", "Backup.ActivePower", "A面备路总有功功率"},
                {"backupActiveEnergy", "Backup.ActiveEnergy", "A面备路总有功电能"},
                {"backupApparentPower", "Backup.ApparentPower", "A面备路总视在功率"},
                {"backupVoltageImbalanceRate", "Backup.Voltage.Imbalance.Rate", "A面备路电压三相不平衡度"},
                {"backupCurrentImbalanceRate", "Backup.Current.Imbalance.Rate", "A面备路电流三相不平衡度"},
                {"backupTrip", "Backup.Trip", "A面备路跳闸"},
                {"backupTripSwitchState", "Backup.Trip.SwitchState", "A面备路跳闸开关状态"},
                {"backupFangLeiSwitchFault", "Backup.FangLei.Switch.Fault", "A面备路防雷器开关故障"},
                {"backupFangLeiSwitchState", "Backup.FangLei.SwitchState", "A面备路防雷器开关状态"},
                {"backupFrequency", "Backup.Frequency", "A面备路频率"},
                {"backupVoltageImbalanceAlarm", "Backup.Voltage.Imbalance.Alarm", "A面电压三相不平衡报警"},
                {"voltageImbalanceAlarm", "Voltage.Imbalance.Alarm", "A面电压三相不平衡报警"},
                {"backupCurrentImbalanceAlarm", "Backup.Current.Imbalance.Alarm", "A面电流三相不平衡报警"},
                {"currentImbalanceAlarm", "Current.Imbalance.Alarm", "A面电流三相不平衡报警"},
                {"tripSwitchState", "Trip.SwitchState", "A面跳闸开关状态"},
                {"lineVoltageAB", "LineVoltage.AB", "A面进线AB线电压"},
                {"aCTRatio", "A.CT.Ratio", "A面进线A相CT变比"},
                {"aBackupCurrentOver2", "A.Backup.Current.Over.2", "A面进线A相二段电流过载"},
                {"aCurrentOver2", "A.Current.Over.2", "A面进线A相二段电流过载"},
                {"powerFactorAPhase", "A.PowerFactor", "A面进线A相功率因数"},
                {"aBackupPowerOver", "A.Backup.Power.Over", "A面进线A相功率过载"},
                {"aPowerOver", "A.Power.Over", "A面进线A相功率过载"},
                {"aReactivePower", "A.ReactivePower", "A面进线A相无功功率"},
                {"aReactiveEnergy", "A.ReactiveEnergy", "A面进线A相无功电能"},
                {"aActivePower", "A.ActivePower", "A面进线A相有功功率"},
                {"aActiveEnergy", "A.ActiveEnergy", "A面进线A相有功电能"},
                {"aVoltage", "A.Voltage", "A面进线A相电压"},
                {"aBackupLowVoltage", "A.Backup.LowVoltage", "A面进线A相电压欠电压"},
                {"aLowVoltage", "A.LowVoltage", "A面进线A相电压欠电压"},
                {"aBackupMissAppearance", "A.Backup.MissAppearance", "A面进线A相电压缺相"},
                {"aMissAppearance", "A.MissAppearance", "A面进线A相电压缺相"},
                {"aBackupOverVoltage", "A.Backup.OverVoltage", "A面进线A相电压过电压"},
                {"aOverVoltage", "A.OverVoltage", "A面进线A相电压过电压"},
                {"aCurrent", "A.Current", "A面进线A相电流"},
                {"aBackupCurrentOver", "A.Backup.Current.Over", "A面进线A相电流过载"},
                {"aCurrentOver", "A.Current.Over", "A面进线A相电流过载"},
                {"aApparentPower", "A.ApparentPower", "A面进线A相视在功率"},
                {"lineVoltageBC", "LineVoltage.BC", "A面进线BC线电压"},
                {"bCTRatio", "B.CT.Ratio", "A面进线B相CT变比"},
                {"bBackupCurrentOver2", "B.Backup.Current.Over.2", "A面进线B相二段电流过载"},
                {"bCurrentOver2", "B.Current.Over.2", "A面进线B相二段电流过载"},
                {"powerFactorBPhase", "B.PowerFactor", "A面进线B相功率因数"},
                {"bBackupPowerOver", "B.Backup.Power.Over", "A面进线B相功率过载"},
                {"bPowerOver", "B.Power.Over", "A面进线B相功率过载"},
                {"bReactivePower", "B.ReactivePower", "A面进线B相无功功率"},
                {"bReactiveEnergy", "B.ReactiveEnergy", "A面进线B相无功电能"},
                {"bActivePower", "B.ActivePower", "A面进线B相有功功率"},
                {"bActiveEnergy", "B.ActiveEnergy", "A面进线B相有功电能"},
                {"bVoltage", "B.Voltage", "A面进线B相电压"},
                {"bBackupLowVoltage", "B.Backup.LowVoltage", "A面进线B相电压欠电压"},
                {"bLowVoltage", "B.LowVoltage", "A面进线B相电压欠电压"},
                {"bBackupMissAppearance", "B.Backup.MissAppearance", "A面进线B相电压缺相"},
                {"bMissAppearance", "B.MissAppearance", "A面进线B相电压缺相"},
                {"bBackupOverVoltage", "B.Backup.OverVoltage", "A面进线B相电压过电压"},
                {"bOverVoltage", "B.OverVoltage", "A面进线B相电压过电压"},
                {"bCurrent", "B.Current", "A面进线B相电流"},
                {"bBackupCurrentOver", "B.Backup.Current.Over", "A面进线B相电流过载"},
                {"bCurrentOver", "B.Current.Over", "A面进线B相电流过载"},
                {"bApparentPower", "B.ApparentPower", "A面进线B相视在功率"},
                {"lineVoltageCA", "LineVoltage.CA", "A面进线CA线电压"},
                {"cCTRatio", "C.CT.Ratio", "A面进线C相CT变比"},
                {"cBackupCurrentOver2", "C.Backup.Current.Over.2", "A面进线C相二段电流过载"},
                {"cCurrentOver2", "C.Current.Over.2", "A面进线C相二段电流过载"},
                {"powerFactorCPhase", "C.PowerFactor", "A面进线C相功率因数"},
                {"cBackupPowerOver", "C.Backup.Power.Over", "A面进线C相功率过载"},
                {"cPowerOver", "C.Power.Over", "A面进线C相功率过载"},
                {"cReactivePower", "C.ReactivePower", "A面进线C相无功功率"},
                {"cReactiveEnergy", "C.ReactiveEnergy", "A面进线C相无功电能"},
                {"cActivePower", "C.ActivePower", "A面进线C相有功功率"},
                {"cActiveEnergy", "C.ActiveEnergy", "A面进线C相有功电能"},
                {"cVoltage", "C.Voltage", "A面进线C相电压"},
                {"cBackupLowVoltage", "C.Backup.LowVoltage", "A面进线C相电压欠电压"},
                {"cLowVoltage", "C.LowVoltage", "A面进线C相电压欠电压"},
                {"cBackupMissAppearance", "C.Backup.MissAppearance", "A面进线C相电压缺相"},
                {"cMissAppearance", "C.MissAppearance", "A面进线C相电压缺相"},
                {"cBackupOverVoltage", "C.Backup.OverVoltage", "A面进线C相电压过电压"},
                {"cOverVoltage", "C.OverVoltage", "A面进线C相电压过电压"},
                {"cCurrent", "C.Current", "A面进线C相电流"},
                {"cBackupCurrentOver", "C.Backup.Current.Over", "A面进线C相电流过载"},
                {"cCurrentOver", "C.Current.Over", "A面进线C相电流过载"},
                {"cApparentPower", "C.ApparentPower", "A面进线C相视在功率"},
                {"powerFactor", "PowerFactor", "A面进线总功率因数"},
                {"reactivePower", "ReactivePower", "A面进线总无功功率"},
                {"reactiveEnergy", "ReactiveEnergy", "A面进线总无功电能"},
                {"activePower", "ActivePower", "A面进线总有功功率"},
                {"activeEnergy", "ActiveEnergy", "A面进线总有功电能"},
                {"apparentPower", "ApparentPower", "A面进线总视在功率"},
                {"backupLessFrequency", "Backup.LessFrequency", "A面进线欠频率"},
                {"lessFrequency", "LessFrequency", "A面进线欠频率"},
                {"voltageImbalanceRate", "Voltage.Imbalance.Rate", "A面进线电压三相不平衡度"},
                {"currentImbalanceRate", "Current.Imbalance.Rate", "A面进线电流三相不平衡度"},
                {"backupOverFrequency", "OvBackup.erFrequency", "A面进线过频率"},
                {"overFrequency", "OverFrequency", "A面进线过频率"},
                {"frequency", "Frequency", "A面进线频率"},
                {"fangLeiSwitchFault", "FangLei.Switch.Fault", "A面防雷器开关故障"},
                {"fangLeiSwitchState", "FangLei.SwitchState", "A面防雷器开关状态"}
        };
        String mid = "        <SimplePropertyDefine>\n" +
                "            <name>%s</name>\n" +
                "            <sensorEntry>\n" +
                "                <deviceId>{{DEVICE_ID}}</deviceId>\n" +
                "                <sensorId>PDC.C%s.%s</sensorId>\n" +
                "            </sensorEntry>\n" +
                "        </SimplePropertyDefine>\n";
        StringBuilder stringBuffer = new StringBuilder();
        for (String[] strings : arr) {
            stringBuffer.append(String.format(mid, strings[0], jin.getIndex(), strings[1]));
        }
        return stringBuffer.toString();
    }

    @Test
    public void testChuXian() {
        String[][] arr = new String[][]{
                {"sdSwitchState", "SD.SwitchState", "SD开关状态"},
                {"sdFault", "SD.Fault", "SD故障"},
                {"currentOver2", "Current.Over.2", "二段电流过载"},
                {"switchFault", "Switch.Fault", "开关故障"},
                {"state", "SwitchState", "开关状态"},
                {"power", "ActivePower", "有功功率"},
                {"energy", "ActiveEnergy", "有功电能"},
                {"voltage", "Voltage", "电压"},
                {"current", "Current", "电流"},
                {"currentOver", "Current.Over", "电流过载"}
        };
        String back = "    </propertyDefines>\n" +
                "</ComposePropertyDefine>";

        StringBuilder stringBuffer = new StringBuilder();
        Jin jin = Jin.B;
        for (int i = 1; i <= 63; i++) {
            stringBuffer.setLength(0);
            stringBuffer.append(getFront(jin, i));
            for (int j = 0; j < arr.length; j++) {
                if (i > 60 && (j == 0 || j == 1)) continue;
                stringBuffer.append(getMid(arr[j][0], jin, i, arr[j][1]));
            }
            stringBuffer.append(back);
            System.out.println(stringBuffer.toString());
        }
    }

    private String getFront(Jin jin, int chu) {
        String front = "<ComposePropertyDefine>\n" +
                "    <name>%s-%s</name>\n" +
                "    <propertyDefines>\n" +
                "        <ConstantProperty>\n" +
                "            <name>id</name>\n" +
                "            <value>%s-%s</value>\n" +
                "        </ConstantProperty>\n" +
                "        <ConstantProperty>\n" +
                "            <name>name</name>\n" +
                "            <value>%s面分路%s</value>\n" +
                "        </ConstantProperty>\n";
        return String.format(front, jin.getValue(), chu, jin.getValue(), chu, jin.getValue(), chu);
    }

    private String getMid(String uiName, Jin jin, int chu, String sensorName) {
        String mid = "        <SimplePropertyDefine>\n" +
                "            <name>%s</name>\n" +
                "            <sensorEntry>\n" +
                "                <deviceId>{{DEVICE_ID}}</deviceId>\n" +
                "                <sensorId>PDC.C%s.B%s.%s</sensorId>\n" +
                "            </sensorEntry>\n" +
                "        </SimplePropertyDefine>\n";
        return String.format(mid, uiName, jin.getIndex(), chu, sensorName);
    }

    enum Jin {
        A("A", 1),
        B("B", 2);
        String value;
        int index;

        Jin(String value, int index) {
            this.value = value;
            this.index = index;
        }

        public String getValue() {
            return value;
        }

        public int getIndex() {
            return index;
        }
    }
}
