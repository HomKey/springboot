package com.hk.keydak.dcim;

import com.hk.freemarker.FreemarkerUtils;
import com.hk.freemarker.dcim.entity.base.CollectorDevice;
import com.hk.freemarker.dcim.entity.device.ChannelV2;
import com.hk.freemarker.dcim.entity.device.DoubleDevice;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by HomKey on 2019/9/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class NngaGenerate {
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
        Map<String, Object> thModel = new HashMap<>();
        thModel.put("thList", getTh());
        freemarkerUtils.createFreemarker(getDcimFtlPath("th", "Commands"), thModel);
        freemarkerUtils.createFreemarker(getDcimFtlPath("th", "DeviceDefines"), thModel);
    }

    private List<CollectorDevice> getTh(){
        String ip1 = "192.168.7.136";
        String ip2 = "192.168.7.136";
        List<CollectorDevice> unitList = new ArrayList<>();
        CollectorDevice th1 = CollectorDevice.builder()
                .deviceId("4c073df9-e7f5-45c4-b8a9-58fa45a200aa")
                .busId("1")
                .ip(ip1)
                .name("th-1").index(1).build();
        unitList.add(th1);
        CollectorDevice th2 = CollectorDevice.builder()
                .deviceId("aa9c72b3-116a-4d5b-a09f-7043d292ef25")
                .busId("2")
                .ip(ip1)
                .name("th-2").index(2).build();
        unitList.add(th2);
        CollectorDevice th3 = CollectorDevice.builder()
                .deviceId("b685cb4b-db01-4490-9686-fcc365cca504")
                .busId("3")
                .ip(ip1)
                .name("th-3").index(3).build();
        unitList.add(th3);
        CollectorDevice th4 = CollectorDevice.builder()
                .deviceId("cbec977b-fbb9-4788-a0b5-c5b7a5c6a480")
                .busId("4")
                .ip(ip1)
                .name("th-4").index(4).build();
        unitList.add(th4);
        CollectorDevice th5 = CollectorDevice.builder()
                .deviceId("2ab5433f-c5de-4194-95ed-b873328c5421")
                .busId("1")
                .ip(ip2)
                .name("th-5").index(5).build();
        unitList.add(th5);
        CollectorDevice th6 = CollectorDevice.builder()
                .deviceId("1203e964-075d-458a-a0bb-0e5fbb0f7fe8")
                .busId("2")
                .ip(ip2)
                .name("th-6").index(6).build();
        unitList.add(th6);
        CollectorDevice th7 = CollectorDevice.builder()
                .deviceId("73912b35-a9d7-432d-a02e-28509025ad40")
                .busId("3")
                .ip(ip2)
                .name("th-7").index(7).build();
        unitList.add(th7);
        CollectorDevice th8 = CollectorDevice.builder()
                .deviceId("d38e5011-932b-463d-ad9e-083bc3b2559e")
                .busId("4")
                .ip(ip2)
                .name("th-8").index(8).build();
        unitList.add(th8);
        return unitList;
    }

    private static String getDcimFtlPath(String modelName, String fileName) {
        return TEMPLATE_BASEPATH + File.separator + modelName + File.separator + fileName;
    }

    private void execSql(String template, Object... params) {
        System.out.println(String.format(template, params));
        dcimJdbcTemplate.execute(String.format(template, params));
    }
}
