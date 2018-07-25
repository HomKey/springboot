package com.hk.demo.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by LuHj on 2018/7/24.
 */
@Getter
@Setter
public class LombokUser {
    private int id;
    private String userName;
    private String password;
    private Date createDate;
}
