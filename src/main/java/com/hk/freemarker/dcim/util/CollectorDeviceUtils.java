package com.hk.freemarker.dcim.util;

import com.hk.freemarker.dcim.entity.base.CollectorDevice;
import com.hk.freemarker.dcim.entity.base.PositionDevice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by HomKey on 2019/9/20.
 */
public class CollectorDeviceUtils {

    private static Map<String, Object> data = new HashMap<>();

    public static void init() {
        clear();
        // 电量仪
        List<PositionDevice> elmList = new ArrayList<>();
        PositionDevice elm1 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("2104b577-6d61-4ee7-bc8e-dfa1d4feec4e")
                        .name("电量仪1")
                        .index(1)
                        .ip("192.168.7.1")
                        .port("6001")
                        .busId("1").build())
                .build();
        elmList.add(elm1);
        data.put("elmList", elmList);
        //

    }

    private static void clear() {
        data.clear();
    }

    public static Map<String, Object> getCollectorDeviceList(String model) {
        Map<String, Object> result = new HashMap<>();
        result.put(model + "List", data.get(model) == null ? new ArrayList<>() : data.get(model));
        return result;
    }

    public static Map<String, Object> getData() {
        return data;
    }

    public static String getUpdatePostionSQL(PositionDevice positionDevice) {
        return "UPDATE [dbo].[ThingBase]\n" +
                "SET \n" +
                " [LocationX] = '" + positionDevice.getLocationX() + "',\n" +
                " [LocationY] = '" + positionDevice.getLocationY() + "',\n" +
                " [LocationZ] = '" + positionDevice.getLocationZ() + "',\n" +
                " [TowardsX] = '" + positionDevice.getTowardsX() + "',\n" +
                " [TowardsY] = '" + positionDevice.getTowardsY() + "',\n" +
                " [TowardsZ] = '" + positionDevice.getTowardsZ() + "'\n" +
                "WHERE [Id] = " + positionDevice.getCollectorDevice().getDeviceId() + ";\n";
    }


}
