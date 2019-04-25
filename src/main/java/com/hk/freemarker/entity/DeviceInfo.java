package com.hk.freemarker.entity;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LuHj on 2019/4/22.
 */
@Data
@Builder
public class DeviceInfo {
    private String deviceId;
    private String host;
    private String port;
    private String index;
    private String name;

    public static List<DeviceInfo> getConfig(String[][] configs){
        List<DeviceInfo> list = new ArrayList<>();
        for (String[] config : configs) {
            DeviceInfo deviceInfo = DeviceInfo.builder()
                    .deviceId(config[0])
                    .host(config[1])
                    .port(config[2])
                    .index(config[3]).build();
            if (config.length >= 5){
                deviceInfo.setName(config[4]);
            }
            System.out.println(deviceInfo.toString());
        }
        return list;
    }
}