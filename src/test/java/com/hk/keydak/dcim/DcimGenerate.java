package com.hk.keydak.dcim;

import com.hk.freemarker.FreemarkerUtils;
import com.hk.freemarker.dcim.entity.base.PositionDevice;
import com.hk.freemarker.dcim.entity.base.DeviceDetail;
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
//        Map<String, Object> model = CollectorDeviceUtils.getCollectorDeviceModel(DeviceType.PM5350BW);
//        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.PM5350BW.getPath(), FILE_NAME_COMMANDS), model);
//        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.PM5350BW.getPath(), FILE_NAME_DEVICE_DEFINES), model);
//        Map<String, Object> thModel = CollectorDeviceUtils.getCollectorDeviceModel(DeviceType.TH);
//        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.TH.getPath(), FILE_NAME_COMMANDS), thModel);
//        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.TH.getPath(), FILE_NAME_DEVICE_DEFINES), thModel);
//        Map<String, Object> pdcModel = CollectorDeviceUtils.getCollectorDeviceModel(DeviceType.PDC);
//        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.PDC.getPath(), FILE_NAME_COMMANDS), pdcModel);
//        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.PDC.getPath(), FILE_NAME_DEVICE_DEFINES), pdcModel);
//        Map<String, Object> floorModel = CollectorDeviceUtils.getCollectorDeviceModel(DeviceType.FLOOR);
//        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.FLOOR.getPath(), FILE_NAME_COMMANDS), floorModel);
//        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.FLOOR.getPath(), FILE_NAME_DEVICE_DEFINES), floorModel);
//        Map<String, Object> channelModel = CollectorDeviceUtils.getCollectorDeviceModel(DeviceType.EMH);
//        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.EMH.getPath(), FILE_NAME_COMMANDS), channelModel);
//        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.EMH.getPath(), FILE_NAME_DEVICE_DEFINES), channelModel);
        Map<String, Object> channelModel = CollectorDeviceUtils.getCollectorDeviceModel(DeviceType.GALAXY300);
        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.GALAXY300.getPath(), FILE_NAME_COMMANDS), channelModel);
        freemarkerUtils.createFreemarker(getDcimFtlPath(DeviceType.GALAXY300.getPath(), FILE_NAME_DEVICE_DEFINES), channelModel);
    }

    @Test
    public void createCollectorTemp(){

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
    public void createDeviceSensors(){
    }

    private static String getDcimFtlPath(String modelName, String fileName) {
        return TEMPLATE_BASEPATH + File.separator + modelName + File.separator + fileName;
    }

    private void execSql(String template, Object... params) {
        System.out.println(String.format(template, params));
        dcimJdbcTemplate.execute(String.format(template, params));
    }
}
