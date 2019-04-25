package com.hk.freemarker.irs;

import com.hk.freemarker.FreemarkerUtils;
import com.hk.freemarker.entity.AssetDefine;
import com.hk.freemarker.entity.CabinetComponents;
import com.hk.freemarker.entity.EmhDefine;
import com.hk.freemarker.entity.PduDefine;
import com.hk.freemarker.keydak.conf.IrsConfig;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.*;

/**
 * Created by LuHj on 2018/10/19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class IrsFreemarkerTest {

    @Autowired
    private Configuration configuration;

    @Autowired
    private FreemarkerUtils freemarkerUtils;

    @Test
    public void createPdu() throws IOException, TemplateException {
        List<PduDefine> list = new ArrayList<>();
//        String[] config = IrsConfig.PDU_UI;
        for (int i = 1; i <= 20; i++) {
//            String[] data = config[i].split("\\|");
            PduDefine pduDefineA = new PduDefine();
            pduDefineA.setId(String.valueOf(i * 2 - 1));
            pduDefineA.setName("PDU" + i + "-A");
            pduDefineA.setUuid(UUID.randomUUID().toString());
            pduDefineA.setProperties(IrsConfig.PDU_PROPERTIES);
            PduDefine pduDefineB = new PduDefine();
            pduDefineB.setId(String.valueOf(i * 2));
            pduDefineB.setName("PDU" + i + "-B");
            pduDefineB.setUuid(UUID.randomUUID().toString());
            pduDefineB.setProperties(IrsConfig.PDU_PROPERTIES);
            list.add(pduDefineA);
            list.add(pduDefineB);
        }
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("pduList", list);
//
//        Template template = configuration.getTemplate("PduUidata.ftl"); // freeMarker template
//        String content = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
//        FileUtils.creatFile("C:\\Users\\tandewei\\Desktop\\backup\\RS柜\\uidataconfig_pdu1.xml", content);
//        System.out.println(content);
//
        String fileName = "PduUidata";
        freemarkerUtils.createFreemarker(fileName, model);
    }

    @Test
    public void createAsset() throws IOException, TemplateException {
        List<AssetDefine> list = new ArrayList<>();
        String[] config = IrsConfig.ASSET_UI;
        for (int i = 0; i < config.length; i++) {
            String[] data = config[i].split("\\|");
            AssetDefine define = new AssetDefine();
            define.setUuid(data[0]);
            define.setName(data[1]);
            define.setDisplayName(data[2]);
            list.add(define);
        }
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("assetList", list);
//
        String fileName = "AssetUidata";
        freemarkerUtils.createFreemarker(fileName, model);
    }

//    @Test
//    public void createEmhUidataconfig() throws IOException, TemplateException {
//        List<EmhDefine> list = new ArrayList<>();
//        String[] config = IrsConfig.EMH_UI;
//        for (String temp : config) {
//            String[] split = temp.split("\\|");
//            EmhDefine emhDefine = new EmhDefine();
//            emhDefine.setDeviceid(split[0]);
//            emhDefine.setName(split[1]);
//            list.add(emhDefine);
//        }
//
//        Map<String, Object> model = new HashMap<String, Object>();
//        model.put("emhList", list);
////
////        String fileName = "uidataconfig";
////        freemarkerUtil.createFreemarker(fileName, model);
////        Template template = configuration.getTemplate("EmhUidataconfig.ftl"); // freeMarker template
////        String content = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
////        FileUtils.creatFile("C:\\Users\\tandewei\\Desktop\\backup\\RS柜\\keydakmonitor\\monitor_home\\config\\uBit\\uidataconfig_auto.xml", content);
////        System.out.println(content);
//
//        String fileName = "EmhUidataconfig";
//        freemarkerUtil.createFreemarker(fileName, model);
//
//    }

    @Test
    public void createCabinetComponents() throws IOException, TemplateException {
        List<CabinetComponents> cabinetComponents = new ArrayList<>();
//        String[] assetUi = IrsConfig.ASSET_UI;
//        String[] pduUi = IrsConfig.PDU_UI;
//        String[] emhUi = IrsConfig.EMH_UI;
        for (int i = 1; i <= 20; i++) {
            CabinetComponents cabinet = new CabinetComponents();
            cabinet.setIndex(String.valueOf(i));
            cabinet.setAssertId(UUID.randomUUID().toString());
            PduDefine pduA = new PduDefine();
//            String[] pduConfA = pduUi[i*2 - 2].split("\\|");
            pduA.setUuid(UUID.randomUUID().toString());
            cabinet.setPduA(pduA);
            PduDefine pduB = new PduDefine();
//            String[] pduConfB = pduUi[i*2 - 1].split("\\|");
            pduB.setUuid(UUID.randomUUID().toString());
            cabinet.setPduB(pduB);
            EmhDefine emh = new EmhDefine();
//            String[] emhConf = emhUi[i-1].split("\\|");
            emh.setDeviceid(UUID.randomUUID().toString());
            cabinet.setEmh(emh);
            cabinetComponents.add(cabinet);
        }

        Map<String, Object> model = new HashMap<String, Object>();
        model.put("cabinets", cabinetComponents);
//
        String fileName = "cabinetComponents";
        freemarkerUtils.createFreemarker(fileName, model);
    }
    
    @Test
    public void testEnvUidataconfig() throws IOException, TemplateException {
        List<EmhDefine> list = new ArrayList<>();
        String[] config = IrsConfig.EMH_UI;
//        for (String temp : config) {
//            String[] split = temp.split("\\|");
//            EmhDefine emhDefine = new EmhDefine();
//            emhDefine.setDeviceid(split[0]);
//            emhDefine.setName("机柜-");
//            list.add(emhDefine);
//        }
        for (int i = 1; i <= 20; i++) {
            EmhDefine emhDefine = new EmhDefine();
            emhDefine.setDeviceid(UUID.randomUUID().toString());
            emhDefine.setName("机柜-");
            list.add(emhDefine);
        }


        Map<String, Object> model = new HashMap<String, Object>();
        model.put("emhList", list);
        freemarkerUtils.createFreemarker("EnvUidataconfig", model);
//
//        Template template = configuration.getTemplate("EnvUidataconfig.ftl"); // freeMarker template
//        String content = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
//        FileUtils.creatFile("C:\\Users\\tandewei\\Desktop\\backup\\RS柜\\keydakmonitor\\monitor_home\\config\\env\\uidataconfig_auto.xml", content);
//        System.out.println(content);
    }
}