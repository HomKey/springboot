package com.hk.freemarker.dcim.entity.base;

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
public class CollectorDevice {
    private String deviceId;
    private int index;
    private String name;
    private String ip;
    private String port;
    private String busId;
}
