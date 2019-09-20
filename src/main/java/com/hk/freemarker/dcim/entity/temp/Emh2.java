package com.hk.freemarker.dcim.entity.temp;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LuHj on 2019/4/13.
 */
@Data
public class Emh2 {
    private String deviceId;
    private String index;
    private String name = "消防主机";
    private String ip;
    private String port;
    private String busId;

    public static List<Emh2> getConfig(String[][] configs){
        List<Emh2> list = new ArrayList<>();
        for (String[] config:
                configs) {
            Emh2 eyht = new Emh2();
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
