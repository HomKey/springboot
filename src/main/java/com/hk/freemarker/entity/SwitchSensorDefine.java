package com.hk.freemarker.entity;

/**
 * Created by LuHj on 2018/10/19.
 */
public class SwitchSensorDefine {
    private String name;
    private String registerIndex;
    private String routeIndex;
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegisterIndex() {
        return registerIndex;
    }

    public void setRegisterIndex(String registerIndex) {
        this.registerIndex = registerIndex;
    }

    public String getRouteIndex() {
        return routeIndex;
    }

    public void setRouteIndex(String routeIndex) {
        this.routeIndex = routeIndex;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
