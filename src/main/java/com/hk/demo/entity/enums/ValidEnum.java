package com.hk.demo.entity.enums;

import com.baomidou.mybatisplus.enums.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;

/**
 * Created by LuHj on 2018/6/26.
 */
public enum ValidEnum implements IEnum {
    EFFECTIVE(0,"有效"),
    INVALID(1,"失效")
    ;

    private int key;
    private String desc;
    ValidEnum(int key, String desc) {
        this.key = key;
        this.desc = desc;
    }

    @Override
    public Serializable getValue() {
        return this.key;
    }

    @JsonValue
    public String getDesc(){
        return this.desc;
    }

}
