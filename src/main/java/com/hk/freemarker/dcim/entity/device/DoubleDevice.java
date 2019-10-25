package com.hk.freemarker.dcim.entity.device;

import lombok.*;

/**
 * Created by HomKey on 2019/10/17.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class DoubleDevice {
    private String deviceId;
    private int index;
    private String ip1;
    private String ip2;
    private String port1;
    private String port2;
    private String busId1;
    private String busId2;
}
