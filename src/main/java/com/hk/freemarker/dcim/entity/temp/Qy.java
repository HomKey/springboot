package com.hk.freemarker.dcim.entity.temp;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LuHj on 2019/4/13.
 */
@Data
public class Qy {
    private String deviceId;
    private String index;
    private String name = "气压";
    private String ip;
    private String port;
    private String busId;

    public static List<Qy> getConfig(String[][] configs){
        List<Qy> list = new ArrayList<>();
        for (String[] config:
                configs) {
            Qy eyht = new Qy();
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
