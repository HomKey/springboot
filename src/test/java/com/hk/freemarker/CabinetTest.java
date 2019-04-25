package com.hk.freemarker;

import com.hk.base.util.FileUtils;
import com.hk.freemarker.entity.Cabinet;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LuHj on 2018/10/19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CabinetTest {
    @Autowired
    private Configuration configuration;
    @Autowired
    private FreemarkerUtils freemarkerUtils;

    @Test
    public void createCabinetInfos() throws IOException, TemplateException {
        List<Cabinet> cabinetList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            Cabinet cabinet = new Cabinet();
            cabinet.setId("device_cabinet" + i);
            if (i<=10){
                cabinet.setDisplayName("1列"+i+"柜");
                cabinet.setPosition("back");
            }else{
                cabinet.setDisplayName("2列"+(i-5)+"柜");
                cabinet.setPosition("front");
            }
            cabinet.setName(i + "");
            cabinetList.add(cabinet);
        }
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("cabinetList", cabinetList);
        String fileName = "cabinetInfos";

        freemarkerUtils.createFreemarker(fileName,model);
//
//        Template template = configuration.getTemplate(fileName + ".ftl"); // freeMarker template
//        String content = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
//        Long second = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
//        FileUtils.creatFile("C:\\Users\\tandewei\\Desktop\\backup\\freemarker\\" + fileName + "_" + second + ".xml", content);
//        System.out.println(content);
    }
}
