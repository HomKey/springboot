package com.hk.freemarker.dcim.entity.temp;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LuHj on 2019/4/13.
 */
@Data
public class Pdc {
    private String deviceId;
    private String name = "MA01C配电柜";
    private String index;
    private String ip;
    private String port = "6001";
    private String busId = "1";

    public static List<Pdc> getConfig(String[][] configs){
        List<Pdc> list = new ArrayList<>();
        for (String[] config:
                configs) {
            Pdc pdc = new Pdc();
            pdc.setDeviceId(config[0]);
            pdc.setIndex(config[1]);
            pdc.setIp(config[2]);
            list.add(pdc);
            System.out.println(pdc.toString());
        }
        return list;
    }
}
