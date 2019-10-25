package com.hk.freemarker.dcim.entity.device;

import lombok.*;

/**
 * Created by HomKey on 2019/10/24.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class GxaqtCabinet {
    private String deviceId;
    private String index;
    private String pduFrontIp;
    private String pduFrontPort;
    private String pduFrontBusId;

    private String pduBackIp;
    private String pduBackPort;
    private String pduBackBusId;

    private String thIp;
    private String thPort;
    private String thBusId;
}
