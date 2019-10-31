package com.hk.freemarker.dcim.entity.device;

import lombok.*;

/**
 * Created by HomKey on 2019/10/28.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class ChannelV2 {
    private int index;
    private String deviceId1;
    private String deviceId2;
    private String deviceId3;
    private String deviceId4;
    private String deviceId5;
    private String deviceId6;
    private String deviceId7;
    private String deviceId8;
    private String deviceId9;
    private String deviceId10;
    private String deviceId11;
    private String deviceId12;
    private String ip;
    private String port;
    private String busId;
}
