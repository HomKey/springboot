package com.hk.freemarker;


import freemarker.template.TemplateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LuHj on 2018/10/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FreemarkerUtilsTest {

    @Autowired
    private FreemarkerUtils freemarkerUtils;

    @Test
    public void test(){

        List<Person> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Person person = new Person();
            person.setAge(String.valueOf(i+10));
            person.setName("name"+i);
            person.setBirthday("");
        }
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("list", list);
//
        String fileName = "personList";

        try {
            freemarkerUtils.createFreemarkerWithResourcesPath(fileName, model);
        } catch (IOException | TemplateException e) {
            e.printStackTrace();
        }
    }



}