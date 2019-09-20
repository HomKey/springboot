package com.hk.freemarker.dcim;

import com.hk.base.util.FileUtils;
import com.hk.base.util.IHandleLineString;
import com.hk.freemarker.FreemarkerUtils;
import com.hk.freemarker.dcim.config.*;
import com.hk.freemarker.dcim.entity.temp.*;
import com.hk.freemarker.entity.DeviceInfo;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by LuHj on 2019/4/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CreateXml {
    private static String templatePath = "dcim";
    @Autowired
    private Configuration configuration;
    @Autowired
    private FreemarkerUtils freemarkerUtils;
    @Test
    public void createF8() throws IOException, TemplateException {
        Map<String, Object> model = new HashMap<String, Object>();
        // 智能电表
        model.put("acrelList", Acrel.getConfig(AcrelConfig.NNGAZB_F8));
        freemarkerUtils.createFreemarker(getFilePath("AcrelCommands"), model);
        freemarkerUtils.createFreemarker(getFilePath("AcrelDeviceDefines"), model);

        // 艾默生空调
        model.put("amsAcList", AmsAc.getConfig(AmsAcConfig.NNGAZB_F8));
        freemarkerUtils.createFreemarker(getFilePath("amsAcCommands"), model);
        freemarkerUtils.createFreemarker(getFilePath("amsAcDeviceDefines"), model);

        // 施耐德空调
        model.put("sndAcList", SndAc.getConfig(SndAcConfig.NNGAZB_F8));
        freemarkerUtils.createFreemarker(getFilePath("sndAcCommands"), model);
        freemarkerUtils.createFreemarker(getFilePath("sndAcDeviceDefines"), model);

        // 温湿度探头
        model.put("thList", Th.getConfig(ThConfig.NNGAZB_F8));
        freemarkerUtils.createFreemarker(getFilePath("thCommands"), model);
        freemarkerUtils.createFreemarker(getFilePath("thDeviceDefines"), model);

        // 新风机
        model.put("xfjList", Xfj.getConfig(XfjConfig.NNGZZB_F8));
        freemarkerUtils.createFreemarker(getFilePath("xfjCommands"), model);
        freemarkerUtils.createFreemarker(getFilePath("xfjDeviceDefines"), model);

        // 漏水
        model.put("lsList", Ls.getConfig(LsConfig.NNGAZB_F8));
        freemarkerUtils.createFreemarker(getFilePath("lsCommands"), model);
        freemarkerUtils.createFreemarker(getFilePath("lsDeviceDefines"), model);

        // 配电柜
        model.put("pdcList", Pdc.getConfig(PdcConfig.NNGAZB_F8));
        freemarkerUtils.createFreemarker(getFilePath("pdcAlarmDefines"), model);
        freemarkerUtils.createFreemarker(getFilePath("pdcCommands"), model);
        freemarkerUtils.createFreemarker(getFilePath("pdcDeviceDefines"), model);

        // CO2
        model.put("eyhtList", Eyht.getConfig(EyhtConfig.NNGAZB_F8));
        freemarkerUtils.createFreemarker(getFilePath("eyhtCommands"), model);
        freemarkerUtils.createFreemarker(getFilePath("eyhtDeviceDefines"), model);

        // Qy
        model.put("qyList", Qy.getConfig(QyConfig.NNGAZB_F8));
        freemarkerUtils.createFreemarker(getFilePath("qyCommands"), model);
        freemarkerUtils.createFreemarker(getFilePath("qyDeviceDefines"), model);

        // 消防主机
        model.put("emh2List", Emh2.getConfig(Emh2Config.NNGAZB_F8));
        freemarkerUtils.createFreemarker(getFilePath("emh2Commands"), model);
        freemarkerUtils.createFreemarker(getFilePath("emh2DeviceDefines"), model);
    }

    @Test
    public void createF8WithAll() throws IOException, TemplateException {
        Map<String, Object> model = new HashMap<String, Object>();
        // 智能电表
        model.put("acrelList", Acrel.getConfig(AcrelConfig.NNGAZB_F8));

        // 艾默生空调
        model.put("amsAcList", AmsAc.getConfig(AmsAcConfig.NNGAZB_F8));

        // 施耐德空调
        model.put("sndAcList", SndAc.getConfig(SndAcConfig.NNGAZB_F8));

        // 温湿度探头
        model.put("thList", Th.getConfig(ThConfig.NNGAZB_F8));

        // 新风机
        model.put("xfjList", Xfj.getConfig(XfjConfig.NNGZZB_F8));

        // 漏水
        model.put("lsList", Ls.getConfig(LsConfig.NNGAZB_F8));

        // 配电柜
        model.put("pdcList", Pdc.getConfig(PdcConfig.NNGAZB_F8));

        // CO2
        model.put("eyhtList", Eyht.getConfig(EyhtConfig.NNGAZB_F8));

        // Qy
        model.put("qyList", Qy.getConfig(QyConfig.NNGAZB_F8));

        // 消防主机
        model.put("emhList", Emh2.getConfig(Emh2Config.NNGAZB_F8));

        freemarkerUtils.createFreemarker("dcim" + File.separator + "F8" + File.separator + "Commands", model);
        freemarkerUtils.createFreemarker("dcim" + File.separator + "F8" + File.separator + "DeviceDefines", model);
    }

    @Test
    public void createF1() throws IOException, TemplateException {
        Map<String, Object> model = new HashMap<String, Object>();
        // 智能电表
        model.put("acrelList", Acrel.getConfig(AcrelConfig.NNGAZB_F1));
        freemarkerUtils.createFreemarker(getFilePath("AcrelCommands"), model);
        freemarkerUtils.createFreemarker(getFilePath("AcrelDeviceDefines"), model);

        // 艾默生空调
        model.put("amsAcList", AmsAc.getConfig(AmsAcConfig.NNGAZB_F1));
        freemarkerUtils.createFreemarker(getFilePath("amsAcCommands"), model);
        freemarkerUtils.createFreemarker(getFilePath("amsAcDeviceDefines"), model);

        // 漏水
        model.put("lsList", Ls.getConfig(LsConfig.NNGAZB_F1));
        freemarkerUtils.createFreemarker(getFilePath("lsCommands"), model);
        freemarkerUtils.createFreemarker(getFilePath("lsDeviceDefines"), model);

        // 温湿度探头
        model.put("thList", Th.getConfig(ThConfig.NNGAZB_F1));
        freemarkerUtils.createFreemarker(getFilePath("thCommands"), model);
        freemarkerUtils.createFreemarker(getFilePath("thDeviceDefines"), model);

        // 消防主机
        model.put("emh2List", Emh2.getConfig(Emh2Config.NNGAZB_F1));
        freemarkerUtils.createFreemarker(getFilePath("emh2Commands"), model);
        freemarkerUtils.createFreemarker(getFilePath("emh2DeviceDefines"), model);

        // 新风机
        model.put("xfjList", Xfj.getConfig(XfjConfig.NNGZZB_F1));
        freemarkerUtils.createFreemarker(getFilePath("xfjCommands"), model);
        freemarkerUtils.createFreemarker(getFilePath("xfjDeviceDefines"), model);

        // 排风机
        model.put("pfjList", Pfj.getConfig(PfjConfig.NNGZZB_F1));
        freemarkerUtils.createFreemarker(getFilePath("pfjCommands"), model);
        freemarkerUtils.createFreemarker(getFilePath("pfjDeviceDefines"), model);

        // 电量仪
        model.put("dlyList", Dly.getConfig(DlyConfig.NNGZZB_F1));
        freemarkerUtils.createFreemarker(getFilePath("dlyCommands"), model);
        freemarkerUtils.createFreemarker(getFilePath("dlyDeviceDefines"), model);

        // 电池组
        model.put("dczList", Dcz.getConfig(DczConfig.NNGZZB_F1));
        freemarkerUtils.createFreemarker(getFilePath("dczCommands"), model);
        freemarkerUtils.createFreemarker(getFilePath("dczDeviceDefines"), model);

        // 艾默生UPS
        model.put("amsUpsList", AmsUps.getConfig(AmsUpsConfig.NNGZZB_F1));
        freemarkerUtils.createFreemarker(getFilePath("amsUpsCommands"), model);
        freemarkerUtils.createFreemarker(getFilePath("amsUpsDeviceDefines"), model);


    }

    @Test
    public void createF1WithAll() throws IOException, TemplateException {
        Map<String, Object> model = new HashMap<String, Object>();
        // 智能电表
        model.put("acrelList", Acrel.getConfig(AcrelConfig.NNGAZB_F1));

        // 艾默生空调
        model.put("amsAcList", AmsAc.getConfig(AmsAcConfig.NNGAZB_F1));

        // 漏水
        model.put("lsList", Ls.getConfig(LsConfig.NNGAZB_F1));

        // 温湿度探头
        model.put("thList", Th.getConfig(ThConfig.NNGAZB_F1));

        // 消防主机
        model.put("emhList", Emh2.getConfig(Emh2Config.NNGAZB_F1));

        // 新风机
        model.put("xfjList", Xfj.getConfig(XfjConfig.NNGZZB_F1));

        // 排风机
        model.put("pfjList", Pfj.getConfig(PfjConfig.NNGZZB_F1));

        // 电量仪
        model.put("dlyList", Dly.getConfig(DlyConfig.NNGZZB_F1));

        // 电池组
        model.put("dczList", Dcz.getConfig(DczConfig.NNGZZB_F1));

        // 艾默生UPS
        model.put("amsUpsList", AmsUps.getConfig(AmsUpsConfig.NNGZZB_F1));

        freemarkerUtils.createFreemarker("dcim" + File.separator + "F1" + File.separator + "Commands", model);
        freemarkerUtils.createFreemarker("dcim" + File.separator + "F1" + File.separator + "DeviceDefines", model);
    }

    @Test
    public void testOne() throws IOException, TemplateException {
        Map<String, Object> model = new HashMap<String, Object>();
        // 智能电表
        model.put("pfjList", Pfj.getConfig(PfjConfig.NNGZZB_F1_2));

        freemarkerUtils.createFreemarker("dcim" + File.separator + "pfjCommands", model);
        freemarkerUtils.createFreemarker("dcim" + File.separator + "pfjDeviceDefines", model);
    }
    @Test
    public void testAc3000() throws IOException, TemplateException {
        Map<String, Object> model = new HashMap<String, Object>();
        // 智能电表
        model.put("amsAc3000List", AmsAc.getConfig(AmsAcConfig.NNGAZB_F1_3000));

        freemarkerUtils.createFreemarker("dcim" + File.separator + "amsAc3000Commands", model);
        freemarkerUtils.createFreemarker("dcim" + File.separator + "amsAc3000DeviceDefines", model);
    }
    
    @Test
    public void testLs() throws IOException, TemplateException {
        Map<String, Object> model = new HashMap<String, Object>();
        // 智能电表
        model.put("lsList", Ls.getConfig(LsConfig.NNGAZB_F1));

        freemarkerUtils.createFreemarker("dcim" + File.separator + "lsCommands", model);
        freemarkerUtils.createFreemarker("dcim" + File.separator + "lsDeviceDefines", model);
    }

    @Test
    public void testEmh2() throws IOException, TemplateException {
        Map<String, Object> model = new HashMap<String, Object>();
        // 消防主机
        model.put("emhList", Emh2.getConfig(Emh2Config.NNGAZB_F1));

        freemarkerUtils.createFreemarker("dcim" + File.separator + "emh2Commands", model);
        freemarkerUtils.createFreemarker("dcim" + File.separator + "emh2DeviceDefines", model);
    }
    
    @Test
    public void testAmsAc() throws IOException, TemplateException {

        Map<String, Object> model = new HashMap<String, Object>();
//        model.put("amsAc3000List", AmsAc.getConfig(AmsAcConfig.NNGAZB_F8_3000));
//
//        freemarkerUtils.createFreemarker("dcim" + File.separator + "amsAc3000Commands", model);
//        freemarkerUtils.createFreemarker("dcim" + File.separator + "amsAc3000DeviceDefines", model);


        model.put("amsAcList", AmsAc.getConfig(AmsAcConfig.NNGAZB_F8_acm03u1));

        freemarkerUtils.createFreemarker("dcim" + File.separator + "acm03u1Commands", model);
        freemarkerUtils.createFreemarker("dcim" + File.separator + "acm03u1DeviceDefines", model);
    }

    @Test
    public void testPdu() throws IOException, TemplateException {

        Map<String, Object> model = new HashMap<String, Object>();
        // 消防主机
        model.put("pduList", Pdu.getConfig());
        model.put("assetList", Asset.getConfig());

        freemarkerUtils.createFreemarker("dcim" + File.separator + "pduCommands", model);
        freemarkerUtils.createFreemarker("dcim" + File.separator + "pduDeviceDefines", model);
        freemarkerUtils.createFreemarker("dcim" + File.separator + "assetCommands", model);
        freemarkerUtils.createFreemarker("dcim" + File.separator + "assetDeviceDefines", model);
    }

    @Test
    public void test(){
        List<Pdu> config = Pdu.getConfig();
        String template ="INSERT INTO [DeviceSensors] (\n" +
                "                [SensorId],\n" +
                "\t[DeviceId],\n" +
                "\t[SensorName],\n" +
                "\t[SensorAlias]\n" +
                ") SELECT\n" +
                "        NEWID(),\n" +
                "                '%s',\n" +
                "                t.SensorName,\n" +
                "                NULL\n" +
                "        FROM\n" +
                "        DeviceSensors t\n" +
                "        WHERE\n" +
                "        t.DeviceId = 'F41A630F-0C29-4ECB-B338-FA9A6AE1EA5A'\n" +
                "        AND t.SensorName NOT IN (\n" +
                "                SELECT\n" +
                "                d.SensorName\n" +
                "                FROM\n" +
                "                DeviceSensors d\n" +
                "                WHERE\n" +
                "                d.deviceId = '%s'\n" +
                "        );";
        for (Pdu pdu :
                config) {
            if(pdu.getDeviceId().equals("F41A630F-0C29-4ECB-B338-FA9A6AE1EA5A") || pdu.getDeviceId().equals("00FAC07A-14E7-4616-AAE6-E854F9A1547E")){

            }else{
                System.out.println(String.format(template, pdu.getDeviceId(), pdu.getDeviceId()));
            }
        }
    }

    @Test
    public void testUps() throws IOException, TemplateException {
        Map<String, Object> model = new HashMap<String, Object>();
        // 消防主机
        model.put("amsUpsList", AmsUps.getConfig(AmsUpsConfig.NNGZZB_F1));

        freemarkerUtils.createFreemarker("dcim" + File.separator + "amsUpsCommands", model);
        freemarkerUtils.createFreemarker("dcim" + File.separator + "amsUpsDeviceDefines", model);
    }

    @Test
    public void testSndUpsSnmp() throws IOException, TemplateException {
        Map<String, Object> model = new HashMap<String, Object>();
        // 消防主机
        model.put("sndUpsList", SndSnmpUps.getConfig(SndSnmp417Config.NNGAZB_F1));

        freemarkerUtils.createFreemarker("dcim" + File.separator + "sndSnmpCommands", model);
        freemarkerUtils.createFreemarker("dcim" + File.separator + "sndSnmpDeviceDefines", model);


    }

    @Test
    public void testNewFan() throws IOException, TemplateException {
        Map<String, Object> model = new HashMap<String, Object>();
        // 排风机
        model.put("pfjList", Pfj.getConfig(PfjConfig.NNGZZB_F1_2));
        model.put("xfjList", Xfj.getConfig(XfjConfig.NNGZZB_F8));
        freemarkerUtils.createFreemarker(getFilePath("pfjActionCommands"), model);
        freemarkerUtils.createFreemarker(getFilePath("pfjActionConfig"), model);
        freemarkerUtils.createFreemarker(getFilePath("xfjActionCommands"), model);
        freemarkerUtils.createFreemarker(getFilePath("xfjActionConfig"), model);
    }

    @Test
    public void testM244TcpFan() throws IOException, TemplateException {
        Map<String, Object> model = new HashMap<String, Object>();
        DeviceInfo deviceInfo = DeviceInfo.builder()
                .deviceId("01C67153-7C7D-4CFF-8F4D-32290DAB70C5")
                .host("192.168.82.92")
                .index("1")
                .port("502")
                .name("M244").build();
        ArrayList<DeviceInfo> deviceInfos = new ArrayList<>();
        deviceInfos.add(deviceInfo);
        model.put("fanList", deviceInfos);
        freemarkerUtils.createFreemarker(getFilePath("M244Commands"), model);
        freemarkerUtils.createFreemarker(getFilePath("M244DeviceDefines"), model);
        freemarkerUtils.createFreemarker(getFilePath("M244ActionCommands"), model);
        freemarkerUtils.createFreemarker(getFilePath("M244ActionConfig"), model);

    }
    @Test
    public void testFile(){
        FileUtils.readFileWithLine("E:\\wsp\\wsp_intellij\\springboot\\src\\main\\resources\\ftl\\dcim\\sndSnmpDeviceDefines.ftl", new IHandleLineString() {
            @Override
            public void handle(String filePath, String str) {
                if (str.indexOf("<name>")>0 && str.indexOf("</name>") > 0){
                    str = str.trim();
                    str = str.replaceAll("<name>", "").replaceAll("</name>", "");
                    String result = "INSERT INTO [DeviceSensors] ([SensorId], [DeviceId], [SensorName], [SensorAlias]) VALUES (newId(), '8ebddf67-51fd-4a52-a570-65357ed71771', '" + str + "', NULL);";
                    System.out.println(result);
                }
            }
        });
    }

    /**
     * 获取Sensor及其描述
     */
    private static String describe = "";
    @Test
    public void getSensorInfo(){
        FileUtils.readFileWithLine("E:\\wsp\\wsp_intellij\\springboot\\src\\main\\resources\\ftl\\dcim\\sndSnmpDeviceDefines.ftl", new IHandleLineString() {
            @Override
            public void handle(String filePath, String str) {
                if (str.indexOf("<!--")>0 && str.indexOf("-->") > 0){
                    describe = str.trim().replace("<!--", "").replace("-->","").trim();
                }
                if (str.indexOf("<name>")>0 && str.indexOf("</name>") > 0){
                    str = str.trim().replaceAll("<name>", "").replaceAll("</name>", "");
                    System.out.println(str + " : " + describe);
                }
            }
        });
    }

    private static String getFilePath(String fileName){
        return templatePath + File.separator + fileName;
    }
}
