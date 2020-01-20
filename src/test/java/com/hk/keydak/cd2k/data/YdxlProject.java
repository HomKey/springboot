package com.hk.keydak.cd2k.data;

/**
 * Created by HomKey on 2020/1/16.
 */
public class YdxlProject {
    public static String deviceModelId = "106";
    public static String[][] sensorData = new String[][]{
            {"40024","CRAC.Voltage.A","A相电压","10"},
            {"40025","CRAC.Voltage.B","B相电压","10"},
            {"40026","CRAC.Voltage.C","C相电压","10"},
            {"40027","CRAC.Power.Frequency","电源频率","10"},
            {"40031","CRAC.ReturnAir.Temperature","回风温度1","10"},
            {"40032","CRAC.ReturnAir.Temperature1","回风温度2","10"},
            {"40033","CRAC.ReturnAir.Temperature2","回风温度3","10"},
            {"40034","CRAC.ReturnAir.Humidity","回风湿度1","10"},
            {"40035","CRAC.ReturnAir.Humidity1","回风湿度2","10"},
            {"40036","CRAC.ReturnAir.Humidity2","回风湿度3","10"},
            {"40037","CRAC.SupplyAir.Temperature","送风温度1","10"},
            {"40038","CRAC.SupplyAir.Temperature1","送风温度2","10"},
            {"40039","CRAC.SupplyAir.Temperature2","送风温度3","10"},
            {"40040","CRAC.SupplyAir.Humidity","送风湿度1","10"},
            {"40041","CRAC.SupplyAir.Humidity1","送风湿度2","10"},
            {"40042","CRAC.SupplyAir.Humidity2","送风湿度3","10"},
            {"40043","CRAC.Remote.Temperature1","远程温度1","10"},
            {"40044","CRAC.Remote.Temperature2","远程温度2","10"},
            {"40045","CRAC.Remote.Temperature3","远程温度3","10"},
            {"40046","CRAC.Remote.Temperature4","远程温度4","10"},
            {"40047","CRAC.Remote.Temperature5","远程温度5","10"},
            {"40048","CRAC.Remote.Temperature6","远程温度6","10"},
            {"40049","CRAC.Remote.Temperature7","远程温度7","10"},
            {"40050","CRAC.Remote.Temperature8","远程温度8","10"},
            {"40051","CRAC.Remote.Temperature9","远程温度9","10"},
            {"40052","CRAC.Remote.Temperature10","远程温度10","10"},
            {"40053","CRAC.Remote.Temperature11","远程温度11","10"},
            {"40054","CRAC.Remote.Temperature12","远程温度12","10"},
            {"40055","CRAC.Remote.Temperature13","远程温度13","10"},
            {"40056","CRAC.Remote.Temperature14","远程温度14","10"},
            {"40057","CRAC.Remote.Temperature15","远程温度15","10"},
            {"40058","CRAC.Remote.Temperature16","远程温度16","10"},
            {"40059","CRAC.Remote.Humidity1","远程湿度1","10"},
            {"40060","CRAC.Remote.Humidity2","远程湿度2","10"},
            {"40061","CRAC.Remote.Humidity3","远程湿度3","10"},
            {"40062","CRAC.Remote.Humidity4","远程湿度4","10"},
            {"40063","CRAC.Remote.Humidity5","远程湿度5","10"},
            {"40064","CRAC.Remote.Humidity6","远程湿度6","10"},
            {"40065","CRAC.Remote.Humidity7","远程湿度7","10"},
            {"40066","CRAC.Remote.Humidity8","远程湿度8","10"},
            {"40067","CRAC.Remote.Humidity9","远程湿度9","10"},
            {"40068","CRAC.Remote.Humidity10","远程湿度10","10"},
            {"40069","CRAC.Remote.Humidity11","远程湿度11","10"},
            {"40070","CRAC.Remote.Humidity12","远程湿度12","10"},
            {"40071","CRAC.Remote.Humidity13","远程湿度13","10"},
            {"40072","CRAC.Remote.Humidity14","远程湿度14","10"},
            {"40073","CRAC.Remote.Humidity15","远程湿度15","10"},
            {"40074","CRAC.Remote.Humidity16","远程湿度16","10"},
            {"40091","CRAC.Fan.1.Speed","风机1转速","1"},
            {"40092","CRAC.Fan.2.Speed","风机2转速","1"},
            {"40093","CRAC.Compressor.1.Capacity","压缩机1容量","1"},
            {"40094","CRAC.Compressor.2.Capacity","压缩机2容量","1"}
    };
}

//    INSERT INTO `n_DefaultCommand` (`id`, `deviceModelId`, `name`, `startRegister`, `length`, `commandType`, `commandString`, `commandBytes`, `classId`, `addr`, `ver`, `ctrlData`, `oidStart`)
//        VALUES ('253', '105', 'Modbus_AC_AI_40003_21', '40003', '21', '3', NULL, NULL, '47', NULL, NULL, NULL, NULL);


//INSERT INTO `n_SensorDefine` (`id`, `deviceModelId`, `name`, `displayName`, `description`, `registerIndex`, `scale`, `unit`, `isState`, `isBit`, `bitOrder`, `dividedBy`, `start`, `len`, `classId`, `parentId`, `attributeName`, `defaultCommandId`)
//        VALUES ('135996', '71', 'UPS.Alert.Inverter.NotUsed', 'UPS.Alert.Inverter.NotUsed', '逆变器没有被使用', '64', '0', NULL, '1', '0', '1', '0', NULL, NULL, '91', NULL, NULL, '67');
