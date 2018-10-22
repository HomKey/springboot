package com.hk.freemarker;

import com.hk.base.util.FileUtils;
import com.hk.freemarker.entity.DeviceDefine;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;

/**
 * Created by LuHj on 2018/10/18.
 */
@Component
public class FreemarkerUtil {

    @Autowired
    private Configuration configuration;

    public static void createFreemarker(Configuration configuration, String fileName, Map<String, Object> model) throws IOException, TemplateException {
        Template template = configuration.getTemplate(fileName + ".ftl"); // freeMarker template
        String content = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
        Long second = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
        FileUtils.creatFile("C:\\Users\\tandewei\\Desktop\\backup\\freemarker\\" + fileName + "_" + second + ".xml", content);
        System.out.println(content);
    }
}
