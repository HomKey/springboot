package com.hk.keydak.dcim;

import com.hk.freemarker.FreemarkerUtils;
import com.hk.freemarker.dcim.entity.sql.*;
import com.hk.freemarker.dcim.util.CollectorDeviceUtils;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by HomKey on 2019/9/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DcimGenerate {
    private static String templateBasePath = "device";
    private static String insertDeviceModel = "EXEC dev_InsertDeviceModel '%s', '%s', '%s';";
    private static String insertDeviceBubbleXml = "INSERT INTO [dbo].[DeviceBubbleTemplate] ([fdDevBubTemDevId], [fdDevBubTemUrl], [fdDevBubTemEnable]) VALUES ('%s', '%s', '1');\n";
    private static String insertDeviceDetailHtml = "INSERT INTO [dbo].[DeviceMonitorTemplate] ([DeviceId], [Url]) VALUES ('%s', '%s');\n";

    @Autowired
    private Configuration configuration;
    @Autowired
    private FreemarkerUtils freemarkerUtils;

    /**
     * 采集模板xml
     * @throws IOException
     * @throws TemplateException
     */
    @Test
    public void createCollectorXml() throws IOException, TemplateException {
        Map<String, Object> model = CollectorDeviceUtils.getCollectorDeviceList("elm");
        freemarkerUtils.createFreemarker(getFilePath("pm5350bw", "Commands"), model);
        freemarkerUtils.createFreemarker(getFilePath("pm5350bw", "DeviceDefines"), model);
    }

    /**
     * 设备3D模型
     */
    @Test
    public void createDeviceModel(){
        List<DeviceModel> deviceModelList = new ArrayList<>();
        deviceModelList.add(DeviceModel.builder().modelId(UUID.randomUUID().toString()).modelUrl("/MockData/Models/DioBox01.dae").modelName("电量仪").build());
        for (DeviceModel deviceMode :
                deviceModelList) {
            System.out.println(String.format(insertDeviceModel, deviceMode.getModelId(),deviceMode.getModelUrl(),deviceMode.getModelName()));
        }
    }

    /**
     * 气泡
     */
    @Test
    public void createBubble(){
        List<DeviceDetail> deviceDetailList = new ArrayList<>();
        deviceDetailList.add(DeviceDetail.builder()
                .deviceId(UUID.randomUUID().toString())
                .bubbleUrl("").build());
        for (DeviceDetail deviceDetail : deviceDetailList) {
            System.out.println(String.format(insertDeviceBubbleXml, deviceDetail.getDeviceId(),deviceDetail.getBubbleUrl()));
        }
    }

    /**
     * 详情页
     */
    @Test
    public void createDetailHtml(){
        List<DeviceDetail> deviceDetailList = new ArrayList<>();
        deviceDetailList.add(DeviceDetail.builder()
                .deviceId(UUID.randomUUID().toString())
                .detailHtmlUrl("").build());
        for (DeviceDetail deviceDetail : deviceDetailList) {
            System.out.println(String.format(insertDeviceDetailHtml, deviceDetail.getDeviceId(),deviceDetail.getDetailHtmlUrl()));
        }
    }


    private static String getFilePath(String modelName, String fileName){
        return templateBasePath + File.separator + modelName + File.separator + fileName;
    }

}
