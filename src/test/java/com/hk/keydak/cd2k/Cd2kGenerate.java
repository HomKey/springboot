package com.hk.keydak.cd2k;

import com.hk.freemarker.FreemarkerUtils;
import com.hk.keydak.cd2k.data.SzgxdxProject;
import com.hk.keydak.cd2k.data.YdxlProject;
import freemarker.template.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by HomKey on 2019/9/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Cd2kGenerate {
    @Autowired
    private Configuration configuration;
    @Autowired
    private FreemarkerUtils freemarkerUtils;
    @Autowired
    private JdbcTemplate druidJdbcTemplate;
    @Autowired
    private JdbcTemplate cd2kSourceJdbcTemplate;
    @Autowired
    private JdbcTemplate cd2kTargetJdbcTemplate;

    private static Map<String, String> fanyiMap;

    private String insertDeviceModelTemplate = "INSERT INTO `n_DeviceModel` (`id`, `deviceTypeId`, `model`, `displayName`, `description`, `reference`) " +
            "VALUES (%s, %s, %s, %s, %s, %s);\n";
    private String insertCommandTemplate = "INSERT INTO `n_DefaultCommand` (`id`, `deviceModelId`, `name`, `startRegister`, `length`, `commandType`, `commandString`, `commandBytes`, `classId`, `addr`, `ver`, `ctrlData`, `oidStart`) " +
            "VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);\n";
    private String insertSensorTemplate = "INSERT INTO `n_SensorDefine` (`id`, `deviceModelId`, `name`, `displayName`, `description`, `registerIndex`, `scale`, `unit`, `isState`, `isBit`, `bitOrder`, `dividedBy`, `start`, `len`, `classId`, `parentId`, `attributeName`, `defaultCommandId`) " +
            "VALUES (%s, %s, %s, %s, %s,%s, %s, %s, %s, %s,%s, %s, %s, %s, %s,%s, %s, %s);\n";
    private String insertAlertTemplate = "INSERT INTO `n_AlertTemplate` (`id`, `name`, `deviceModelId`, `description`) " +
            "VALUES (%s, %s, %s, %s);\n";
    private String insertRuleDefineTemplate = "INSERT INTO `n_RuleDefine` (`id`, `name`, `classId`) " +
            "VALUES (%s,%s,%s);\n";
    private String insertAlertDefineTemplate = "INSERT INTO `n_AlertDefine` (`id`, `ruleDefineId`, `deviceModelId`, `title`, `category`, `number`, `level`, `descriptionPattern`, `repeat`, `minInterval`, `enable`) " +
            "VALUES (%s, %s, %s, %s, %s,%s, %s, %s, %s, %s,%s);\n";
    private String insertAlertTemplateDefineTemplate = "INSERT INTO `n_AlertTemplateDefine` (`id`, `alertTemplateId`, `alertDefineId`) " +
            "VALUES (%s,%s,%s);\n";
    private String insertRuleSensorDefineTemplate = "INSERT INTO `n_RuleSensorDefine` (`id`, `ruleDefineId`, `sensorDefineId`, `limit`) " +
            "VALUES (%s,%s,%s,%s);\n";
    private String insertSnmpSensorTemplate = "INSERT INTO `snmp_MoTableProperties` (`id`, `moTableId`, `index`, `name`, `isState`) " +
            "VALUES (%s,%s,%s,%s,%s);\n";

    private int tDeviceModelId;
    private int tDefaultCommandId;
    private int tSensorId;
    private int tAlertTemplateId;
    private int tRuleDefineId;
    private int tAlertDefineId;
    private int tAlertTemplateDefineId;
    private int tRuleSensorDefineId;
    private int tSnmpSensorDefineId;
    private Map<String, String> sensorIdMap = new HashMap<>();
    private Map<String, String> ruleDefineIdMap = new HashMap<>();
    private Map<String, String> alertDefineIdMap = new HashMap<>();
    private Map<String, String> alertTemplateDefineIdMap = new HashMap<>();

    @Before
    public void before() {
        fanyiMap = new HashMap<>();
        List<Map<String, Object>> mapList = cd2kSourceJdbcTemplate.queryForList("SELECT * FROM n_SensorDefine");
        for (Map<String, Object> item :
                mapList) {
            Object description = item.get("description");
            String value = String.valueOf(item.get("name"));
            String key;
            if (description == null || String.valueOf(description).equals("") || String.valueOf(description).toLowerCase().equals("null")) {
                key = String.valueOf(item.get("displayName"));
            } else {
                key = String.valueOf(item.get("name"));
            }
            fanyiMap.put(key, value);
        }
        Map<String, Object> tDeviceModelMap = cd2kTargetJdbcTemplate.queryForMap("SELECT max(id) AS deviceModelId FROM n_DeviceModel");
        tDeviceModelId = (int) tDeviceModelMap.get("deviceModelId") + 1;
        Map<String, Object> tDefaultCommandMap = cd2kTargetJdbcTemplate.queryForMap("SELECT max(id) AS commandId FROM n_DefaultCommand");
        tDefaultCommandId = (int) tDefaultCommandMap.get("commandId") + 1;
        Map<String, Object> tSensorMap = cd2kTargetJdbcTemplate.queryForMap("SELECT max(id) AS sensorId FROM n_SensorDefine");
        tSensorId = (int) tSensorMap.get("sensorId") + 1;
        Map<String, Object> tAlertTemplateMap = cd2kTargetJdbcTemplate.queryForMap("SELECT max(id) AS templateId FROM n_AlertTemplate");
        tAlertTemplateId = (int) tAlertTemplateMap.get("templateId") + 1;
        Map<String, Object> tRuleDefineMap = cd2kTargetJdbcTemplate.queryForMap("SELECT max(id) AS ruleDefineId FROM n_RuleDefine");
        tRuleDefineId = (int) tRuleDefineMap.get("ruleDefineId") + 1;
        Map<String, Object> tAlertDefineMap = cd2kTargetJdbcTemplate.queryForMap("SELECT max(id) AS alertDefineId FROM n_AlertDefine");
        tAlertDefineId = (int) tAlertDefineMap.get("alertDefineId") + 1;
        Map<String, Object> tAlertTemplateDefineMap = cd2kTargetJdbcTemplate.queryForMap("SELECT max(id) AS alertTemplateDefineId FROM n_AlertTemplateDefine");
        tAlertTemplateDefineId = (int) tAlertTemplateDefineMap.get("alertTemplateDefineId") + 1;
        Map<String, Object> tRuleSensorDefineIdMap = cd2kTargetJdbcTemplate.queryForMap("SELECT max(id) AS ruleSensorDefineId FROM n_RuleSensorDefine");
        tRuleSensorDefineId = (int) tRuleSensorDefineIdMap.get("ruleSensorDefineId") + 1;
        Map<String, Object> tSnmpSensorDefineIdMap = cd2kTargetJdbcTemplate.queryForMap("SELECT max(id) AS snmpSensorDefineId FROM snmp_MoTableProperties");
        tSnmpSensorDefineId = (int) tSnmpSensorDefineIdMap.get("snmpSensorDefineId") + 1;
    }

    public static String[][] data2 = new String[][]{
            {"CRV.SwitchState.Alert.HighPresure","高压告警开关","0-开关闭合,1-开关断开","0","0","1","0","0","1","92","279"},
            {"CRV.SwitchState.Alert.HighWaterLevel","高水位告警开关","0-开关闭合,1-开关断开","1","0","1","0","0","1","92","279"},
            {"CRV.SwitchState.Alert.FloorOverflow","地板溢水告警开关","0-开关闭合,1-开关断开","2","0","1","0","0","1","92","279"},
            {"CRV.SwitchState.Alert.ElectricHeatingFault","电加热故障告警开关","0-开关闭合,1-开关断开","3","0","1","0","0","1","92","279"},
            {"CRV.SwitchState.Alert.FilterClog","滤网堵塞告警开关","0-开关闭合,1-开关断开","4","0","1","0","0","1","92","279"},
            {"CRV.SwitchState.Alert.HumidifierFault","加湿器故障告警开关","0-开关闭合,1-开关断开","5","0","1","0","0","1","92","279"},
            {"CRV.SwitchState.WaterLevel","水位开关","0-开关闭合,1-开关断开","6","0","1","0","0","1","92","279"},
            {"CRV.SwitchState.Remote","远程开关","0-开关闭合,1-开关断开","7","0","1","0","0","1","92","279"},
            {"CRV.State.PumpOutPut","冷凝水泵输出","0-输出关闭;1-输出动作","12","0","1","0","0","1","92","279"},
            {"CRV.State.CompressorOutput","压缩机输出","0-输出关闭;1-输出动作","13","0","1","0","0","1","92","279"},
            {"CRV.State.ElectricHeatingOutput","电加热输出","0-输出关闭;1-输出动作","14","0","1","0","0","1","92","279"},
            {"CRV.State.FanOutput","风机输出","0-输出关闭;1-输出动作","15","0","1","0","0","1","92","279"},
            {"CRV.State.HumidifierOutput","加湿器输出","0-输出关闭;1-输出动作","16","0","1","0","0","1","92","279"},
            {"CRV.State.CommonAlertOutput","公共告警输出","0-输出关闭;1-输出动作","17","0","1","0","0","1","92","279"},
            {"CRV.State.LiquidSolenoidValueOutput","液路电磁阀输出","0-输出关闭;1-输出动作","19","0","1","0","0","1","92","279"},
            {"CRV.Alert.HighPressure","高压告警","0-无告警;1-告警产生","24","0","1","0","0","1","92","279"},
            {"CRV.Alert.LowPressure","低压告警","0-无告警;1-告警产生","25","0","1","0","0","1","92","279"},
            {"CRV.Alert.HighPressure.Abnormal","高压异常告警","0-无告警;1-告警产生","26","0","1","0","0","1","92","279"},
            {"CRV.Alert.Exhaust.Temperature.Over","排气高温告警","0-无告警;1-告警产生","27","0","1","0","0","1","92","279"},
            {"CRV.Alert.Exhaust.Superheat.Less","排气过热度低告警","0-无告警;1-告警产生","28","0","1","0","0","1","92","279"},
            {"CRV.Alert.ReturnAir.Temperature.Over","回风高温告警","0-无告警;1-告警产生","29","0","1","0","0","1","92","279"},
            {"CRV.Alert.OutAir.Temperature.Less","送风低温告警","0-无告警;1-告警产生","30","0","1","0","0","1","92","279"},
            {"CRV.Alert.OutAir.Temperature.Over","送风高温告警","0-无告警;1-告警产生","31","0","1","0","0","1","92","279"},
            {"CRV.Alert.ReturnAir.Humidity.Over","回风高湿告警","0-无告警;1-告警产生","32","0","1","0","0","1","92","279"},
            {"CRV.Alert.ReturnAir.Humidity.Less","回风低湿告警","0-无告警;1-告警产生","33","0","1","0","0","1","92","279"},
            {"CRV.Alert.HighPresureLock","高压锁定告警","0-无告警;1-告警产生","34","0","1","0","0","1","92","279"},
            {"CRV.Alert.LowPresureLock","低压锁定告警","0-无告警;1-告警产生","35","0","1","0","0","1","92","279"},
            {"CRV.Alert.Exhaust.Temperature.Over.Lock","排气高温锁定告警","0-无告警;1-告警产生","36","0","1","0","0","1","92","279"},
            {"CRV.Alert.Exhaust.Superheat.Less.Lock","排气过热度低锁定告警","0-无告警;1-告警产生","37","0","1","0","0","1","92","279"},
            {"CRV.Alert.Power.Loss","电源丢失告警","0-无告警;1-告警产生","38","0","1","0","0","1","92","279"},
            {"CRV.Alert.Power.Voltage.Over","电源过压告警","0-无告警;1-告警产生","39","0","1","0","0","1","92","279"},
            {"CRV.Alert.Power.Voltage.Less","电源欠压告警","0-无告警;1-告警产生","40","0","1","0","0","1","92","279"},
            {"CRV.Alert.Power.Phase.Miss","电源缺相告警","0-无告警;1-告警产生","41","0","1","0","0","1","92","279"},
            {"CRV.Alert.FloorOverflow","地板溢水告警","0-无告警;1-告警产生","42","0","1","0","0","1","92","279"},
            {"CRV.Alert.HighWaterLevel","高水位告警","0-无告警;1-告警产生","43","0","1","0","0","1","92","279"},
            {"CRV.Alert.FilterClog","滤网堵塞告警","0-无告警;1-告警产生","44","0","1","0","0","1","92","279"},
            {"CRV.Alert.Filter.Maintenance","滤网维护提醒","0-无告警;1-告警产生","45","0","1","0","0","1","92","279"},
            {"CRV.Alert.AirFlow.Loss","气流丢失告警","0-无告警;1-告警产生","46","0","1","0","0","1","92","279"},
            {"CRV.Alert.Sensor.LowPressure.Lock","低压传感器锁定告警","0-无告警;1-告警产生","47","0","1","0","0","1","92","279"},
            {"CRV.Alert.RemoteShutdown","远程关机告警","0-无告警;1-告警产生","48","0","1","0","0","1","92","279"},
            {"CRV.Alert.GroupControl.HostMachine.Loss","群控主机丢失告警","0-无告警;1-告警产生","49","0","1","0","0","1","92","279"},
            {"CRV.Alert.GroupControl.ClusterMachine.Loss","群控从机丢失告警","0-无告警;1-告警产生","50","0","1","0","0","1","92","279"},
            {"CRV.Alert.Sensor.ReturnAir.Temperature","回风温度传感器故障","0-无告警;1-告警产生","51","0","1","0","0","1","92","279"},
            {"CRV.Alert.Sensor.ReturnAir.Humidity","回风湿度传感器故障","0-无告警;1-告警产生","52","0","1","0","0","1","92","279"},
            {"CRV.Alert.Sensor.AirFlow.TemperatureDiff","气流温差传感器故障","0-无告警;1-告警产生","53","0","1","0","0","1","92","279"},
            {"CRV.Alert.Sensor.OutAir.Temperature","送风温度传感器故障","0-无告警;1-告警产生","54","0","1","0","0","1","92","279"},
            {"CRV.Alert.Sensor.Remote.Temperature","远程温度传感器故障","0-无告警;1-告警产生","55","0","1","0","0","1","92","279"},
            {"CRV.Alert.Sensor.HighPresure","高压压力传感器故障","0-无告警;1-告警产生","56","0","1","0","0","1","92","279"},
            {"CRV.Manual.Clear.StartStop.Record","手动清除启停记录","手动清除启停记录","57","0","1","0","0","1","92","279"},
            {"CRV.Manual.Clear.HistoryAlert","手动清除历史告警","手动清除历史告警","58","0","1","0","0","1","92","279"},
            {"CRV.Manual.Operation.Allow","手动运行允许","手动运行允许","59","0","1","0","0","1","92","279"},
            {"CRV.Restore.FacotrySettings","恢复出厂设置","恢复出厂设置","60","0","1","0","0","1","92","279"},
            {"CRV.State.Vacuum","抽真空状态","抽真空状态","61","0","1","0","0","1","92","279"},
            {"CRV.Enable.Humidification","加湿功能使能","加湿功能使能","62","0","1","0","0","1","92","279"},
            {"CRV.Enable.Dehumidification","除湿功能使能","除湿功能使能","63","0","1","0","0","1","92","279"},
            {"CRV.Clear.HighPressure.Abnormal","清高压异常","清高压异常","64","0","1","0","0","1","92","279"},
            {"CRV.Release.DehumidificationLock","除湿锁定解除","除湿锁定解除","65","0","1","0","0","1","92","279"},
            {"CRV.Enable.MonitorShutdown","监控关机使能","0-禁止;1-允许","66","0","1","0","0","1","92","279"},
            {"CRV.State.SoftShutdown","软关机状态","软关机状态","67","0","1","0","0","1","92","279"},
            {"CRV.FlagBit.NewAlert","新告警标志位","0-没有新告警;1-产生新告警","68","0","1","0","0","1","92","279"},
            {"CRV.FlagBit.PanelShutdown","面板关机标志位","0-未处于该状态;1-处于该状态","69","0","1","0","0","1","92","279"},
            {"CRV.FlagBit.MonitorShutdown","监控关机标志位","0-未处于该状态;1-处于该状态","70","0","1","0","0","1","92","279"},
            {"CRV.FlagBit.RemoteShutdown","远程关机标志位","0-未处于该状态;1-处于该状态","71","0","1","0","0","1","92","279"},
            {"CRV.Filter.Maintenance","过滤网维护","过滤网维护","72","0","1","0","0","1","92","279"},
            {"CRV.State.Fan1","风机1状态","25kW机型有4个风机,35kW机型只有2个风机","73","0","1","0","0","1","92","279"},
            {"CRV.State.Fan2","风机2状态","25kW机型有4个风机,35kW机型只有2个风机","74","0","1","0","0","1","92","279"},
            {"CRV.State.Fan3","风机3状态","25kW机型有4个风机,35kW机型只有2个风机","75","0","1","0","0","1","92","279"},
            {"CRV.State.Fan4","风机4状态","25kW机型有4个风机,35kW机型只有2个风机","76","0","1","0","0","1","92","279"},
            {"CRV.Backup","备用","备用","77","0","1","0","0","1","92","279"},
            {"CRV.State.RemoteSwtich.InputPolarity","远程开关机输入极性","0-常闭;1-常开","78","0","1","0","0","1","92","279"},
            {"CRV.State.CommonAlert.InputPolarity","公共告警输出极性","0-常闭;1-常开","79","0","1","0","0","1","92","279"},
            {"CRV.Switch.Change","开关机切换","开关机切换","80","0","1","0","0","1","92","279"},
            {"CRV.FlagBit.Refrigeration","制冷标志位","0-未处于该状态;1-处于该状态","81","0","1","0","0","1","92","279"},
            {"CRV.FlagBit.Heating","加热标志位","0-未处于该状态;1-处于该状态","82","0","1","0","0","1","92","279"},
            {"CRV.FlagBit.Humidification","加湿标志位","0-未处于该状态;1-处于该状态","83","0","1","0","0","1","92","279"},
            {"CRV.FlagBit.Dehumidification","除湿标志位","0-未处于该状态;1-处于该状态","84","0","1","0","0","1","92","279"},
            {"CRV.Alert.ElectricHeating.Fault","电加热故障告警","0-无告警;1-告警产生","85","0","1","0","0","1","92","279"},
            {"CRV.Alert.Sensor.ExhaustTemperature","排气温度传感器故障","0-无告警;1-告警产生","86","0","1","0","0","1","92","279"},
            {"CRV.Alert.Fan.Power.Fault","风机/电源故障","0-无告警;1-告警产生","87","0","1","0","0","1","92","279"},
            {"CRV.Alert.EEV.Communication","EEV通信故障","0-无告警;1-告警产生","88","0","1","0","0","1","92","279"},
            {"CRV.Alert.NotSelectRefrigerant","未选择制冷剂告警","0-无告警;1-告警产生","89","0","1","0","0","1","92","279"},
            {"CRV.Alert.Refrigerant.Insufficient","制冷剂不足告警","0-无告警;1-告警产生","90","0","1","0","0","1","92","279"},
            {"CRV.Alert.Sensor.SuctionTemperature","吸气温度传感器故障","0-无告警;1-告警产生","91","0","1","0","0","1","92","279"},
            {"CRV.Alert.Sensor.LowPressure.Fault","低压压力传感器故障","0-无告警;1-告警产生","92","0","1","0","0","1","92","279"},
            {"CRV.Alert.Compressor.DriveCommunication","压缩机驱动通信故障","0-无告警;1-告警产生","93","0","1","0","0","1","92","279"},
            {"CRV.Alert.Compressor.Drive","压缩机驱动故障","0-无告警;1-告警产生","94","0","1","0","0","1","92","279"},
            {"CRV.Alert.Compressor.Radiator.Over","压缩机散热器过温","0-无告警;1-告警产生","95","0","1","0","0","1","92","279"},
            {"CRV.Alert.Compressor.OverCurrent.Protection","压缩机过流保护","0-无告警;1-告警产生","96","0","1","0","0","1","92","279"},
            {"CRV.Alert.Compressor.Phase.Miss.Protection","压缩机缺相保护","0-无告警;1-告警产生","97","0","1","0","0","1","92","279"},
            {"CRV.Alert.Compressor.BusVoltage.Abnormal","压缩机母线电压异常","0-无告警;1-告警产生","98","0","1","0","0","1","92","279"},
            {"CRV.Alert.Humidifier.Fault","加湿器故障告警","0-无告警;1-告警产生","99","0","1","0","0","1","92","279"},
            {"CRV.Enable.ServiceInfoRemind","服务信息提醒使能","0-关闭;1-开启","100","0","1","0","0","1","92","279"},
            {"Connection_Status","CRV通讯","CRV通讯","0","0","1","0","0","1","92","279"}
    };

    public static String[][] data = new String[][]{
            {"CRV.OutAir.Temperature.Setting", "送风温度设定", "送风温度设定", "0", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.OutAir.AvgTemperature", "送风平均温度测量值", "送风平均温度测量值", "1", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.Humidity.Setting", "湿度设定", "湿度设定", "2", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.Humidity.Ratio", "湿度比例", "湿度比例", "3", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.Out.Temperature.1", "送风温度1测量值", "送风温度1测量值", "4", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.Out.Temperature.2", "送风温度2测量值", "送风温度2测量值", "5", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.ReturnAir.Temperature", "回风温度测量值", "回风温度测量值", "6", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.AirFlow.Temperature", "气流温度测量值", "气流温度测量值", "7", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.ExhaustTemperature", "排气温度测量值", "排气温度测量值", "8", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.SuctionTemperature", "吸气温度测量值", "吸气温度测量值", "9", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.ReturnAir.Humidity", "回风湿度测量值", "回风湿度测量值", "10", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.Exhaust.Presure", "排气压力测量值", "排气压力测量值", "11", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.Suction.Presure", "吸气压力测量值", "吸气压力测量值", "12", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.OutAir.Temperature.Correcting.1", "送风温度1校正值", "送风温度1校正值", "13", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.OutAir.Temperature.Correcting.2", "送风温度2校正值", "送风温度2校正值", "14", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.ReturnAir.Temperature.Correcting", "回风温度校正值", "回风温度校正值", "15", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.AirFlow.Temperature.Correcting", "气流温度校正值", "气流温度校正值", "16", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.ExhaustTemperature.Correcting", "排气温度校正值", "排气温度校正值", "17", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.Suction.Presure.Correcting", "吸气温度校正值", "吸气温度校正值", "18", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.ReturnAir.Humidity.Correcting", "回风湿度校正值", "回风湿度校正值", "19", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.Exhaust.Presure.Correcting", "排气压力校正值", "排气压力校正值", "20", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.Suction.Presure.Correcting", "吸气压力校正值", "吸气压力校正值", "21", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.Monitor.BaudRate", "监控波特率", "1:1200-2:2400-3:4800-4:9600-5:19200", "22", "0", "0", "0", "0", "1", "92", "275"},
            {"CRV.Monitor.Addr", "监控地址", "控制板拨码设置", "23", "0", "0", "0", "0", "1", "92", "275"},
            {"CRV.A.Phrase.Voltage", "A相电压", "A相电压", "24", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.B.Phrase.Voltage", "B相电压", "B相电压", "25", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.C.Phrase.Voltage", "C相电压", "C相电压", "26", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.PowerFrequency", "电源频率", "电源频率", "27", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.Compressor.MinOperationTime", "压缩机最短运行时间", "压缩机最短运行时间", "28", "0", "0", "0", "0", "1", "92", "275"},
            {"CRV.Compressor.MinStopTime", "压缩机最短停机时间", "压缩机最短停机时间", "29", "0", "0", "0", "0", "1", "92", "275"},
            {"CRV.Fan.StartDelay", "风机启动延时", "风机启动延时", "30", "0", "0", "0", "0", "1", "92", "275"},
            {"CRV.Fan.StopDelay", "风机停机延时", "风机停机延时", "31", "0", "0", "0", "0", "1", "92", "275"},
            {"CRV.Suction.Evaporation.Temperature", "吸气蒸发温度", "吸气蒸发温度", "32", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.Exhaust.Condensation.Temperature", "排气冷凝温度", "排气冷凝温度", "33", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.Suction.Superheat.Temperature", "吸气过热度", "吸气过热度", "34", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.Exhaust.Superheat.Temperature", "排气过热度", "排气过热度", "35", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.Theoretical.OutAir.Humidity", "理论送风湿度", "理论送风湿度", "36", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.Current.OutAir.Humidity", "当前送风湿度", "当前送风湿度", "37", "0", "0", "0", "0", "10", "92", "275"},
            {"CRV.DialCode.Value", "拨码开关值", "拨码开关值", "38", "0", "0", "0", "0", "1", "92", "275"},
            {"CRV.AlertState.Num", "告警状态数量", "告警状态数量", "39", "0", "0", "0", "0", "1", "92", "275"},
            {"CRV.AlertState.History.Num", "告警历史记录数量", "告警历史记录数量", "40", "0", "0", "0", "0", "1", "92", "275"},
            {"CRV.Compressor.StartStop.Num", "压缩机启停记录数量", "压缩机启停记录数量", "41", "0", "0", "0", "0", "1", "92", "275"},
            {"CRV.WaterPump.StartStop.Num", "水泵启停记录数量", "水泵启停记录数量", "42", "0", "0", "0", "0", "1", "92", "275"},
            {"CRV.Fan.StartStop.Num", "风机启停记录数量", "风机启停记录数量", "43", "0", "0", "0", "0", "1", "92", "275"},
            {"CRV.ElectricHeating.StartStop.Num", "电加热启停记录数量", "电加热启停记录数量", "44", "0", "0", "0", "0", "1", "92", "275"},
            {"CRV.Humidifier.StartStop.Num", "加湿器启停记录数量", "加湿器启停记录数量", "45", "0", "0", "0", "0", "1", "92", "275"},
            {"CRV.Compressor.Operation.HourRecord", "压缩机运行小时记录", "压缩机运行小时记录", "46", "0", "0", "0", "0", "1", "92", "275"},
            {"CRV.WaterPump.Operation.HourRecord", "水泵运行小时记录", "水泵运行小时记录", "47", "0", "0", "0", "0", "1", "92", "275"},
            {"CRV.Fan.Operation.HourRecord", "风机运行小时记录", "风机运行小时记录", "48", "0", "0", "0", "0", "1", "92", "275"},
            {"CRV.ElectricHeating.Operation.HourRecord", "电加热运行小时记录", "电加热运行小时记录", "49", "0", "0", "0", "0", "1", "92", "275"},
            {"CRV.Humidifier.Operation.HourRecord", "加湿器运行小时记录", "加湿器运行小时记录", "50", "0", "0", "0", "0", "1", "92", "275"},
            {"CRV.AlertAttr.HighPresure", "高压告警属性", "0-关闭;1-中止;2-开启", "64", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.LowPresure", "低压告警属性", "0-关闭;1-中止;2-开启", "65", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.HighPresure.Abnormal", "高压异常告警属性", "0-关闭;1-中止;2-开启", "66", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.Exhaust.Tempareture.Over", "排气高温告警属性", "0-关闭;1-中止;2-开启", "67", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.Exhaust.Superheat.Less", "排气过热度低告警属性", "0-关闭;1-中止;2-开启", "68", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.ReturnAir.Tempareture.Over", "回风高温告警属性", "0-关闭;1-中止;2-开启", "69", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.OutAir.Tempareture.Less", "送风低温告警属性", "0-关闭;1-中止;2-开启", "70", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.OutAir.Tempareture.Over", "送风高温告警属性", "0-关闭;1-中止;2-开启", "71", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.ReturnAir.Humidity.Over", "回风高湿告警属性", "0-关闭;1-中止;2-开启", "72", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.ReturnAir.Humidity.Less", "回风低湿告警属性", "0-关闭;1-中止;2-开启", "73", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.HighPresure.Lock", "高压锁定告警属性", "0-关闭;1-中止;2-开启", "74", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.LowPresure.Lock", "低压锁定告警属性", "0-关闭;1-中止;2-开启", "75", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.Exhaust.Tempareture.Over.Lock", "排气高温锁定告警属性", "0-关闭;1-中止;2-开启", "76", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.Exhaust.Superheat.Less.Lock", "排气过热度低锁定告警属性", "0-关闭;1-中止;2-开启", "77", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.Power.Loss", "电源丢失告警属性", "0-关闭;1-中止;2-开启", "78", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.Power.Voltage.Over", "电源过压告警属性", "0-关闭;1-中止;2-开启", "79", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.Power.Voltage.Less", "电源欠压告警属性", "0-关闭;1-中止;2-开启", "80", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.Power.Lack.Phrase", "电源缺相告警属性", "0-关闭;1-中止;2-开启", "81", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.Floor.Overflow", "地板溢水告警属性", "0-关闭;1-中止;2-开启", "82", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.WaterLevel.Over", "高水位告警属性", "0-关闭;1-中止;2-开启", "83", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.FilterClog", "滤网堵塞告警属性", "0-关闭;1-中止;2-开启", "84", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.Filter.Maintenance", "滤网维护提醒告警属性", "0-关闭;1-中止;2-开启", "85", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.AirFlow.Loss", "气流丢失告警属性", "0-关闭;1-中止;2-开启", "86", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.Sensor.LowPresure.Lock", "低压传感器锁定告警属性", "0-关闭;1-中止;2-开启", "87", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.RemoteShutdown", "远程关机告警属性", "0-关闭;1-中止;2-开启", "88", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.GroupControl.HostMachine.Loss", "群控主机丢失告警属性", "0-关闭;1-中止;2-开启", "89", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.GroupControl.ClusterMachine.Loss", "群控从机丢失告警属性", "0-关闭;1-中止;2-开启", "90", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.Sensor.ReturnAir.Temperature", "回风温度传感器故障告警属性", "0-关闭;1-中止;2-开启", "91", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.Sensor.ReturnAir.Humidity", "回风湿度传感器故障告警属性", "0-关闭;1-中止;2-开启", "92", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.Sensor.AirFlow.TemperatureDiff", "气流温差传感器故障告警属性", "0-关闭;1-中止;2-开启", "93", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.Sensor.OutAir.Temperature", "送风温度传感器故障告警属性", "0-关闭;1-中止;2-开启", "94", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.Sensor.Remote.Temperature", "远程温度传感器故障告警属性", "0-关闭;1-中止;2-开启", "95", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.AlertAttr.Sensor.HighPresure", "高压压力传感器故障告警属性", "0-关闭;1-中止;2-开启", "96", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.MainStandby.Delay", "主备延时", "主备延时", "97", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.FirstOperatingMachineGroup", "首运行机组", "首运行机组", "98", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.HeatingFunction", "加热功能", "加热功能", "99", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.RemoteTemperature.Sensor.Num", "远程温度传感器数量", "远程温度传感器数量", "100", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.CondensatePump", "冷凝水泵", "冷凝水泵", "101", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.GroupControl.Mode", "群控模式", "群控模式", "102", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.MachineGroup.Addr", "机组地址", "机组地址", "103", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.MachineGroup.Num", "机组数量", "机组数量", "104", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.StandBy.Num", "备机数量", "备机数量", "105", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.Rotation.Num", "轮巡数量", "轮巡数量", "106", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.Rotation.Time", "轮巡时刻", "轮巡时刻", "107", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.Rotation.Cycle", "轮巡周期", "轮巡周期", "108", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.Temperature.DeadZone", "温度死区", "温度死区", "109", "0", "0", "0", "0", "10", "92", "276"},
            {"CRV.Humidity.DeadZone", "湿度死区", "湿度死区", "110", "0", "0", "0", "0", "10", "92", "276"},
            {"CRV.RemoteTemperature.Setting", "远程温度设定", "远程温度设定", "111", "0", "0", "0", "0", "10", "92", "276"},
            {"CRV.ReturnAir.Temperature.Setting", "回风温度设定", "回风温度设定", "112", "0", "0", "0", "0", "10", "92", "276"},
            {"CRV.CompressorCapacity.ActualValue", "压缩机容量实际值", "压缩机容量实际值", "113", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.CompressorCapacity.OutputValue", "压缩机容量输出值", "压缩机容量输出值", "114", "0", "0", "0", "0", "1", "92", "276"},
            {"CRV.Remote.WarmSensation.1", "远程温感1测量值", "远程温感1测量值", "130", "0", "0", "0", "0", "10", "92", "277"},
            {"CRV.Remote.WarmSensation.2", "远程温感2测量值", "远程温感2测量值", "131", "0", "0", "0", "0", "10", "92", "277"},
            {"CRV.Remote.WarmSensation.3", "远程温感3测量值", "远程温感3测量值", "132", "0", "0", "0", "0", "10", "92", "277"},
            {"CRV.Remote.WarmSensation.4", "远程温感4测量值", "远程温感4测量值", "133", "0", "0", "0", "0", "10", "92", "277"},
            {"CRV.Remote.WarmSensation.5", "远程温感5测量值", "远程温感5测量值", "134", "0", "0", "0", "0", "10", "92", "277"},
            {"CRV.Remote.WarmSensation.6", "远程温感6测量值", "远程温感6测量值", "135", "0", "0", "0", "0", "10", "92", "277"},
            {"CRV.Remote.WarmSensation.7", "远程温感7测量值", "远程温感7测量值", "136", "0", "0", "0", "0", "10", "92", "277"},
            {"CRV.Remote.WarmSensation.8", "远程温感8测量值", "远程温感8测量值", "137", "0", "0", "0", "0", "10", "92", "277"},
            {"CRV.Remote.WarmSensation.9", "远程温感9测量值", "远程温感9测量值", "138", "0", "0", "0", "0", "10", "92", "277"},
            {"CRV.Remote.WarmSensation.10", "远程温感10测量值", "远程温感10测量值", "139", "0", "0", "0", "0", "10", "92", "277"},
            {"CRV.Remote.AvgTemperature", "远程平均温度", "远程平均温度", "140", "0", "0", "0", "0", "10", "92", "277"},
            {"CRV.AlertValue.OutAir.Temperature.Over", "送风高温告警值", "送风高温告警值", "141", "0", "0", "0", "0", "10", "92", "277"},
            {"CRV.AlertValue.OutAir.Temperature.Less", "送风低温告警值", "送风低温告警值", "142", "0", "0", "0", "0", "10", "92", "277"},
            {"CRV.AlertValue.ReturnAir.Temperature.Over", "回风高温告警值", "回风高温告警值", "143", "0", "0", "0", "0", "10", "92", "277"},
            {"CRV.AlertValue.ReturnAir.Humidity.Over", "回风高湿告警值", "回风高湿告警值", "144", "0", "0", "0", "0", "1", "92", "277"},
            {"CRV.AlertValue.ReturnAir.Humidity.Less", "回风低湿告警值", "回风低湿告警值", "145", "0", "0", "0", "0", "1", "92", "277"},
            {"CRV.AlertValue.AirFlow.TemperatureDiff.Loss", "气流丢失温差告警值", "气流丢失温差告警值", "146", "0", "0", "0", "0", "10", "92", "277"},
            {"CRV.Compressor.Control.Mode", "压缩机控制模式", "0:送风-1:远程-2:回风", "147", "0", "0", "0", "0", "1", "92", "277"},
            {"CRV.Fan.Control.Mode", "风机控制模式", "0:送风-1:远程-2:回风", "148", "0", "0", "0", "0", "1", "92", "277"},
            {"CRV.Remote.WarmSensation.1.Correcting", "远程温感1校正值", "远程温感1校正值", "218", "0", "0", "0", "0", "10", "92", "278"},
            {"CRV.Remote.WarmSensation.2.Correcting", "远程温感2校正值", "远程温感2校正值", "219", "0", "0", "0", "0", "10", "92", "278"},
            {"CRV.Remote.WarmSensation.3.Correcting", "远程温感3校正值", "远程温感3校正值", "220", "0", "0", "0", "0", "10", "92", "278"},
            {"CRV.Remote.WarmSensation.4.Correcting", "远程温感4校正值", "远程温感4校正值", "221", "0", "0", "0", "0", "10", "92", "278"},
            {"CRV.Remote.WarmSensation.5.Correcting", "远程温感5校正值", "远程温感5校正值", "222", "0", "0", "0", "0", "10", "92", "278"},
            {"CRV.Remote.WarmSensation.6.Correcting", "远程温感6校正值", "远程温感6校正值", "223", "0", "0", "0", "0", "10", "92", "278"},
            {"CRV.Remote.WarmSensation.7.Correcting", "远程温感7校正值", "远程温感7校正值", "224", "0", "0", "0", "0", "10", "92", "278"},
            {"CRV.Remote.WarmSensation.8.Correcting", "远程温感8校正值", "远程温感8校正值", "225", "0", "0", "0", "0", "10", "92", "278"},
            {"CRV.Remote.WarmSensation.9.Correcting", "远程温感9校正值", "远程温感9校正值", "226", "0", "0", "0", "0", "10", "92", "278"},
            {"CRV.Remote.WarmSensation.10.Correcting", "远程温感10校正值", "远程温感10校正值", "227", "0", "0", "0", "0", "10", "92", "278"},
            {"CRV.Fan.Fault.ProcessingMode", "风机故障处理方式", "0-仅制冷;1-停机", "228", "0", "0", "0", "0", "1", "92", "278"},
            {"CRV.AlertValue.Power.Over", "电源过压告警值", "电源过压告警值", "229", "0", "0", "0", "0", "1", "92", "278"},
            {"CRV.AlertValue.Power.Less", "电源欠压告警值", "电源欠压告警值", "230", "0", "0", "0", "0", "1", "92", "278"}
    };

    private String getEngName(String cn) {
        for (Map.Entry<String, String> item :
                fanyiMap.entrySet()) {
            if (item.getKey().contains(cn)) {
                return item.getValue();
            }
        }
        return "--------";
    }

    @Test
    public void testJdbcTemplate() {
        for (int i = 0; i < data2.length; i++) {
            System.out.println(String.format(insertSnmpSensorTemplate, tSnmpSensorDefineId, "'55'", "'" + (i+1) + "'", "'" + data2[i][0] + "'", '1'));
            tSnmpSensorDefineId++;
        }
    }

    /**
     *
     */
    @Test
    public void testAddDeviceSensor() {
        String insertSensorTemplate = "INSERT INTO `n_SensorDefine` (`id`, `deviceModelId`, `name`, `displayName`, `description`, `registerIndex`, `scale`, `unit`, `isState`, `isBit`, `bitOrder`, `dividedBy`, `start`, `len`, `classId`, `parentId`, `attributeName`, `defaultCommandId`) " +
                "VALUES (%s, %s, %s, %s, %s,%s, %s, %s, %s, %s,%s, %s, %s, %s, %s,%s, %s, %s);\n";
        Map<String, Object> tSensorMap = cd2kTargetJdbcTemplate.queryForMap("SELECT max(id) AS sensorId FROM n_SensorDefine");
        int tSensorId = (int) tSensorMap.get("sensorId") + 1;
        int i = 0;
        for (String[] item :
                SzgxdxProject.sensorData6) {
            String insertSensorSql = String.format(insertSensorTemplate,
                    tSensorId,
                    SzgxdxProject.deviceModelId4,
                    "'" + getEngName(item[1]) + "'", // 英文字段
                    "'" + item[1] + "'", // 中文字段
                    "'" + item[2] + "'", // 中文字段
                    item[0], // index
                    0, //保留的小数位个数
                    null,
                    1,// isState
                    0, // isBit
                    0, // bitOrder
                    1, // 除数
                    null,
                    null,
                    92, // class
                    null,
                    null,
                    283); // command
            executeSql(insertSensorSql);
            tSensorId++;
            i++;
        }
    }


    @Test
    public void testAddAlertTemplate() {
        int deviceModel = 109;
        int alertTemplate = 51;
        List<Map<String, Object>> list = cd2kTargetJdbcTemplate.queryForList("SELECT * FROM n_SensorDefine WHERE deviceModelId = " + deviceModel + " AND id in ('141908','141909','141910','141911','141912','141913','141914','141915','141916','141917','141918','141919','141920','141921','141922','141923','141847','141848','141849','141850','141851','141852','141853','141854','141855','141856','141857','141858','141859','141860','141861','141862','141863','141864','141865','141866','141867','141868','141869','141870','141871','141872','141873','141874','141875','141876','141877','141878','141879')");
        for (Map<String, Object> item :
                list) {
            Map<String, String> map = dealMap(item);
            String insertRuleDefineSql = String.format(insertRuleDefineTemplate,
                    tRuleDefineId,
                    map.get("displayName"),
                    69); // classId 69 equal
            executeSql(insertRuleDefineSql);
            String insertAlertDefineSql = String.format(insertAlertDefineTemplate,
                    tAlertDefineId,
                    tRuleDefineId,
                    deviceModel,
                    map.get("displayName"),
                    99,
                    10001,
                    1,
                    "''",
                    10,
                    1440,
                    1);
            executeSql(insertAlertDefineSql);
            String insertAlertTemplateDefineSql = String.format(insertAlertTemplateDefineTemplate,
                    tAlertTemplateDefineId,
                    alertTemplate,
                    tAlertDefineId
            );
            executeSql(insertAlertTemplateDefineSql);
            String insertRuleSensorDefineSql = String.format(insertRuleSensorDefineTemplate,
                    tRuleSensorDefineId,
                    tRuleDefineId,
                    map.get("id"),
                    1
            );
            executeSql(insertRuleSensorDefineSql);
            tRuleDefineId++;
            tAlertDefineId++;
            tAlertTemplateDefineId++;
            tRuleSensorDefineId++;
        }
    }

    /**
     * 根据DeviceModelId迁移数据
     */
    @Test
    public void testAddDeviceSql() {
        int sourceDeviceModelId = 96;

        // 先查出deviceModel
        Map<String, Object> modelMap = cd2kSourceJdbcTemplate.queryForMap("SELECT * FROM n_DeviceModel WHERE id = ?", sourceDeviceModelId);
        Map<String, String> modelMapNew = dealMap(modelMap);
        String insertDeviceModelSql = String.format(insertDeviceModelTemplate,
                tDeviceModelId,
                modelMapNew.get("deviceTypeId"),
                modelMapNew.get("model"),
                modelMapNew.get("displayName"),
                modelMapNew.get("description"),
                modelMapNew.get("reference"));
        executeSql(insertDeviceModelSql);

        // 命令集
        List<Map<String, Object>> commandList = cd2kSourceJdbcTemplate.queryForList("SELECT * FROM n_DefaultCommand WHERE deviceModelId = ? ORDER BY id ASC ", sourceDeviceModelId);
        for (Map<String, Object> item : commandList) {
            Map<String, String> itemNew = dealMap(item);
            String insertCommandSql = String.format(insertCommandTemplate,
                    tDefaultCommandId,
                    tDeviceModelId,
                    itemNew.get("name"),
                    itemNew.get("startRegister"),
                    itemNew.get("length"),
                    itemNew.get("commandType"),
                    itemNew.get("commandString"),
                    itemNew.get("commandBytes"),
                    itemNew.get("classId"),
                    itemNew.get("addr"),
                    itemNew.get("ver"),
                    itemNew.get("ctrlData"),
                    itemNew.get("oidStart"));
            tDefaultCommandId++;
            executeSql(insertCommandSql);
            // 传感器列表
            List<Map<String, Object>> sensorList = cd2kSourceJdbcTemplate.queryForList("SELECT * FROM n_SensorDefine WHERE defaultCommandId = ? ORDER BY id ASC ", item.get("id"));
            for (Map<String, Object> sensorItem :
                    sensorList) {
                sensorIdMap.put(String.valueOf(sensorItem.get("id")), String.valueOf(tSensorId));
                Map<String, String> sensorItemNew = dealMap(sensorItem);
                String insertSensorSql = String.format(insertSensorTemplate,
                        tSensorId,
                        tDeviceModelId,
                        sensorItemNew.get("name"),
                        sensorItemNew.get("displayName"),
                        sensorItemNew.get("description"),
                        sensorItemNew.get("registerIndex"),
                        sensorItemNew.get("scale"),
                        sensorItemNew.get("unit"),
                        sensorItemNew.get("isState").equals("'false'") ? 0 : 1,
                        sensorItemNew.get("isBit").equals("'false'") ? 0 : 1,
                        sensorItemNew.get("bitOrder"),
                        sensorItemNew.get("dividedBy"),
                        sensorItemNew.get("start"),
                        sensorItemNew.get("len"),
                        sensorItemNew.get("classId"),
                        sensorItemNew.get("parentId"),
                        sensorItemNew.get("attributeName"),
                        sensorItemNew.get("defaultCommandId")
                );
                executeSql(insertSensorSql);
                tSensorId++;
            }
        }

        // 对应的告警模板
        List<Map<String, Object>> alertTemplateList = cd2kSourceJdbcTemplate.queryForList("SELECT * FROM n_AlertTemplate WHERE deviceModelId = ? ORDER BY id ASC", sourceDeviceModelId);
        for (Map<String, Object> item :
                alertTemplateList) {
            Map<String, String> itemNew = dealMap(item);
            String insertAlertTemplateSql = String.format(insertAlertTemplate,
                    tAlertTemplateId,
                    itemNew.get("name"),
                    tDeviceModelId,
                    itemNew.get("description"));
            executeSql(insertAlertTemplateSql);
            List<Map<String, Object>> ruleDefineList = cd2kSourceJdbcTemplate.queryForList("SELECT * FROM n_RuleDefine WHERE id IN ( SELECT t.ruleDefineId FROM n_AlertDefine t WHERE t.deviceModelId = ? ) ORDER BY id ASC", sourceDeviceModelId);
            for (Map<String, Object> ruleDefineItem :
                    ruleDefineList) {
                ruleDefineIdMap.put(String.valueOf(ruleDefineItem.get("id")), String.valueOf(tRuleDefineId));
                Map<String, String> ruleDefineItemNew = dealMap(ruleDefineItem);
                String insertRuleDefineSql = String.format(insertRuleDefineTemplate,
                        tRuleDefineId,
                        ruleDefineItemNew.get("name"),
                        ruleDefineItemNew.get("classId")
                );
                tRuleDefineId++;
                executeSql(insertRuleDefineSql);
            }
            List<Map<String, Object>> alertDefineList = cd2kSourceJdbcTemplate.queryForList("SELECT * FROM n_AlertDefine WHERE deviceModelId = ? ORDER BY id ASC", sourceDeviceModelId);
            for (Map<String, Object> alertDefineItem :
                    alertDefineList) {
                alertDefineIdMap.put(String.valueOf(alertDefineItem.get("id")), String.valueOf(tAlertDefineId));
                Map<String, String> alertDefineItemNew = dealMap(alertDefineItem);
                String insertAlertDefineSql = String.format(insertAlertDefineTemplate,
                        tAlertDefineId,
                        ruleDefineIdMap.get(String.valueOf(alertDefineItem.get("ruleDefineId"))),
                        tDeviceModelId,
                        alertDefineItemNew.get("title"),
                        alertDefineItemNew.get("category"),
                        alertDefineItemNew.get("number"),
                        alertDefineItemNew.get("level"),
                        alertDefineItemNew.get("descriptionPattern"),
                        alertDefineItemNew.get("repeat"),
                        alertDefineItemNew.get("minInterval"),
                        alertDefineItemNew.get("enable").equals("'false'") ? 0 : 1
                );
                executeSql(insertAlertDefineSql);
                tAlertDefineId++;
            }

            List<Map<String, Object>> alertTemplateDefineList = cd2kSourceJdbcTemplate.queryForList("SELECT * FROM n_AlertTemplateDefine WHERE alertTemplateId IN ( SELECT t.id FROM n_AlertTemplate t WHERE t.deviceModelId = ?) ORDER BY id ASC", sourceDeviceModelId);
            for (Map<String, Object> alertTemplateDefineItem :
                    alertTemplateDefineList) {
                alertTemplateDefineIdMap.put(String.valueOf(alertTemplateDefineItem.get("id")), String.valueOf(tAlertTemplateDefineId));
                String insertAlertTemplateDefineSql = String.format(insertAlertTemplateDefineTemplate,
                        tAlertTemplateDefineId,
                        tAlertTemplateId,
                        alertDefineIdMap.get(String.valueOf(alertTemplateDefineItem.get("alertDefineId")))
                );
                executeSql(insertAlertTemplateDefineSql);
                tAlertTemplateDefineId++;
            }
            tAlertTemplateId++;


            List<Map<String, Object>> ruleSensorDefineList = cd2kSourceJdbcTemplate.queryForList("SELECT * FROM n_RuleSensorDefine WHERE ruleDefineId IN ( SELECT t.ruleDefineId FROM n_AlertDefine t WHERE t.deviceModelId = ?) ORDER BY id ASC", sourceDeviceModelId);
            for (Map<String, Object> ruleSensorDefineItem :
                    ruleSensorDefineList) {
                Map<String, String> ruleSensorDefineItemNew = dealMap(ruleSensorDefineItem);
                String insertRuleSensorDefineSql = String.format(insertRuleSensorDefineTemplate,
                        tRuleSensorDefineId,
                        ruleDefineIdMap.get(String.valueOf(ruleSensorDefineItem.get("ruleDefineId"))),
                        sensorIdMap.get(String.valueOf(ruleSensorDefineItem.get("sensorDefineId"))),
                        ruleSensorDefineItemNew.get("limit")
                );
                executeSql(insertRuleSensorDefineSql);
                tRuleSensorDefineId++;
            }
            tAlertTemplateId++;
        }
    }

    @Test
    public void test() {

    }

    private void executeSql(String sql) {
        System.out.println(sql);
    }

    private Map<String, String> dealMap(Map<String, Object> map) {
        Map<String, String> result = new HashMap<>();
        for (Map.Entry<String, Object> item :
                map.entrySet()) {
            String value = null;
            if (item.getValue() != null) {
                value = "'" + item.getValue() + "'";
            }
            result.put(item.getKey(), value);
        }
        return result;
    }
}
