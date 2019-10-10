package com.hk.freemarker.dcim.entity.base;

import com.hk.freemarker.dcim.enums.DeviceCategory;
import com.hk.freemarker.dcim.enums.DeviceModel;
import com.hk.freemarker.dcim.enums.DeviceType;
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
    private String deviceName;
    private DeviceType deviceType;
    private DeviceCategory deviceCategory;
    private DeviceModel deviceModel;
    private String bubbleUrl; // diomElectric.xml
    private String detailHtmlUrl; // /device/electMeter-artelEM300-NNGA.html
}
