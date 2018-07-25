package com.hk.demo.util;

/**
 * Created by LuHj on 2018/7/24.
 */
public interface DTOConvert<S, T> {
    T convert(S s);
}
