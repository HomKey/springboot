package com.hk.java8;

import com.hk.base.entity.SysUser;
import com.hk.java8.bo.UserBO;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


/**
 * Created by HomKey on 2020/1/9.
 */
public class OptionalDemoTest {

    @Test
    public void testMap(){
        List<UserBO> list = new ArrayList<>();
        String s = Optional.of(list).flatMap(l -> l.stream().filter(Objects::nonNull).findFirst()).map(UserBO::getName).orElse("");
    }
}