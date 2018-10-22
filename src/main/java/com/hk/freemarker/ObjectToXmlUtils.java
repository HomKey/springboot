package com.hk.freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;
import java.util.Map;

/**
 * Created by LuHj on 2018/10/15.
 */
public class ObjectToXmlUtils {

    /**
     * @paramxmlPathxml的路径
     * @paramxmlNamexml的名称
     * @paramcode数据编码格式
     * @paramdataMap需要渲染到xml中的map数据
     * @returnxmlString
     */
    public String createXmlFile(String xmlPath, String xmlName, String code, Map dataMap) {
        String result = "";

//得FreeMarker配置对象
//创建Configuration对象
        Configuration cfg = new Configuration();
//设置模板编码格式
        cfg.setEncoding(Locale.getDefault(), code);


//得FreeMarker的关键对象---------模板


//创建Template对象
        Template template = null;
        try {
//设置FreeMarker的模版文件位置
            cfg.setClassForTemplateLoading(this.getClass(), "");
            cfg.setDirectoryForTemplateLoading(new File(xmlPath));
            template = cfg.getTemplate(xmlName);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        template.setEncoding(code);

//Stringpath=ServletActionContext.getServletContext().getRealPath("/");

/*Filedir=newFile(path+htmlPath);
if(!dir.exists())
{
dir.mkdirs();
}*/

//FilefileName=newjava.io.File(path+htmlPath+htmlName);
//System.out.println("htmlfile:"+fileName.getPath());

//Writerwriter=null;
        StringWriter sw = new StringWriter();
        try {
//生成xml
            template.process(dataMap, sw);
            System.out.println(sw.toString());
            result = sw.toString();
        } catch (TemplateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
