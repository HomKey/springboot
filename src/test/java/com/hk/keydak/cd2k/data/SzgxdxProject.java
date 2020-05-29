package com.hk.keydak.cd2k.data;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by HomKey on 2020/1/16.
 */
public class SzgxdxProject {
    public static String deviceModelId = "107";
    public static String deviceModelId2 = "108";
    public static String deviceModelId4 = "111";
    public static String[][] sensorData = new String[][]{
            {"MR33.In.Voltage.U", "100", "1", "Modbus_192_168_168_10_6001_2_AI_100_27", "10", "系统输入U相电压"},
            {"MR33.In.Voltage.V", "101", "1", "Modbus_192_168_168_10_6001_2_AI_100_27", "10", "系统输入V相电压"},
            {"MR33.In.Voltage.W", "102", "1", "Modbus_192_168_168_10_6001_2_AI_100_27", "10", "系统输入W相电压"},
            {"MR33.In.Voltage.UV", "103", "1", "Modbus_192_168_168_10_6001_2_AI_100_27", "10", "系统输入U-V电压"},
            {"MR33.In.Voltage.VW", "104", "1", "Modbus_192_168_168_10_6001_2_AI_100_27", "10", "系统输入V-W电压"},
            {"MR33.In.Voltage.WU", "105", "1", "Modbus_192_168_168_10_6001_2_AI_100_27", "10", "系统输入W-U电压"},
            {"MR33.In.Current.U", "106", "1", "Modbus_192_168_168_10_6001_2_AI_100_27", "10", "系统输入U相电流"},
            {"MR33.In.Current.V", "107", "1", "Modbus_192_168_168_10_6001_2_AI_100_27", "10", "系统输入V相电流"},
            {"MR33.In.Current.W", "108", "1", "Modbus_192_168_168_10_6001_2_AI_100_27", "10", "系统输入W相电流"},
            {"MR33.In.Frequency", "109", "1", "Modbus_192_168_168_10_6001_2_AI_100_27", "10", "系统输入频率"},
            {"MR33.Pass.Voltage.U", "110", "1", "Modbus_192_168_168_10_6001_2_AI_100_27", "10", "系统旁路U相电压"},
            {"MR33.Pass.Voltage.V", "111", "1", "Modbus_192_168_168_10_6001_2_AI_100_27", "10", "系统旁路V相电压"},
            {"MR33.Pass.Voltage.W", "112", "1", "Modbus_192_168_168_10_6001_2_AI_100_27", "10", "系统旁路W相电压"},
            {"MR33.Pass.Voltage.UV", "113", "1", "Modbus_192_168_168_10_6001_2_AI_100_27", "10", "系统旁路U-V电压"},
            {"MR33.Pass.Voltage.VW", "114", "1", "Modbus_192_168_168_10_6001_2_AI_100_27", "10", "系统旁路V-W电压"},
            {"MR33.Pass.Voltage.WU", "115", "1", "Modbus_192_168_168_10_6001_2_AI_100_27", "10", "系统旁路W-U电压"},
            {"MR33.Pass.Frequency", "116", "1", "Modbus_192_168_168_10_6001_2_AI_100_27", "10", "系统旁路频率"},
            {"MR33.Battery.Positive.Voltage", "117", "1", "Modbus_192_168_168_10_6001_2_AI_100_27", "10", "正电池组电压"},
            {"MR33.Battery.Positive.Current", "118", "1", "Modbus_192_168_168_10_6001_2_AI_100_27", "10", "正电池组电流"},
            {"MR33.Battery.Capacity", "119", "1", "Modbus_192_168_168_10_6001_2_AI_100_27", "10", "电池组容量"},
            {"MR33.Battery.Negative.Voltage", "120", "1", "Modbus_192_168_168_10_6001_2_AI_100_27", "10", "负电池组电压"},
            {"MR33.Battery.Negative.Current", "121", "1", "Modbus_192_168_168_10_6001_2_AI_100_27", "10", "负电池组电流"},
            {"MR33.Battery.Remain.H", "123", "0", "Modbus_192_168_168_10_6001_2_AI_100_27", "1", "电池剩余放电时间(时)"},
            {"MR33.Battery.Remain.M", "124", "0", "Modbus_192_168_168_10_6001_2_AI_100_27", "1", "电池剩余放电时间(分)"},
            {"MR33.Battery.Temperature", "125", "1", "Modbus_192_168_168_10_6001_2_AI_100_27", "10", "电池温度"},
            {"MR33.Battery.State", "126", "0", "Modbus_192_168_168_10_6001_2_AI_100_27", "1", "电池状态"},
            {"MR33.Out.Voltage.U", "127", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输出U相电压"},
            {"MR33.Out.Voltage.V", "128", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输出V相电压"},
            {"MR33.Out.Voltage.W", "129", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输出W相电压"},
            {"MR33.Out.Voltage.UV", "130", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输出U-V电压"},
            {"MR33.Out.Voltage.VW", "131", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输出V-W电压"},
            {"MR33.Out.Voltage.WU", "132", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输出W-U电压"},
            {"MR33.Out.Current.U", "133", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输出U相电流"},
            {"MR33.Out.Current.V", "134", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输出V相电流"},
            {"MR33.Out.Current.W", "135", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输出W相电流"},
            {"MR33.Out.Frequency", "136", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输出频率"},
            {"MR33.Out.LoadRatio.U", "137", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输出U相负载百分比"},
            {"MR33.Out.LoadRatio.V", "138", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输出V相负载百分比"},
            {"MR33.Out.LoadRatio.W", "139", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输出W相负载百分比"},
            {"MR33.Out.ApparentPower.U", "140", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输出U相输出视在功率"},
            {"MR33.Out.ApparentPower.V", "141", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输出V相输出视在功率"},
            {"MR33.Out.ApparentPower.W", "142", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输出W相输出视在功率"},
            {"MR33.Out.ActivePower.U", "143", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输出U相输出有功功率"},
            {"MR33.Out.ActivePower.V", "144", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输出V相输出有功功率"},
            {"MR33.Out.ActivePower.W", "145", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输出W相输出有功功率"},
            {"MR33.Out.PowerFactor.U", "146", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输出U相功率因数"},
            {"MR33.Out.PowerFactor.V", "147", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输出V相功率因数"},
            {"MR33.Out.PowerFactor.W", "148", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输出W相功率因数"},
            {"MR33.In.ApparentPower.U", "149", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输入U相视在功率"},
            {"MR33.In.ApparentPower.V", "150", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输入U相视在功率"},
            {"MR33.In.ApparentPower.W", "151", "1", "Modbus_192_168_168_10_6001_2_AI_127_36", "10", "系统输入U相视在功率"},
            {"MR33.Run.State", "152", "0", "Modbus_192_168_168_10_6001_2_AI_127_36", "1", "系统运行状态"}
    };


    public static String[][] sensorData3 = new String[][]{
            {"MR33.CAN.Alarm", "153", "Modbus_192_168_168_10_6001_2_AI_127_36", "0"},
            {"MR33.Out.Voltage.U.Alarm", "153", "Modbus_192_168_168_10_6001_2_AI_127_36", "1"},
            {"MR33.Out.Voltage.V.Alarm", "153", "Modbus_192_168_168_10_6001_2_AI_127_36", "2"},
            {"MR33.Out.Voltage.W.Alarm", "153", "Modbus_192_168_168_10_6001_2_AI_127_36", "3"},
            {"MR33.Out.InverterVoltage.U.Over.Alarm", "153", "Modbus_192_168_168_10_6001_2_AI_127_36", "4"},
            {"MR33.Out.InverterVoltage.V.Over.Alarm", "153", "Modbus_192_168_168_10_6001_2_AI_127_36", "5"},
            {"MR33.Out.InverterVoltage.W.Over.Alarm", "153", "Modbus_192_168_168_10_6001_2_AI_127_36", "6"},
            {"MR33.Out.InverterVoltage.U.Less.Alarm", "153", "Modbus_192_168_168_10_6001_2_AI_127_36", "7"},
            {"MR33.Out.InverterVoltage.V.Less.Alarm", "153", "Modbus_192_168_168_10_6001_2_AI_127_36", "8"},
            {"MR33.Out.InverterVoltage.W.Less.Alarm", "153", "Modbus_192_168_168_10_6001_2_AI_127_36", "9"},
            {"MR33.Out.Load.U.Over.Alarm", "153", "Modbus_192_168_168_10_6001_2_AI_127_36", "0"},
            {"MR33.Out.Load.V.Over.Alarm", "153", "Modbus_192_168_168_10_6001_2_AI_127_36", "1"},
            {"MR33.Out.Load.W.Over.Alarm", "153", "Modbus_192_168_168_10_6001_2_AI_127_36", "2"},
            {"MR33.Out.Switch.Break.Alarm", "153", "Modbus_192_168_168_10_6001_2_AI_127_36", "3"},
            {"MR33.Out.Battery.Alarm", "153", "Modbus_192_168_168_10_6001_2_AI_127_36", "5"},
            {"MR33.Out.Pass.Contactor.Alarm", "154", "Modbus_192_168_168_10_6001_2_AI_127_36", "0"},
            {"MR33.Inverter.Contactor.Alarm", "154", "Modbus_192_168_168_10_6001_2_AI_127_36", "1"},
            {"MR33.Pass.Phase.Alarm", "154", "Modbus_192_168_168_10_6001_2_AI_127_36", "3"},
            {"MR33.RS485.Alarm", "154", "Modbus_192_168_168_10_6001_2_AI_127_36", "4"},
            {"MR33.DC.BUS.Alarm", "154", "Modbus_192_168_168_10_6001_2_AI_127_36", "7"},
            {"MR33.E2PROM.Alarm", "154", "Modbus_192_168_168_10_6001_2_AI_127_36", "8"},
            {"MR33.DC.BUS.PositiveVoltage.Less.Alarm", "154", "Modbus_192_168_168_10_6001_2_AI_127_36", "9"},
            {"MR33.DC.BUS.NegativeVoltage.Less.Alarm", "154", "Modbus_192_168_168_10_6001_2_AI_127_36", "0"},
            {"MR33.In.Phase.Alarm", "154", "Modbus_192_168_168_10_6001_2_AI_127_36", "0"},
            {"MR33.In.U.Voltage.Alarm", "155", "Modbus_192_168_168_10_6001_2_AI_127_36", "0"},
            {"MR33.In.V.Voltage.Alarm", "155", "Modbus_192_168_168_10_6001_2_AI_127_36", "1"},
            {"MR33.In.W.Voltage.Alarm", "155", "Modbus_192_168_168_10_6001_2_AI_127_36", "2"},
            {"MR33.In.Frequency.Alarm", "155", "Modbus_192_168_168_10_6001_2_AI_127_36", "3"},
            {"MR33.In.Pass.Voltage.Alarm", "155", "Modbus_192_168_168_10_6001_2_AI_127_36", "4"},
            {"MR33.In.Pass.Voltage.Alarm", "155", "Modbus_192_168_168_10_6001_2_AI_127_36", "5"},
            {"MR33.In.Pass.Voltage.Alarm", "155", "Modbus_192_168_168_10_6001_2_AI_127_36", "6"},
            {"MR33.In.Pass.Frequency.Alarm", "155", "Modbus_192_168_168_10_6001_2_AI_127_36", "7"},
            {"MR33.Module.ID.Alarm", "155", "Modbus_192_168_168_10_6001_2_AI_127_36", "8"},
            {"MR33.Inverter.Asynchronous.Alarm", "155", "Modbus_192_168_168_10_6001_2_AI_127_36", "9"},
            {"MR33.Out.U.Voltage.Over.Alarm", "155", "Modbus_192_168_168_10_6001_2_AI_127_36", "0"},
            {"MR33.Out.V.Voltage.Over.Alarm", "155", "Modbus_192_168_168_10_6001_2_AI_127_36", "1"},
            {"MR33.Out.W.Voltage.Over.Alarm", "155", "Modbus_192_168_168_10_6001_2_AI_127_36", "1"}
    };
    public static String[][] sensorData2 = new String[][]{
            {"XRowDX.Alert.ReturnAir.Temperature.Over", "1280", "0", "112", "1"},
            {"XRowDX.Alert.ReturnAir.Temperature.Less", "1281", "0", "112", "1"},
            {"XRowDX.Alert.ReturnAir.Humidity.Over", "1282", "0", "112", "1"},
            {"XRowDX.Alert.ReturnAir.Humidity.Less", "1283", "0", "112", "1"},
            {"XRowDX.Alert.ReturnAir.T.1.Touble", "1284", "0", "112", "1"},
            {"XRowDX.Alert.ReturnAir.T.2.Touble", "1285", "0", "112", "1"},
            {"XRowDX.Alert.ReturnAir.T.3.Touble", "1286", "0", "112", "1"},
            {"XRowDX.Alert.OutAir.1.T.Touble", "1287", "0", "112", "1"},
            {"XRowDX.Alert.OutAir.2.T.Touble", "1288", "0", "112", "1"},
            {"XRowDX.Alert.OutAir.3.T.Touble", "1289", "0", "112", "1"},
            {"XRowDX.Alert.ReturnAir.H.Touble", "1290", "0", "112", "1"},
            {"XRowDX.Alert.WithinFan.1.Touble", "1292", "0", "112", "1"},
            {"XRowDX.Alert.WithinFan.2.Touble", "1293", "0", "112", "1"},
            {"XRowDX.Alert.WithinFan.3.Touble", "1294", "0", "112", "1"},
            {"XRowDX.Alert.WithinFan.4.Touble", "1295", "0", "112", "1"},
            {"XRowDX.Alert.WithinFan.5.Touble", "1296", "0", "112", "1"},
            {"XRowDX.Alert.WithinFan.6.Touble", "1297", "0", "112", "1"},
            {"XRowDX.Alert.Straniner.Clogged", "1303", "0", "112", "1"},
            {"XRowDX.Alert.Humidification.Current.Less", "1306", "0", "112", "1"},
            {"XRowDX.Alert.Humidification.Current.Over", "1307", "0", "112", "1"},
            {"XRowDX.Alert.Humidification.Water.Over", "1308", "0", "112", "1"},
            {"XRowDX.Alert.Floor.Overflow", "1309", "0", "112", "1"},
            {"XRowDX.Alert.Mains.Voltage.Over", "1310", "0", "112", "1"},
            {"XRowDX.Alert.Mains.Voltage.Less", "1311", "0", "112", "1"},
            {"XRowDX.Alert.Condensation.Water.Over", "1315", "0", "112", "1"},
            {"XRowDX.Alert.System.Pressure.Over", "1321", "0", "112", "1"},
            {"XRowDX.Alert.System.Pressure.Less", "1322", "0", "112", "1"},
            {"XRowDX.Alert.RefrigerationSystem.Exception", "1335", "0", "112", "1"},
            {"XRowDX.Alert.Smoke", "1354", "0", "112", "1"},
            {"XRowDX.Alert.Condensation.T.Trouble", "1355", "0", "112", "1"},
            {"XRowDX.Alert.InAir.T.Trouble", "1357", "0", "112", "1"},
            {"XRowDX.Alert.OutAir.T.Trouble", "1359", "0", "112", "1"},
            {"XRowDX.Alert.Pressure.Less.Trouble", "1361", "0", "112", "1"},
            {"XRowDX.Alert.Module.Current.Over", "1385", "0", "112", "1"},
            {"XRowDX.Alert.Module.Temperature.Over", "1386", "0", "112", "1"},
            {"XRowDX.Alert.Module.Voltage.Over", "1387", "0", "112", "1"},
            {"XRowDX.Alert.Module.Voltage.Less", "1388", "0", "112", "1"},
            {"XRowDX.Alert.Module.Trouble", "1390", "0", "112", "1"},
            {"XRowDX.Alert.Module.WithinFan.Connect.Trouble", "1391", "0", "112", "1"},
            {"XRowDX.WithinFan.State", "512", "0", "21", "1"},
            {"XRowDX.Compressors.State", "513", "0", "21", "1"},
            {"XRowDX.ElectricHeater.1.State", "515", "0", "21", "1"},
            {"XRowDX.ElectricHeater.2.State", "516", "0", "21", "1"},
            {"XRowDX.Humidification.State", "518", "0", "21", "1"},
            {"XRowDX.WithoutFan.State", "519", "0", "21", "1"},
            {"XRowDX.Switch.State", "532", "0", "21", "1"},
            {"XRowDX.ReturnAir.1.Temperature", "256", "1", "14", "10"},
            {"XRowDX.ReturnAir.2.Temperature", "257", "1", "14", "10"},
            {"XRowDX.ReturnAir.3.Temperature", "258", "1", "14", "10"},
            {"XRowDX.ReturnAir.Remote.Temperature", "259", "1", "14", "10"},
            {"XRowDX.OutAir.1.Temperature", "261", "1", "14", "10"},
            {"XRowDX.OutAir.2.Temperature", "262", "1", "14", "10"},
            {"XRowDX.OutAir.3.Temperature", "263", "1", "14", "10"},
            {"XRowDX.ReturnAir.1.Humidity", "269", "1", "14", "10"},
            {"XRowDX.OutAir.1.Humidity", "270", "1", "14", "10"},
            {"XRowDX.ReturnAir.3.Humidity", "271", "1", "14", "10"}
    };

    public static String[][] sensorData4 = new String[][]{
            {"5000", "电池异常", "0-正常；1-异常 电池综合故障位"},
            {"5001", "电池供电", "0-非电池供电态； 1-电池供电态 电池逆变态指示位"},
            {"5002", "电池电量低", "0-正常；1-异常 电池欠压告警，置 1 时会同时触发 5000"},
            {"5003", "电池耗尽", "0-正常；1-异常 电池欠压保护，置 1 时会同时触发 5000"},
            {"5004", "市电异常", "0-正常；1-异常 市电（输入）综合故障位"},
            {"5005", "输出异常", "0-正常；1-异常 输出综合故障位"},
            {"5006", "输出过载", "0-正常；1-异常 变或旁路输出过载告警与输出过载保护综合位，置 1 时会同时触发5005"},
            {"5007", "旁路异常", "0-正常；1-异常 旁路综合故障位"},
            {"5008", "旁路供电", "0-非旁路态； 1-旁路输出态 旁路输出态指示位"},
            {"5009", "开关机状态", "0-关机；1-开机"},
            {"5010", "电池测试中", "0-无；1-动作 电池测试指示位"},
            {"5011", "UPS 其他故障", "0-正常；1-异常 UPS 除 5000、5004、5005、5007、EPO 外的其他故障"},
            {"5012", "蜂鸣器状态", "0-无声；1-鸣叫 鼎坚协议"},
            {"5013", "维护旁路空开状态", "0-断开；1-闭合 鼎坚协议 空开状态"},
            {"5014", "EPO", "0-关闭；1-开启 鼎坚协议"},
            {"5015", "UPS 类型", "0-塔式；1-模块化 科华"}
    };

    public static String[][] sensorData5 = new String[][]{
            {"5000","电池性能状态","1-电池物理链路异常；2-电池正常；3-电池低压告警；4-电池低压保护"},
            {"5001","电池剩余供电时间","1min"},
            {"5002","电池剩余容量","1%"},
            {"5003","电池温度","0.1℃；0x8000","表示温度传感器未接"},
            {"5004","输入相数",""},
            {"5005","输入（市电）频率","0.01Hz"},
            {"5006","输入U相电压","0.1V"},
            {"5007","输入V相电压","0.1V"},
            {"5008","输入W相电压","0.1V"},
            {"5009","输入U相电流","1A"},
            {"5010","输入V相电流","1A"},
            {"5011","输入W相电流","1A"},
            {"5012","输出工作方式","1-其它；2-无输出；3-市电逆变；4-旁路；5-电池逆变；6-Booster；7-reducer；"},
            {"5013","输出相数",""},
            {"5014","输出频率","0.01Hz"},
            {"5015","输出U相电压","0.1V"},
            {"5016","输出V相电压","0.1V"},
            {"5017","输出W相电压","0.1V"},
            {"5018","输出U相电流","1A"},
            {"5019","输出V相电流","1A"},
            {"5020","输出W相电流","1A"},
            {"5021","输出U相有功功率","0.1kW"},
            {"5022","输出V相有功功率","0.1kW"},
            {"5023","输出W相有功功率","0.1kW"},
            {"5024","输出U相负载率","0.1%"},
            {"5025","输出V相负载率","0.1%"},
            {"5026","输出W相负载率","0.1%"},
            {"5027","旁路相数","KH01-M033(2)-12"},
            {"5028","旁路输入频率","0.01Hz"},
            {"5029","旁路U相电压","0.1V"},
            {"5030","旁路V相电压","0.1V"},
            {"5031","旁路W相电压","0.1V"},
            {"5032","旁路U相电流","1A"},
            {"5033","旁路V相电流","1A"},
            {"5034","旁路W相电流","1A"},
            {"5035","旁路U相有功功率","0.1kW"},
            {"5036","旁路V相有功功率","0.1kW"},
            {"5037","旁路W相有功功率","0.1kW"},
            {"5038","额定输入电压","1V"},
            {"5039","额定输入频率","1Hz"},
            {"5040","额定输出电压","1V"},
            {"5041","额定输出频率","1Hz"},
            {"5042","额定输出有功功率","1kVA"},
            {"5043","额定输出视在功率","1kVA"},
            {"5044","额定电池电压","1V"}
    };
    public static String[][] sensorData6 = new String[][]{
            {"5130","整流工作状态","0-启动中；1-故障； 2-市电升压；3-电池升压"},
            {"5131","电池运行状态","0-放电；1-均充；2-浮充；3-未知"},
            {"5132","电池节数",""},
            {"5133","输出 U 相视在功率","0.1kVA"},
            {"5134","输出 V 相视在功率","0.1kVA"},
            {"5135","输出 W 相视在功率","0.1kVA"},
            {"5136","旁路 U 相视功功率","0.1kVA"},
            {"5137","旁路 V 相视功功率","0.1kVA"},
            {"5138","旁路 W 相视功功率","0.1kVA"},
            {"5139","正电池组电压","0.1V"},
            {"5140","负电池组电压","0.1V"},
            {"5141","正电池组放电电流","1A"},
            {"5142","负电池组放电电流","1A"},
            {"5143","正电池组充电电流","0.1A"},
            {"5144","负电池组充电电流","0.1A"},
    };

    public static Map<String, String> zhChange = new HashMap<>();
    public static String[] zhChange2 = new String[]{
            "系统CAN通信异常",
            "U相逆变输出电压异常",
            "V相逆变输出电压异常",
            "W相逆变输出电压异常",
            "U相逆变输出过压",
            "V相逆变输出过压",
            "W相逆变输出过压",
            "U相逆变输出欠压",
            "V相逆变输出欠压",
            "W相逆变输出欠压",
            "U相输出过载保护",
            "V相输出过载保护",
            "W相输出过载保护",
            "输出空开断开",
            "电池回路异常",
            "旁路接触器异常",
            "逆变接触器异常",
            "旁路相序错误",
            "RS485通信异常",
            "直流正负母线不平衡",
            "E2PROM故障",
            "直流正母线欠压",
            "直流负母线欠压",
            "市电输入相序错误",
            "U相交流输入电压异常",
            "V相交流输入电压异常",
            "W相交流输入电压异常",
            "交流输入频率异常",
            "U相旁路输入电压异常",
            "V相旁路输入电压异常",
            "W相旁路输入电压异常",
            "旁路输入频率异常",
            "模块ID错误",
            "逆变旁路不同步",
            "U相输出过载告警",
            "V相输出过载告警",
            "W相输出过载告警"
    };

    static {
        zhChange.put("XRowDX.OutAir.1.Temperature", "1#出风温度");
        zhChange.put("XRowDX.OutAir.2.Temperature", "2#出风温度");
        zhChange.put("XRowDX.OutAir.3.Temperature", "3#出风温度");
        zhChange.put("XRowDX.ReturnAir.1.Humidity", "1#回风湿度");
        zhChange.put("XRowDX.ReturnAir.3.Temperature", "3#回风温度");
        zhChange.put("XRowDX.ReturnAir.Remote.Temperature", "拉远回风");
        zhChange.put("XRowDX.Alert.ReturnAir.Temperature.Over", "回风高温告警");
        zhChange.put("XRowDX.Alert.ReturnAir.Temperature.Less", "回风低温告警");
        zhChange.put("XRowDX.Alert.ReturnAir.Humidity.Over", "回风高湿告警");
        zhChange.put("XRowDX.Alert.ReturnAir.Humidity.Less", "回风低湿告警");
        zhChange.put("XRowDX.Alert.ReturnAir.T.1.Touble", "1#回风温感故障");
        zhChange.put("XRowDX.Alert.ReturnAir.T.2.Touble", "2#回风温感故障");
        zhChange.put("XRowDX.Alert.ReturnAir.T.3.Touble", "3#回风温感故障");
        zhChange.put("XRowDX.Alert.OutAir.1.T.Touble", "1#出风温感故障");
        zhChange.put("XRowDX.Alert.OutAir.2.T.Touble", "2#出风温感故障");
        zhChange.put("XRowDX.Alert.OutAir.3.T.Touble", "3#出风温感故障");
        zhChange.put("XRowDX.Alert.ReturnAir.H.Touble", "回风湿感故障");
        zhChange.put("XRowDX.Alert.WithinFan.1.Touble", "1#内风机故障");
        zhChange.put("XRowDX.Alert.WithinFan.2.Touble", "2#内风机故障");
        zhChange.put("XRowDX.Alert.WithinFan.3.Touble", "3#内风机故障");
        zhChange.put("XRowDX.Alert.WithinFan.4.Touble", "4#内风机故障");
        zhChange.put("XRowDX.Alert.WithinFan.5.Touble", "5#内风机故障");
        zhChange.put("XRowDX.Alert.WithinFan.6.Touble", "6#内风机故障");
        zhChange.put("XRowDX.Alert.Straniner.Clogged", "滤网堵塞告警");
        zhChange.put("XRowDX.Alert.Humidification.Current.Less", "电极加湿电流过小");
        zhChange.put("XRowDX.Alert.Humidification.Current.Over", "电极加湿电流过大");
        zhChange.put("XRowDX.Alert.Humidification.Water.Over", "电极加湿水位过高");
        zhChange.put("XRowDX.Alert.Floor.Overflow", "地板溢水");
        zhChange.put("XRowDX.Alert.Mains.Voltage.Over", "电源电压过高");
        zhChange.put("XRowDX.Alert.Mains.Voltage.Less", "电源电压过低");
        zhChange.put("XRowDX.Alert.Condensation.Water.Over", "冷凝水位过高");
        zhChange.put("XRowDX.Alert.System.Pressure.Over", "系统高压");
        zhChange.put("XRowDX.Alert.System.Pressure.Less", "系统低压");
        zhChange.put("XRowDX.Alert.RefrigerationSystem.Exception", "制冷系统异常");
        zhChange.put("XRowDX.Alert.Smoke", "烟感告警");
        zhChange.put("XRowDX.Alert.Condensation.T.Trouble", "冷凝温感失效");
        zhChange.put("XRowDX.Alert.InAir.T.Trouble", "吸气温感失效");
        zhChange.put("XRowDX.Alert.OutAir.T.Trouble", "排气温感失效");
        zhChange.put("XRowDX.Alert.Pressure.Less.Trouble", "低压传感器失效");
        zhChange.put("XRowDX.Alert.Module.Current.Over", "模块过流");
        zhChange.put("XRowDX.Alert.Module.Temperature.Over", "模块过温");
        zhChange.put("XRowDX.Alert.Module.Voltage.Over", "模块过压");
        zhChange.put("XRowDX.Alert.Module.Voltage.Less", "模块欠压");
        zhChange.put("XRowDX.Alert.Module.Trouble", "模块故障");
        zhChange.put("XRowDX.Alert.Module.WithinFan.Connect.Trouble", "内外机通信故障");
        zhChange.put("XRowDX.WithinFan.State", "内风机状态");
        zhChange.put("XRowDX.Compressors.State", "压缩机状态");
        zhChange.put("XRowDX.ElectricHeater.1.State", "1#电加热状态");
        zhChange.put("XRowDX.ElectricHeater.2.State", "2#电加热状态");
        zhChange.put("XRowDX.Humidification.State", "加湿状态");
        zhChange.put("XRowDX.WithoutFan.State", "外风机状态");
        zhChange.put("XRowDX.Switch.State", "系统开关机状态");
        zhChange.put("XRowDX.ReturnAir.1.Temperature", "1#回风温度");
        zhChange.put("XRowDX.ReturnAir.2.Temperature", "2#回风温度");
        zhChange.put("XRowDX.OutAir.1.Humidity", "1#出风湿度");
        zhChange.put("XRowDX.ReturnAir.3.Humidity", "3#回风湿度");
    }
}