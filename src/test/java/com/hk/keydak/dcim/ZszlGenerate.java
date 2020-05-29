package com.hk.keydak.dcim;

import com.hk.base.util.FileUtils;
import com.hk.freemarker.FreemarkerUtils;
import com.hk.freemarker.dcim.entity.base.DeviceDetail;
import com.hk.freemarker.dcim.entity.base.PositionDevice;
import com.hk.freemarker.dcim.entity.device.ChannelV2;
import com.hk.freemarker.dcim.entity.device.DoubleDevice;
import com.hk.freemarker.dcim.entity.device.GxaqtCabinet;
import com.hk.freemarker.dcim.enums.DeviceModel;
import com.hk.freemarker.dcim.enums.DeviceType;
import com.hk.freemarker.dcim.util.CollectorDeviceUtils;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by HomKey on 2019/9/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ZszlGenerate {
    private static final String TEMPLATE_BASEPATH = "device";
    private static final String FILE_NAME_COMMANDS = "Commands";
    private static final String FILE_NAME_DEVICE_DEFINES = "DeviceDefines";

    @Autowired
    private Configuration configuration;
    @Autowired
    private FreemarkerUtils freemarkerUtils;
    @Autowired
    private JdbcTemplate dcimJdbcTemplate;

    /**
     * 一共要执行3个test
     */

    /**
     * 1个机柜2个pdu
     * @throws IOException
     * @throws TemplateException
     */
    @Test
    public void testZszlCabinet() throws IOException, TemplateException {
        DeviceType deviceType = DeviceType.CabinetPduV2;
        Map<String, Object> model = CollectorDeviceUtils.getCollectorDeviceModel2(deviceType);
        freemarkerUtils.createFreemarker(getDcimFtlPath(deviceType.getPath(), FILE_NAME_COMMANDS + "-PduV2"), model);
        freemarkerUtils.createFreemarker(getDcimFtlPath(deviceType.getPath(), FILE_NAME_DEVICE_DEFINES + "-PduV2"), model);
    }
    /**
     * 生成设备xml
     * @throws IOException
     * @throws TemplateException
     */
    @Test
    public void testXml() throws IOException, TemplateException {
        List<DeviceType> deviceTypeList = new ArrayList<>();
//        deviceTypeList.add(DeviceType.EMH_ZL);
//        deviceTypeList.add(DeviceType.PDC_ZL);
//        deviceTypeList.add(DeviceType.ACM03U1);
//        deviceTypeList.add(DeviceType.DME_Modbus);
//        deviceTypeList.add(DeviceType.Unity);
//        deviceTypeList.add(DeviceType.FLOOR_ZL);
        deviceTypeList.add(DeviceType.PM5350BW_ZL);
//        deviceTypeList.add(DeviceType.Hipulse);
        for (DeviceType deviceType : deviceTypeList) {
            Map<String, Object> emhModel = CollectorDeviceUtils.getCollectorDeviceModel(deviceType);
            freemarkerUtils.createFreemarker(getDcimFtlPath(deviceType.getPath(), FILE_NAME_COMMANDS), emhModel);
            freemarkerUtils.createFreemarker(getDcimFtlPath(deviceType.getPath(), FILE_NAME_DEVICE_DEFINES), emhModel);
        }
    }
    @Test
    public void testXml2() throws IOException, TemplateException {
        List<DeviceType> deviceTypeList = new ArrayList<>();
//        deviceTypeList.add(DeviceType.EmhPlusTH_ZL);
//        for (DeviceType deviceType : deviceTypeList) {
//            Map<String, Object> emhModel = CollectorDeviceUtils.getCollectorDeviceModel2(deviceType);
//            freemarkerUtils.createFreemarker(getDcimFtlPath(deviceType.getPath(), FILE_NAME_COMMANDS), emhModel);
//            freemarkerUtils.createFreemarker(getDcimFtlPath(deviceType.getPath(), FILE_NAME_DEVICE_DEFINES), emhModel);
//        }
        deviceTypeList.add(DeviceType.LCD_TH_ZL);
        for (DeviceType deviceType : deviceTypeList) {
            Map<String, Object> emhModel = CollectorDeviceUtils.getCollectorDeviceModel2(deviceType);
            freemarkerUtils.createFreemarker(getDcimFtlPath(deviceType.getPath(), FILE_NAME_COMMANDS), emhModel);
            freemarkerUtils.createFreemarker(getDcimFtlPath(deviceType.getPath(), FILE_NAME_DEVICE_DEFINES), emhModel);
        }
    }

    @Test
    public void testZszlCAEMHv2() throws IOException, TemplateException {
        List<ChannelV2> list = new ArrayList<>();
        DeviceType deviceType = DeviceType.EMHv2;
        ChannelV2 device = ChannelV2.builder()
                .index(1)
                .deviceId1("4C073DF9-E7F5-45C4-B8A9-58FA45A200AA")
                .deviceId2("AA9C72B3-116A-4D5B-A09F-7043D292EF25")
                .deviceId3("B685CB4B-DB01-4490-9686-FCC365CCA504")
                .deviceId4("CBEC977B-FBB9-4788-A0B5-C5B7A5C6A480")
                .deviceId5("2AB5433F-C5DE-4194-95ED-B873328C5421")
                .deviceId6("1203E964-075D-458A-A0BB-0E5FBB0F7FE8")
                .deviceId7("73912B35-A9D7-432D-A02E-28509025AD40")
                .deviceId8("D38E5011-932B-463D-AD9E-083BC3B2559E")
                .deviceId9("1B745EA8-BA18-4CDE-9185-504FC0333D2D")
                .deviceId10("054698AD-1E07-4615-8B67-8D44ECE875A5")
                .deviceId11("5B54077A-2290-498E-BC18-4DB58ACCE3AC")
                .deviceId12("38FD8694-5494-49EF-9117-9F9CC83E7162")
                .port("6011")
                .busId("1")
                .ip("192.168.0.140")
                .build();
        list.add(device);
        Map<String, Object> emhModel = new HashMap<>();
        emhModel.put(deviceType.getKey(), list);
        freemarkerUtils.createFreemarker(getDcimFtlPath(deviceType.getPath(), FILE_NAME_COMMANDS + "-dcim"), emhModel);
        freemarkerUtils.createFreemarker(getDcimFtlPath(deviceType.getPath(), FILE_NAME_DEVICE_DEFINES + "-dcim"), emhModel);
    }

    @Test
    public void testELM() {
        Map<String, Object> elmModel = new HashMap<>();
        List<DoubleDevice> doubleElm = new ArrayList<>();
        DoubleDevice elm1 = new DoubleDevice();
        elm1.setDeviceId("3766AA69-D969-4500-A0DF-A3AD797AB2A7");
        elm1.setIndex(1);
        elm1.setIp1("192.168.1.221");
        elm1.setIp2("192.168.1.221");
        elm1.setPort1("6001");
        elm1.setPort2("6001");
        elm1.setBusId1("1");
        elm1.setBusId2("2");
        doubleElm.add(elm1);
        DoubleDevice elm2 = new DoubleDevice();
        elm2.setDeviceId("57980C88-7781-4FB8-855E-D5A674DE4ED0");
        elm2.setIndex(2);
        elm2.setIp1("192.168.1.222");
        elm2.setIp2("192.168.1.222");
        elm2.setPort1("6001");
        elm2.setPort2("6001");
        elm2.setBusId1("1");
        elm2.setBusId2("2");
        doubleElm.add(elm2);
        DoubleDevice elm3 = new DoubleDevice();
        elm3.setDeviceId("8283736F-0A3F-4C1E-92E5-EE0883CFC174");
        elm3.setIndex(3);
        elm3.setIp1("192.168.1.223");
        elm3.setIp2("192.168.1.223");
        elm3.setPort1("6001");
        elm3.setPort2("6001");
        elm3.setBusId1("1");
        elm3.setBusId2("2");
        doubleElm.add(elm3);
        elmModel.put("elmList", doubleElm);
        try {
            freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.PM5350BW.getPath(), FILE_NAME_COMMANDS + "-double"), elmModel);
            freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.PM5350BW.getPath(), FILE_NAME_DEVICE_DEFINES + "-double"), elmModel);

//            Map<String, Object> acModel = CollectorDeviceUtils.getCollectorDeviceModel(DeviceType.PM5350BW);
//            freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.PM5350BW.getPath(), FILE_NAME_COMMANDS), acModel);
//            freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.PM5350BW.getPath(), FILE_NAME_DEVICE_DEFINES), acModel);
        } catch (IOException | TemplateException e) {
            e.printStackTrace();
        }

    }

    private static String getDcimFtlPath(String modelName, String fileName) {
        return TEMPLATE_BASEPATH + File.separator + modelName + File.separator + fileName;
    }

    private void execSql(String template, Object... params) {
        System.out.println(String.format(template, params));
        dcimJdbcTemplate.execute(String.format(template, params));
    }
}
