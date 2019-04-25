package com.hk.freemarker.entity;

/**
 * Created by LuHj on 2018/10/19.
 */
public class Cabinet {
//<CabinetInfo>
//        <id>device_cabinet1</id>
//        <type>c</type>
//        <position>back</position>
//        <typeName>设备单元</typeName>
//        <name>1</name>
//        <displayName>1列2柜</displayName>
//        <uposition>42</uposition>
//        <used>0</used>
//        <status>0</status>
//    </CabinetInfo>
    private String id;
    private String type = "c";
    private String position; // back=up front=down
    private String typeName = "设备单元";
    private String name;
    private String displayName;
    private String uposition = "42";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getUposition() {
        return uposition;
    }

    public void setUposition(String uposition) {
        this.uposition = uposition;
    }
}
