package com.hk.freemarker.entity;

import java.util.List;

/**
 * Created by LuHj on 2018/10/18.
 */
public class Command {
    private String name;
    private List<DeviceDefine> deviceDefines;
    private List<SwitchSensorDefine> switchSensorDefine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DeviceDefine> getDeviceDefines() {
        return deviceDefines;
    }

    public void setDeviceDefines(List<DeviceDefine> deviceDefines) {
        this.deviceDefines = deviceDefines;
    }

    public List<SwitchSensorDefine> getSwitchSensorDefine() {
        return switchSensorDefine;
    }

    public void setSwitchSensorDefine(List<SwitchSensorDefine> switchSensorDefine) {
        this.switchSensorDefine = switchSensorDefine;
    }
}
