package com.hk.keydak.dcim;

import com.hk.base.util.FileUtils;
import com.hk.base.util.IHandleLineString;
import com.hk.freemarker.FreemarkerUtils;
import com.hk.freemarker.dcim.entity.base.PositionDevice;
import com.hk.freemarker.dcim.entity.base.DeviceDetail;
import com.hk.freemarker.dcim.entity.device.ChannelV2;
import com.hk.freemarker.dcim.entity.device.DoubleDevice;
import com.hk.freemarker.dcim.entity.device.GxaqtCabinet;
import com.hk.freemarker.dcim.enums.DeviceModel;
import com.hk.freemarker.dcim.enums.DeviceType;
import com.hk.freemarker.dcim.util.CollectorDeviceUtils;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import io.swagger.models.auth.In;
import lombok.*;
import org.junit.Assert;
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
public class DcimGenerate {
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
     * 采集模板xml
     *
     * @throws IOException
     * @throws TemplateException
     */
    @Test
    public void createCollectorXml() throws IOException, TemplateException {
        Map<String, Object> acModel = CollectorDeviceUtils.getCollectorDeviceModel(DeviceType.EMH);
        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.EMH.getPath(), "action"), acModel);
        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.EMH.getPath(), "config"), acModel);
    }

    @Test
    public void test1288() throws IOException, TemplateException {
        Map<String, Object> emhModel = CollectorDeviceUtils.getCollectorDeviceModel(DeviceType.GALAXY300);
        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.GALAXY300.getPath(), FILE_NAME_COMMANDS), emhModel);
        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.GALAXY300.getPath(), FILE_NAME_DEVICE_DEFINES), emhModel);
    }

    public static StringBuffer CommondXml = new StringBuffer();
    public static StringBuffer DeviceDefineXml = new StringBuffer();

    @Test
    public void testHebing() {
        CommondXml.append("<linked-list>\n");
        DeviceDefineXml.append("<linked-list>\n");
        List<String> list = FileUtils.scanFiles("D:\\freemarker\\device\\cabinet");
        for (String fileSource : list) {
            FileUtils.readFileWithLine(fileSource, (filePath, str) -> {
                if (filePath.contains("Commands_")) {
                    if (!str.contains("linked-list")) {
                        CommondXml.append(str + "\n");
                    }
                } else if (filePath.contains("DeviceDefines_")) {
                    if (!str.contains("linked-list")) {
                        DeviceDefineXml.append(str + "\n");
                    }
                }
            });
        }
        CommondXml.append("</linked-list>");
        DeviceDefineXml.append("</linked-list>");
        FileUtils.write("D:\\freemarker\\device\\cabinet\\Commands.xml", CommondXml.toString());
        FileUtils.write("D:\\freemarker\\device\\cabinet\\DeviceDefines.xml", DeviceDefineXml.toString());
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
    public void testZszlCabinet() throws IOException, TemplateException {
        List<DoubleDevice> list = new ArrayList<>();
        String baseSql = "SELECT t.Id,t.Name FROM DeviceBase t WHERE t.CategoryId = '5E003ED5-C0AC-492C-93CC-00898BC244B1'";
        List<Map<String, Object>> mapList = dcimJdbcTemplate.queryForList(baseSql);
        for (int i = 0; i < mapList.size(); i++) {
            String name = String.valueOf(mapList.get(i).get("Name"));
            String deviceId = String.valueOf(mapList.get(i).get("Id"));
            String port = "6016";
            int busId = i * 2;
            if (i > 13) {
                port = "6017";
                busId -= 14 * 2;
            }
            DoubleDevice cabinet = DoubleDevice.builder()
                    .index(i + 1)
                    .deviceId(deviceId)
                    .ip1("192.168.0.140")
                    .ip2("192.168.0.140")
                    .port1(port)
                    .port2(port)
                    .busId1(String.valueOf(busId + 1))
                    .busId2(String.valueOf(busId + 2))
                    .build();
            list.add(cabinet);
        }
        Map<String, Object> model = new HashMap<>();
        model.put("pduList", list);
        DeviceType deviceType = DeviceType.CabinetPduV2;
        freemarkerUtils.createFreemarker(getDcimFtlPath(deviceType.getPath(), FILE_NAME_COMMANDS + "-PduV2"), model);
        freemarkerUtils.createFreemarker(getDcimFtlPath(deviceType.getPath(), FILE_NAME_DEVICE_DEFINES + "-PduV2"), model);

        System.out.println(list.size());
    }

    @Test
    public void testELM() {
        Map<String, Object> elmModel = new HashMap<>();
        List<DoubleDevice> doubleElm = new ArrayList<>();
        DoubleDevice elm1 = new DoubleDevice();
        elm1.setDeviceId("7CD955F1-9AD7-4F7C-B918-116E6B2A2CEC");
        elm1.setIndex(1);
        elm1.setIp1("192.168.0.140");
        elm1.setIp2("192.168.0.140");
        elm1.setPort1("6016");
        elm1.setPort2("6016");
        elm1.setBusId1("1");
        elm1.setBusId2("2");
        doubleElm.add(elm1);
        DoubleDevice elm2 = new DoubleDevice();
        elm2.setDeviceId("154F72CA-4DA9-4DCC-AA1B-1B47D7DF6AC5");
        elm2.setIndex(2);
        elm2.setIp1("192.168.0.140");
        elm2.setIp2("192.168.0.140");
        elm2.setPort1("6016");
        elm2.setPort2("6016");
        elm2.setBusId1("3");
        elm2.setBusId2("4");
        doubleElm.add(elm2);
        DoubleDevice elm3 = new DoubleDevice();
        elm3.setDeviceId("66648BAC-DC11-4BBC-BA84-79085FF4EA31");
        elm3.setIndex(3);
        elm3.setIp1("192.168.0.140");
        elm3.setIp2("192.168.0.140");
        elm3.setPort1("6016");
        elm3.setPort2("6016");
        elm3.setBusId1("5");
        elm3.setBusId2("6");
        doubleElm.add(elm3);
        elmModel.put("elmList", doubleElm);
        try {
            freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.PM5350BW.getPath(), FILE_NAME_COMMANDS + "-double"), elmModel);
            freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.PM5350BW.getPath(), FILE_NAME_DEVICE_DEFINES + "-double"), elmModel);

            Map<String, Object> acModel = CollectorDeviceUtils.getCollectorDeviceModel(DeviceType.PM5350BW);
            freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.PM5350BW.getPath(), FILE_NAME_COMMANDS), acModel);
            freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.PM5350BW.getPath(), FILE_NAME_DEVICE_DEFINES), acModel);
        } catch (IOException | TemplateException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testFanTsd() throws IOException, TemplateException {

        Map<String, Object> acModel = CollectorDeviceUtils.getCollectorDeviceModel(DeviceType.FanTsd);
        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.FanTsd.getPath(), FILE_NAME_COMMANDS), acModel);
        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.FanTsd.getPath(), FILE_NAME_DEVICE_DEFINES), acModel);

        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.FanTsd.getPath(), "actionConfiguration"), acModel);
        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.FanTsd.getPath(), "ActionCommand"), acModel);
    }

    @Test
    public void test1288Cabinet() {
        Map<String, Object> pduModel = new HashMap<>();
        // dcim的pdu是根据机柜获取数据的，所以deviceId就是机柜id
        // 1个机柜有2条pdu，所以ip，port，busId都有2个
        List<GxaqtCabinet> cabinetList = new ArrayList<>();
        String baseSql = "SELECT\n" +
                "d.Id,d.Name,d.SerialNumber,d.ParentId\n" +
                "FROM\n" +
                "DeviceBase d\n" +
                "WHERE\n" +
                "d.ParentId IN (\n" +
                "SELECT\n" +
                "id\n" +
                "FROM\n" +
                "DeviceBase\n" +
                "WHERE\n" +
                "ParentId = 'F6B9E5A4-5AC4-4019-A92E-83716C2B768E'\n" +
                "AND CategoryId = '9AB1C418-2429-4F83-824F-3928EC8D5C45'\n" +
                ")\n" +
                "AND CategoryId = 'C21CA9EC-7CFB-4CF3-A309-2BF5007A7B95' ";
        String[] parentIds = new String[]{
                "4D2A9A3F-374C-4D42-8C2E-C55205D0717A", // 通道1
                "00F04F8F-07D9-49BE-9C88-F8C78FFCCC9F", // 通道2
                "6F6ECE56-369F-488C-8D1D-4B20035F10D6", // 通道3
                "590C11C8-E015-48AD-9F54-94D8DC18088B"  // 通道4
        };
        String whereSql = " AND ParentId = '" + parentIds[2] + "' ORDER BY SerialNumber DESC";


        List<Map<String, Object>> mapList = dcimJdbcTemplate.queryForList(baseSql + whereSql);
//        温湿度左	192.168.10.2
//        温湿度右	192.168.10.3
//        PDU左前	192.168.10.4
//        PDU左后	192.168.10.5
//        PDU右前	192.168.10.6
//        PDU右后	192.168.10.7
//        资产左 16 - 29
//        资产右 30 - 43

        // 通道1
//        String pduLeftFrontIp = "192.168.10.50";
//        String pduLeftBackIp = "192.168.10.51";
//        String pduRightFrontIp = "192.168.10.52";
//        String pduRightBackIp = "192.168.10.53";
//        String thLeft = "192.168.10.48";
//        String thRight = "192.168.10.49";
//
//        int leftFront = 7;
//        int leftBack = 12;
//        int rightFront = 19;
//        int rightBack = 25;

        // 通道3
        String thLeft = "192.168.10.138";
        String thRight = "192.168.10.139";
        String pduLeftFrontIp = "192.168.10.140";
        String pduLeftBackIp = "192.168.10.141";
        String pduRightFrontIp = "192.168.10.142";
        String pduRightBackIp = "192.168.10.143";

        int leftFront = 7;
        int leftBack = 12;
        int rightFront = 19;
        int rightBack = 24;


        for (int i = 0; i < mapList.size(); i++) {
            String serialNumber = String.valueOf(mapList.get(i).get("SerialNumber"));
            String name = String.valueOf(mapList.get(i).get("Name"));
            String deviceId = String.valueOf(mapList.get(i).get("id"));
            GxaqtCabinet cabinet = new GxaqtCabinet();
            cabinet.setName(name);
            cabinet.setIndex(serialNumber);
            cabinet.setDeviceId(deviceId);
            cabinet.setPduBackPort("6001");
            cabinet.setPduFrontPort("6001");
            cabinet.setThPort("6001");
            int busId = i + 1;
            if (i < leftFront) {
                cabinet.setPduFrontIp(pduLeftFrontIp);
                cabinet.setPduFrontBusId(String.valueOf(busId * 2 - 1));
                cabinet.setPduBackIp(pduLeftFrontIp);
                cabinet.setPduBackBusId(String.valueOf(busId * 2));
                cabinet.setThIp(thLeft);
                cabinet.setThBusId(String.valueOf(i + 1));
            } else if (i >= leftFront && i < leftBack) {
                cabinet.setPduFrontIp(pduLeftBackIp);
                cabinet.setPduFrontBusId(String.valueOf((busId - leftFront) * 2 - 1));
                cabinet.setPduBackIp(pduLeftBackIp);
                cabinet.setPduBackBusId(String.valueOf((busId - leftFront) * 2));
                cabinet.setThIp(thLeft);
                cabinet.setThBusId(String.valueOf(i + 1));
            } else if (i >= leftBack && i < rightFront) {
                cabinet.setPduFrontIp(pduRightFrontIp);
                cabinet.setPduFrontBusId(String.valueOf((busId - leftBack) * 2 - 1));
                cabinet.setPduBackIp(pduRightFrontIp);
                cabinet.setPduBackBusId(String.valueOf((busId - leftBack) * 2));
                cabinet.setThIp(thRight);
                cabinet.setThBusId(String.valueOf(i + 1 - leftBack));
            }else if (i >= rightFront && i < rightBack) {
                cabinet.setPduFrontIp(pduRightBackIp);
                cabinet.setPduFrontBusId(String.valueOf((busId - rightFront) * 2 - 1));
                cabinet.setPduBackIp(pduRightBackIp);
                cabinet.setPduBackBusId(String.valueOf((busId - rightFront) * 2));
                cabinet.setThIp(thRight);
                cabinet.setThBusId(String.valueOf(i + 1 - leftBack));
            }
            cabinetList.add(cabinet);
        }
        pduModel.put("cabinetList", cabinetList);
        try {
            freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.Cabinet.getPath(), FILE_NAME_COMMANDS + "-cabinet"), pduModel);
            freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.Cabinet.getPath(), FILE_NAME_DEVICE_DEFINES + "-cabinet"), pduModel);
        } catch (IOException | TemplateException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void createCollectorTemp() {

    }

    /**
     * 设备3D模型
     * 独立的，1种设备1条模型数据
     */
    @Test
    public void createDeviceModel() {
        List<DeviceModel> deviceModelList = CollectorDeviceUtils.getDeviceModelList();
        for (DeviceModel deviceModel :
                deviceModelList) {
            try {
                execSql(CollectorDeviceUtils.getInsertDeviceModelSQL(deviceModel));
            } catch (Exception e) {
                execSql(CollectorDeviceUtils.getUpdateDeviceModelSQL(deviceModel));
            }
        }
    }

    /**
     * 气泡
     */
    @Test
    public void createBubble() {
        List<PositionDevice> collectorDeviceList = CollectorDeviceUtils.getCollectorDeviceList(DeviceType.PM5350BW);
        List<DeviceDetail> deviceDetailList = new ArrayList<>();
        for (PositionDevice positionDevice : collectorDeviceList) {
            deviceDetailList.add(positionDevice.getDeviceDetail());
        }
        for (DeviceDetail deviceDetail : deviceDetailList) {
            execSql(CollectorDeviceUtils.getInsertDeviceBubbleXmlSQL(deviceDetail));
        }
    }

    /**
     * 详情页
     */
    @Test
    public void createDetailHtml() {
        List<DeviceDetail> deviceDetailList = new ArrayList<>();
        deviceDetailList.add(DeviceDetail.builder()
                .deviceId(UUID.randomUUID().toString())
                .detailHtmlUrl("").build());
        for (DeviceDetail deviceDetail : deviceDetailList) {
            execSql(CollectorDeviceUtils.getInsertDeviceDetailHtmlSQL(deviceDetail));
        }
    }

    @Test
    public void createDeviceSensors() {
    }

    private static String getDcimFtlPath(String modelName, String fileName) {
        return TEMPLATE_BASEPATH + File.separator + modelName + File.separator + fileName;
    }

    private void execSql(String template, Object... params) {
        System.out.println(String.format(template, params));
        dcimJdbcTemplate.execute(String.format(template, params));
    }
}
