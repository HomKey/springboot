package com.hk.freemarker.dcim.enums;


/**
 * Created by HomKey on 2019/9/23.
 */
public enum DeviceType {
    EMH("channelList","channel"),
    PM5350BW("elmList","pm535-bw"),
    TH("thList","th"),
    PDC("pdcList","pdc"),
    FLOOR("floorList","floor"),
    PDU3("pduList","pdu3"),
    GALAXY300("upsList","galaxy300"),
    DME3000("dmeList","DataMate3000"),
    Hipulse("hipulseList","Hipulse"),
    ACM03U1("acmList","ACM03U1");

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
