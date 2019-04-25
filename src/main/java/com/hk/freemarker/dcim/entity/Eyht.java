package com.hk.freemarker.dcim.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LuHj on 2019/4/13.
 */
@Data
public class Eyht {
    private String deviceId;
    private String index;
    private String name = "二氧化碳探测器";
    private String ip;
    private String port;
    private String busId;

    public static List<Eyht> getConfig(String[][] configs){
        List<Eyht> list = new ArrayList<>();
        for (String[] config:
                configs) {
            Eyht eyht = new Eyht();
            eyht.setDeviceId(config[0]);
            eyht.setIndex(config[1]);
            eyht.setIp(config[2]);
            eyht.setPort(config[3]);
            eyht.setBusId(config[4]);
            list.add(eyht);
            System.out.println(eyht.toString());
        }
        return list;
    }

}
