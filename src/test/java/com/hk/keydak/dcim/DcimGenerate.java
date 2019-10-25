package com.hk.keydak.dcim;

import com.hk.freemarker.FreemarkerUtils;
import com.hk.freemarker.dcim.entity.base.PositionDevice;
import com.hk.freemarker.dcim.entity.base.DeviceDetail;
import com.hk.freemarker.dcim.entity.device.DoubleDevice;
import com.hk.freemarker.dcim.entity.device.GxaqtCabinet;
import com.hk.freemarker.dcim.enums.DeviceModel;
import com.hk.freemarker.dcim.enums.DeviceType;
import com.hk.freemarker.dcim.util.CollectorDeviceUtils;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import io.swagger.models.auth.In;
import lombok.*;
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
        Map<String, Object> acModel = CollectorDeviceUtils.getCollectorDeviceModel(DeviceType.FanTsd);
        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.FanTsd.getPath(), FILE_NAME_COMMANDS), acModel);
        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.FanTsd.getPath(), FILE_NAME_DEVICE_DEFINES), acModel);
    }

    @Test
    public void test1288() throws IOException, TemplateException {
        Map<String, Object> emhModel = CollectorDeviceUtils.getCollectorDeviceModel(DeviceType.ACRD300);
        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.ACRD300.getPath(), FILE_NAME_COMMANDS), emhModel);
        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.ACRD300.getPath(), FILE_NAME_DEVICE_DEFINES), emhModel);

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
    public void testCabinet() {
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
        String whereSql = " AND ParentId = '" + parentIds[3] + "' ORDER BY SerialNumber DESC";


        List<Map<String, Object>> mapList = dcimJdbcTemplate.queryForList(baseSql + whereSql);
//        温湿度左	192.168.10.2
//        温湿度右	192.168.10.3
//        PDU左前	192.168.10.4
//        PDU左后	192.168.10.5
//        PDU右前	192.168.10.6
//        PDU右后	192.168.10.7
//        资产左 16 - 29
//        资产右 30 - 43

        int middle = 14;
        String pduLeftFrontIp = "192.168.10.4";
        String pduLeftBackIp = "192.168.10.5";
        String pduRightFrontIp = "192.168.10.6";
        String pduRightBackIp = "192.168.10.7";
        String thLeft = "192.168.10.2";
        String thRight = "192.168.10.3";
        int assetLeftStart = 16;
        int assetRightStart = 30;
        String emhHost = "192.168.10.1";
        String insertDeviceExtend = "INSERT INTO [DCIM-GXAQT].[dbo].[DeviceExtend] ([Id], [Key], [Value], [Description]) VALUES ('%s', N'AssetCode', N'%s', N'CD2000资产标记');\n"
                + "INSERT INTO [DCIM-GXAQT].[dbo].[DeviceExtend] ([Id], [Key], [Value], [Description]) VALUES ('%s', N'CD2KHost', N'%s', N'CD2000地址');\n";
        for (int i = 0; i < mapList.size(); i++) {
            String serialNumber = String.valueOf(mapList.get(i).get("SerialNumber"));
            String deviceId = String.valueOf(mapList.get(i).get("id"));
            GxaqtCabinet cabinet = new GxaqtCabinet();
            cabinet.setIndex(serialNumber);
            cabinet.setDeviceId(deviceId);
            // 前14个为右列机柜
            String busId = "";
            if (i < middle) {
                busId += (i + 1);
                cabinet.setPduFrontIp(pduRightFrontIp);
                cabinet.setPduBackIp(pduRightBackIp);
                cabinet.setThIp(thRight);
                System.out.println(String.format(insertDeviceExtend, deviceId, "192.168.10." + assetRightStart + ":6001:0:1", deviceId, emhHost));
                assetRightStart++;
            } else {
                busId += (i - middle + 1);
                cabinet.setPduFrontIp(pduLeftFrontIp);
                cabinet.setPduBackIp(pduLeftBackIp);
                cabinet.setThIp(thLeft);
                System.out.println(String.format(insertDeviceExtend, deviceId, "192.168.10." + assetLeftStart + ":6001:0:1", deviceId, emhHost));
                assetLeftStart++;
            }
            cabinet.setThBusId(busId);
            cabinet.setPduFrontBusId(busId);
            cabinet.setPduBackBusId(busId);
            cabinet.setPduFrontPort("6001");
            cabinet.setPduBackPort("6001");
            cabinet.setThPort("6001");
            cabinetList.add(cabinet);
        }
        pduModel.put("cabinetList", cabinetList);
//        try {
//            freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.Cabinet.getPath(), FILE_NAME_COMMANDS + "-cabinet"), pduModel);
//            freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.Cabinet.getPath(), FILE_NAME_DEVICE_DEFINES + "-cabinet"), pduModel);
//        } catch (IOException | TemplateException e) {
//            e.printStackTrace();
//        }
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
