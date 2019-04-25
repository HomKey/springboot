package com.hk.freemarker.dcim.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LuHj on 2019/4/13.
 */
@Data
public class Th {
    private String deviceId;
    private String index;
    private String name = "温湿度1探头";
    private String ip;
    private String port;
    private String busId;

    public static List<Th> getConfig(String[][] configs){

        List<Th> list = new ArrayList<>();
        for (String[] config:
                configs) {
            Th th = new Th();
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
