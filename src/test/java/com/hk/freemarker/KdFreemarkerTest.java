package com.hk.freemarker;

import com.hk.base.util.FileUtils;
import com.hk.freemarker.entity.AlertDefines;
import com.hk.freemarker.entity.Command;
import com.hk.freemarker.entity.DeviceDefine;
import com.hk.freemarker.entity.SwitchSensorDefine;
import com.hk.freemarker.keydak.conf.GhgsConfig;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import freemarker.template.Configuration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LuHj on 2018/10/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class KdFreemarkerTest {

    @Autowired
    private Configuration configuration;

    @Autowired
    private FreemarkerUtils freemarkerUtils;
    @Test
    public void testCreateCollector() throws IOException, TemplateException {
        String templatePath = "crv";
        String alertDefines = "alertDefines";
        String commands = "commands";
        String DeviceDefines = "DeviceDefines";
        String index = "1";
        String busid = "1";
        String host = "192.168.82.5";
        String port = "6001";
        Template template = configuration.getTemplate(templatePath + File.separator + alertDefines + ".ftl"); // freeMarker template
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("title", "列间空调#"+index + "#"+host+":"+port+"#" + busid +"#");
        String content = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
        FileUtils.creatFile("C:\\Users\\tandewei\\Desktop\\CD2000配置生成工具\\CD2000_Output\\黄茅坪\\collector\\config\\", content);
    }


    private Command getCommand(String[] config, int startIndex, int endIndex, String commandName) {
        Command command = new Command();
        command.setName(commandName);
        List<DeviceDefine> list = new ArrayList<>();
        for (int i = startIndex; i < endIndex; i++) {
            String deviceConf = config[i];
            String[] conf = deviceConf.split("\\|");
            DeviceDefine deviceDefine = new DeviceDefine();
            deviceDefine.setRegisterIndex(conf[0]);
            deviceDefine.setName(conf[1]);
            deviceDefine.setScale(conf[2]);
            deviceDefine.setDivider(conf[3]);
            deviceDefine.setIsMean(conf[4]);
            if (conf.length > 5) {
                deviceDefine.setDesc(conf[5]);
            } else {
                deviceDefine.setDesc("");
            }
            list.add(deviceDefine);
        }
        command.setDeviceDefines(list);
        return command;
    }

    @Test
    public void testDeviceDefines() throws IOException, TemplateException {
        List<Command> commandList = new ArrayList<>();
        commandList.add(getCommand(GhgsConfig.UPS_DEVICES, 0, 56, "q1"));
//        commandList.add(getCommand(GhgsConfig.UPS_DEVICES, 56, GhgsConfig.UPS_DEVICES.length, "q2"));

        Map<String, Object> model = new HashMap<String, Object>();

        model.put("commandList", commandList);


        freemarkerUtils.createFreemarker("DeviceDefine", model);
    }


    private List<AlertDefines> getAlertDefines(String[] config) {
        List<AlertDefines> list = new ArrayList<>();
        int index = 10000;
        for (int i = 0; i < config.length; i++) {
            String deviceConf = config[i];
            String[] conf = deviceConf.split("\\|");
            if (conf[1].contains("Alert")) {
                String[] alert = conf[6].split(":");
                for (int j = 0; j < alert.length; j++) {
                    AlertDefines alertDefines = new AlertDefines();
                    alertDefines.setId("" + index++);
                    alertDefines.setName(conf[5].split(":")[0]);
                    String[] descArray = alert[j].split("=");
                    alertDefines.setLimit(descArray[0]);
                    alertDefines.setDesc(descArray[1]);
                    alertDefines.setProperty(conf[1]);
                    list.add(alertDefines);
                }
            }
        }
        return list;
    }

    @Test
    public void testAlertDefines() throws IOException, TemplateException {

        Map<String, Object> model = new HashMap<String, Object>();


        model.put("alertDefines", getAlertDefines(GhgsConfig.UPS_DEVICES));
        model.put("template", "{cnname}#{conn}#{busid}#");
//
        Template template = configuration.getTemplate("alertDefines.ftl"); // freeMarker template
        String content = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);

        FileUtils.creatFile("C:\\Users\\tandewei\\Desktop\\CD2000配置生成工具\\CD2000_Collect\\Device\\UPS\\V1\\alertDefines.xml", content);
        System.out.println(content);

    }

    @Test
    public void testSwitchSensor() throws IOException, TemplateException {
//        ac_q1_{devid}_{busid}
        Command command = new Command();
        command.setName("ac_q1_{devid}_{busid}");

        List<Command> commandList = new ArrayList<>();

        List<SwitchSensorDefine> list = new ArrayList<>();
        for (String[] swtich : GhgsConfig.AC_DEVICES_SWITCH) {
            for (String temp : swtich) {
//                "1|0|AC.Switch|开关机状态(0:关机状态,1:开机状态)|0=关机告警",
                String[] split = temp.split("\\|");
                SwitchSensorDefine switchSensorDefine = new SwitchSensorDefine();
                switchSensorDefine.setRegisterIndex(split[0]);
                switchSensorDefine.setRouteIndex(split[1]);
                switchSensorDefine.setName(split[2]);
                switchSensorDefine.setDesc(split[3]);
                list.add(switchSensorDefine);
            }
        }
        command.setSwitchSensorDefine(list);
        commandList.add(command);

        Map<String, Object> model = new HashMap<String, Object>();

        model.put("commandList", commandList);
//        model.put("alertDefines", getAlertDefines(GhgsConfig.UPS_DEVICES));
//        model.put("template", "{cnname}#{conn}#{busid}#");

        Template template = configuration.getTemplate("SwitchSensorDefine.ftl"); // freeMarker template
        String content = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);

        FileUtils.creatFile("C:\\Users\\tandewei\\Desktop\\CD2000配置生成工具\\CD2000_Collect\\Device\\CRAC\\SCA_ES\\DeviceDefines-Switch.xml", content);
        System.out.println(content);


//        Template template = configuration.getTemplate("alertDefines.ftl"); // freeMarker template
//        String content = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);

//        FileUtils.creatFile("C:\\Users\\tandewei\\Desktop\\CD2000配置生成工具\\CD2000_Collect\\Device\\UPS\\V1\\alertDefines.xml", content);
//        System.out.println(content);
    }

    @Test
    public void testAlertDefinesSwitch() throws IOException, TemplateException {

        Map<String, Object> model = new HashMap<String, Object>();

        List<AlertDefines> alertDefines = new ArrayList<>();
        int index = 10000;
        for (String[] swtich : GhgsConfig.AC_DEVICES_SWITCH) {
            for (String temp : swtich) {
//                "1|0|AC.Switch|开关机状态(0:关机状态,1:开机状态)|0=关机告警",
                String[] split = temp.split("\\|");
                if (split.length == 5){
                    String[] alert = split[4].split(":");
                    for (int j = 0; j < alert.length; j++) {
                        AlertDefines defines = new AlertDefines();
                        defines.setId("" + index++);
                        defines.setName(split[3].split("\\(")[0]);
                        String[] descArray = alert[j].split("=");
                        defines.setLimit(descArray[0]);
                        defines.setDesc(descArray[1]);
                        defines.setProperty(split[2]);
                        alertDefines.add(defines);
                    }
                }

            }
        }

        model.put("alertDefines", alertDefines);
        model.put("template", "{cnname}#{conn}#{busid}#");
//
        Template template = configuration.getTemplate("AlertDefinesCore.ftl"); // freeMarker template
        String content = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);

        FileUtils.creatFile("C:\\Users\\tandewei\\Desktop\\CD2000配置生成工具\\CD2000_Collect\\Device\\CRAC\\SCA_ES\\alertDefines.xml", content);
        System.out.println(content);

    }

}