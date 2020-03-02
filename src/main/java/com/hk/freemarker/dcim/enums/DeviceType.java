package com.hk.freemarker.dcim.enums;


/**
 * Created by HomKey on 2019/9/23.
 */
public enum DeviceType {
    EMH("channelList","channel"),
    EMH_XF("channelList","channel"),
    EMHv2("emhList","CAEMHv2"),
    PM5350BW("elmList","pm5350bw"),
    PM5350BW_ZL("elmList","pm5350bw"),
    TH("thList","th"),
    TH_ZL("thList","th"),
    PDC("pdcList","pdc"),
    FLOOR("floorList","floor"),
    FLOOR_ZL("floorList","floor"),
    PDC_ZL("pdcList","pdc"),
    PDU3("pduList","pdu3"),
    Cabinet("cabinetList","cabinet"),
    CabinetPduV2("pduList","cabinet"),
    GALAXY300("upsList","galaxy300"),
    DME3000("dmeList","DataMate3000"),
    Hipulse("hipulseList","Hipulse"),
    ACM03U1("acmList","ACM03U1"),
    Unity("unityList","unity"),
    DME_Modbus("dmeList","dme_Modbus"),
    ACRD300("acrdList","ACRD300"),
    FanTsd("tsdList","TSD"),
    PDUv2("pduList","pdu2"),
    Hc_Ek5a("elmList","ek5a"),
    Hc_DTM("elmList","DTM830C"),
    Hc_PDC("pdcList","pdc"),
    Hc_UPS("upsList","galaxy5500"),
    Hc_CRAC("acList","pex"),
    Hc_AC("acList","XROW"),
    Hc_TH("thList","WS11R"),
    Hc_DIOM("diomList","BC-U301"),
    Hc_EMH("channelList","channel");

    private String key;
    private String path;

    DeviceType(String key, String path) {
        this.key = key;
        this.path = path;
    }

    public String getKey() {
        return key;
    }

    public String getPath() {
        return path;
    }
}
