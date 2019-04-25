package com.hk.freemarker.dcim.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LuHj on 2019/4/13.
 */
@Data
public class Pfj {
    private String deviceId;
    private String index;
    private String name = "排风机";
    private String ip;
    private String port;
    private String busId;
    public static List<Pfj> getConfig(String[][] configs){
        List<Pfj> list = new ArrayList<>();
        for (String[] config:
                configs) {
            Pfj th = new Pfj();
            th.setDeviceId(config[0]);
            th.setIndex(config[1]);
            th.setName(config[2]);
            th.setIp(config[3]);
            th.setPort(config[4]);
            th.setBusId(config[5]);
            list.add(th);
            System.out.println(th.toString());
        }
        return list;
    }
}
