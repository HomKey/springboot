package com.hk.freemarker;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by LuHj on 2018/10/15.
 */
public class ObjectToXmlUtilsTest {

    @Test
    public void test(){

        Person p = new Person();
        p.setName("李四");
        p.setAge("12");
        p.setBirthday("20161201");
        p.setSex("Y");
        Map map = new HashMap();
        map.put("t", p);
        map.put("a", p);

        ObjectToXmlUtils t = new ObjectToXmlUtils();
        t.createXmlFile("E:\\wsp\\wsp_intellij\\springboot\\src\\main\\resources\\freemarker", "person.xml", "gbk", map);
    }
}