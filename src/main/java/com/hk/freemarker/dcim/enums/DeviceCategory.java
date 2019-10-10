package com.hk.freemarker.dcim.enums;

/**
 * Created by HomKey on 2019/9/23.
 */
public enum DeviceCategory {

    Terrain("5888AFD8-CC54-44C0-8683-44E8AEACDBAA","-1001","机房场景"),
    ColdChannel("0AA9D08B-40F2-44BE-B4A1-BB8384A1C55A","1","冷通道"),
    Cabinet("5E003ED5-C0AC-492C-93CC-00898BC244B1","2","机柜"),
    Server("AE412088-507D-4E66-B3E0-171885FCA737","9","服务器"),
    THSensor("8D1FAC7C-900C-4500-8D07-AFA716047858","101","温湿度传感器"),
    SmokeSensor("147AF444-952E-470B-8223-F2AD0D637ACB","102","烟感传感器"),
    UBit("613A93B1-EEE7-47B6-B7A3-5FCC9694DD3F","103","U位检测器"),
    FloodSensor("9E3306B0-5D80-466E-82E7-232BBB2B5211","104","水浸传感器"),
    GateSensor("9000721F-78E6-4358-A9FF-6D05DD3B3EE3","105","门磁传感器"),
    AirSensor("729F9BA5-8A46-4662-9EFB-740656508B7A","106","气压传感器"),
    EMH("356B9A8B-177F-4396-8879-DE29017C25E8","130","环境管理主机"),
    SEMS("47B0C661-2863-4EC3-BC8F-6F7D2B37B764","131","SEMS"),
    PDU("212D0831-EAF3-4534-AEC7-62F1085D3488","132","PDU"),
    PDU2("9D8DA03C-0AB5-4681-81D5-1BE94FE2E3A2","133","智能PDU"),
    CRAC("0D171738-41A0-4074-AE96-E952898C235F","134","精密空调"),
    AC("B7338D48-8777-4A3E-A0B3-493E5E0492F2","135","普通空调"),
    UPS("4574715A-3829-4BA0-B119-5F51D37EC707","136","UPS"),
    PDC("CFA92988-85C1-4D59-9F85-28A49AC3CB84","137","配电柜"),
    PDC_Box("1630D8D6-8FC7-4575-886F-8257BF7A9DC5","138","配电箱"),
    ELM("87AB78AC-BCDF-49A5-8ADE-482167A9546B","139","电量仪"),
    BatteryGroup("84C1E9A8-208D-4397-9520-AB29876717DC","140","电池组"),
    Battery("5C606C3E-AC99-4A0C-9931-FBFED53853BC","141","蓄电池"),
    AirCheck("B4C5661C-C5FD-4842-957F-86D4F2DCB84F","142","气体检测器"),
    Fan("67306AC2-BF30-443F-BF96-6825C5B6BC75","143","新风机"),
    IOManager("2663B2C0-633D-418D-9838-7CF4C0402970","144","输入输出管理器")
    ;

    private String uuid;
    private String type;
    private String description;

    DeviceCategory(String uuid, String type, String description) {
        this.uuid = uuid;
        this.type = type;
        this.description = description;
    }

    public String getUuid() {
        return uuid;
    }
}
