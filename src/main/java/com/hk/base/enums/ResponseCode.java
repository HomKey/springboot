package com.hk.base.enums;

import com.baomidou.mybatisplus.enums.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;

/**
 * Created by LuHj on 2018/7/24.
 */
public enum ResponseCode implements IEnum{
    ERROR(-1,"错误"),
    SUCCESS(200,"成功")
    ;
    private Integer key;
    private String desc;
    ResponseCode(Integer key, String desc) {
        this.key = key;
        this.desc = desc;
    }

    @Override
    public Serializable getValue() {
        return this.key;
    }

    public Integer getKey(){
        return this.key;
    }

    @JsonValue
    public String getDesc(){
        return this.desc;
    }
}
