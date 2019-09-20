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
public class DeviceModel {
    private String modelId; // uuid
    private String modelUrl; // '/MockData/Models/DioBox01.dae'
    private String modelName; // '电量仪'
}
