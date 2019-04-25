package com.hk.freemarker.dcim.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LuHj on 2019/4/13.
 */
@Data
public class Ls {
    private String deviceId;
    private String index;
    private String name = "漏水";
    private String ip;
    private String port = "6001";
    private String busId = "253";

    public static List<Ls> getConfig(String[][] configs){
        List<Ls> list = new ArrayList<>();
        for (String[] config:
                configs) {
            Ls ls = new Ls();
            ls.setDeviceId(config[0]);
            ls.setIndex(config[1]);
            ls.setIp(config[2]);
            list.add(ls);
            System.out.println(ls.toString());
        }
        return list;
    }
}
