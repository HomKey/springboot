package com.hk.freemarker.dcim.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LuHj on 2019/4/13.
 */
@Data
public class Acrel {
    private String deviceId;
    private String name = "Acrel智能电表";
    private String index;
    private String ip;
    private String port;
    private String busId;

    public static List<Acrel> getConfig(String[][] configs){
        List<Acrel> list = new ArrayList<>();
        for (String[] config:
        configs) {
            Acrel acrel = new Acrel();
            acrel.setDeviceId(config[0]);
            acrel.setIndex(config[1]);
            acrel.setIp(config[2]);
            acrel.setPort(config[3]);
            list.add(acrel);
            System.out.println(acrel.toString());
        }
        return list;
    }
}
