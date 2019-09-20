package com.hk.freemarker.dcim.entity.sql;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by HomKey on 2019/9/20.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeviceDetail {
    private String deviceId; // uuid
    private String bubbleUrl; // diomElectric.xml
    private String detailHtmlUrl; // /device/electMeter-artelEM300-NNGA.html
}
