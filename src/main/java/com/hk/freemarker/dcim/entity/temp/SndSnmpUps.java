package com.hk.freemarker.dcim.entity.temp;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LuHj on 2019/4/13.
 */
@Data
public class SndSnmpUps {
    private String deviceId;
    private String index;
    private String name = "施耐德SNMP-UPS";
    private String ip;
    private String port;
    private String busId;
    public static List<SndSnmpUps> getConfig(String[][] configs){
        List<SndSnmpUps> list = new ArrayList<>();
        for (String[] config:
                configs) {
            SndSnmpUps th = new SndSnmpUps();
            th.setDeviceId(config[0]);
            th.setIndex(config[1]);
            th.setIp(config[2]);
            list.add(th);
            System.out.println(th.toString());
        }
        return list;
    }
}
