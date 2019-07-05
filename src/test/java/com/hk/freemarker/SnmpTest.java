package com.hk.freemarker;

import freemarker.template.TemplateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LuHj on 2019/7/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SnmpTest {

    @Autowired
    private FreemarkerUtils freemarkerUtils;

    @Test
    public void test(){
        String fileName = "pdcValue";
        try {
            Map<String, Object> model = new HashMap<>();
            List<PdcValueItem> list = new ArrayList<>();
            PdcValueItem current1 = new PdcValueItem();
            current1.setIndex(1);
            current1.setBranch(1);
            current1.setName("Current");
            list.add(current1);
            PdcValueItem current2 = new PdcValueItem();
            current2.setIndex(2);
            current2.setBranch(2);
            current2.setName("Current");
            list.add(current2);
            PdcValueItem voltage1 = new PdcValueItem();
            voltage1.setIndex(3);
            voltage1.setBranch(1);
            voltage1.setName("Voltage");
            list.add(voltage1);
            PdcValueItem voltage2 = new PdcValueItem();
            voltage2.setIndex(4);
            voltage2.setBranch(2);
            voltage2.setName("Voltage");
            list.add(voltage2);
            PdcValueItem ActiveEnergy1 = new PdcValueItem();
            ActiveEnergy1.setIndex(5);
            ActiveEnergy1.setBranch(1);
            ActiveEnergy1.setName("ActiveEnergy");
            list.add(voltage1);
            PdcValueItem ActiveEnergy2 = new PdcValueItem();
            ActiveEnergy2.setIndex(6);
            ActiveEnergy2.setBranch(2);
            ActiveEnergy2.setName("ActiveEnergy");
            list.add(voltage2);
            PdcValueItem ActivePower1 = new PdcValueItem();
            ActivePower1.setIndex(7);
            ActivePower1.setBranch(1);
            ActivePower1.setName("ActivePower");
            list.add(ActivePower1);
            PdcValueItem ActivePower2 = new PdcValueItem();
            ActivePower2.setIndex(8);
            ActivePower2.setBranch(2);
            ActivePower2.setName("ActivePower");
            list.add(ActivePower2);

            model.put("list", list);
            String freemarkerContent = freemarkerUtils.getFreemarkerContent(fileName, model);
            System.out.println(freemarkerContent);
//            freemarkerUtils.createFreemarkerWithResourcesPath(fileName, new HashMap<>());
        } catch (IOException | TemplateException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testPrint(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 48; i++) {
            stringBuilder.setLength(0);
            stringBuilder.append("new MOMutableColumn<>(").append(i).append(", SMIConstants.SYNTAX_INTEGER, MOAccessImpl.ACCESS_READ_ONLY, new Integer32(0), true),");
            System.out.println(stringBuilder.toString());
        }
    }
}
