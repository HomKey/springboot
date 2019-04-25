package com.hk.freemarker.dcim.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LuHj on 2019/4/13.
 */
@Data
public class SndAc {
    private String deviceId;
    private String index;
    private String name = "施耐德精密空调";
    private String ip;
    private String port;
    private String busId;

    public static List<SndAc> getConfig(String[][] configs){
        List<SndAc> list = new ArrayList<>();
        for (String[] config:
                configs) {
            SndAc amsAc = new SndAc();
            amsAc.setDeviceId(config[0]);
            amsAc.setIndex(config[1]);
            amsAc.setIp(config[2]);
            amsAc.setPort(config[3]);
            amsAc.setBusId(config[4]);
            list.add(amsAc);
            System.out.println(amsAc.toString());
        }
        return list;
    }
}
