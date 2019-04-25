package com.hk.freemarker.entity;

import java.util.Map;

/**
 * Created by LuHj on 2018/10/19.
 */
public class PduDefine {
    private String id;
    private String name;
    private String uuid;
    private Map<String, String> properties;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
