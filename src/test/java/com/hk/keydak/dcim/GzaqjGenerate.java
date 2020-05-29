package com.hk.keydak.dcim;

import com.hk.freemarker.FreemarkerUtils;
import com.hk.freemarker.dcim.entity.base.CollectorDevice;
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
public class GzaqjGenerate {
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
     *
     * @throws IOException
     * @throws TemplateException
     */
    @Test
    public void testCabinet() throws IOException, TemplateException {
        Map<String, Object> thModel = new HashMap<>();
//        thModel.put("floorList", getFlood());
        thModel.put("channelList", getChannel());
        thModel.put("acList", getAc());
        freemarkerUtils.createFreemarker(getDcimFtlPath("channel", "Commands-dcim"), thModel);
        freemarkerUtils.createFreemarker(getDcimFtlPath("channel", "DeviceDefines-dcim"), thModel);
    }

    @Test
    public void testTongdaoDevice(){
        String parentId = "1B22C9AA-3FBC-431D-8F01-D237BD6AC5A3";
        List<Map<String, Object>> list = dcimJdbcTemplate.queryForList("\n" +
                "SELECT d.Id,d.Name,d.Description,d.CategoryId,d.ParentId,t.ModelId,t.LocationX,t.LocationY,t.LocationZ,t.TowardsX,t.TowardsY,t.TowardsZ,t.HasChildScene FROM DeviceBase d LEFT JOIN ThingBase t on d.Id = t.Id WHERE d.ParentId = 'A74AD405-2251-43E0-BE39-D95B2502168B'");
        for (Map<String, Object> item :
                list) {
            String uuid = UUID.randomUUID().toString().toUpperCase();
            String deviceSql = "INSERT INTO [DCIM-GZAQJ].[dbo].[DeviceBase] ([Id], [Name], [Description], [CategoryId], [ParentId], [QrCode], [SerialNumber]) " +
                    "VALUES ('"+uuid+"', N'"+item.get("Name")+"', N'"+item.get("Description")+"', '"+item.get("CategoryId")+"', '"+parentId+"', NULL, NULL);";
            String thingSql = "INSERT INTO [DCIM-GZAQJ].[dbo].[ThingBase] ([Id], [ModelId], [LocationX], [LocationY], [LocationZ], [TowardsX], [TowardsY], [TowardsZ], [HasChildScene], [ParentId]) " +
                    "VALUES ('"+uuid+"', N'"+item.get("ModelId")+"', '"+item.get("LocationX")+"', '"+item.get("LocationY")+"', '"+item.get("LocationZ")+"', '"+item.get("TowardsX")+"', '"+item.get("TowardsY")+"', '"+item.get("TowardsZ")+"', '0', '"+parentId+"');";
            System.out.println(deviceSql);
            System.out.println(thingSql);
        }

    }

    private List<CollectorDevice> getAc() {
        String[][] data = new String[][]{
                {"B9565F0B-189E-45D8-B13A-806F92C50F63", "192.168.7.1", "水浸1", "1"},
                {"D15FC220-FC78-4F1C-80E3-D368E227845B", "192.168.7.2", "水浸2", "2"},
                {"7FCFA8B7-01DB-4A98-97C3-64E38B520894", "192.168.7.3", "水浸3", "3"},
                {"E88C4E95-01FB-48D9-958F-825F73B2540F", "192.168.7.4", "水浸4", "4"},
                {"3F996042-43F6-4838-8514-57CC8F2E9A55", "192.168.7.5", "水浸5", "5"},
                {"2E4AAB38-69F4-4B68-8F00-CD722B807EED", "192.168.7.6", "水浸6", "6"},
                {"30D1F52E-8481-40C0-AABC-65B3107C46DD", "192.168.7.7", "水浸7", "7"},
                {"9F52755E-A7D6-4497-8447-35A5E377BBC8", "192.168.7.8", "水浸8", "8"},
                {"AE98385D-3F53-4276-B822-242652535B09", "192.168.7.9", "水浸9", "9"},
                {"F6C275B1-00F9-498D-A737-C821A47F21E3", "192.168.7.10", "水浸10", "10"},
                {"FB3ABA7B-4002-4F1A-B031-B4748456983A", "192.168.7.11", "水浸11", "11"}
        };
        List<CollectorDevice> unitList = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            CollectorDevice flood = CollectorDevice.builder()
                    .deviceId(data[i][0])
                    .busId("253")
                    .port("6001")
                    .ip(data[i][1])
                    .name(data[i][2]).index(Integer.valueOf(data[i][3])).build();
            unitList.add(flood);
        }
        return unitList;
    }

    private List<CollectorDevice> getFlood() {
        String[][] data = new String[][]{
                {"B9565F0B-189E-45D8-B13A-806F92C50F63", "192.168.7.1", "水浸1", "1"},
                {"D15FC220-FC78-4F1C-80E3-D368E227845B", "192.168.7.2", "水浸2", "2"},
                {"7FCFA8B7-01DB-4A98-97C3-64E38B520894", "192.168.7.3", "水浸3", "3"},
                {"E88C4E95-01FB-48D9-958F-825F73B2540F", "192.168.7.4", "水浸4", "4"},
                {"3F996042-43F6-4838-8514-57CC8F2E9A55", "192.168.7.5", "水浸5", "5"},
                {"2E4AAB38-69F4-4B68-8F00-CD722B807EED", "192.168.7.6", "水浸6", "6"},
                {"30D1F52E-8481-40C0-AABC-65B3107C46DD", "192.168.7.7", "水浸7", "7"},
                {"9F52755E-A7D6-4497-8447-35A5E377BBC8", "192.168.7.8", "水浸8", "8"},
                {"AE98385D-3F53-4276-B822-242652535B09", "192.168.7.9", "水浸9", "9"},
                {"F6C275B1-00F9-498D-A737-C821A47F21E3", "192.168.7.10", "水浸10", "10"},
                {"FB3ABA7B-4002-4F1A-B031-B4748456983A", "192.168.7.11", "水浸11", "11"}
        };
        List<CollectorDevice> unitList = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            CollectorDevice flood = CollectorDevice.builder()
                    .deviceId(data[i][0])
                    .busId("253")
                    .port("6001")
                    .ip(data[i][1])
                    .name(data[i][2]).index(Integer.valueOf(data[i][3])).build();
            unitList.add(flood);
        }
        return unitList;
    }

    private List<CollectorDevice> getChannel() {
        String[][] data = new String[][]{
                {"A74AD405-2251-43E0-BE39-D95B2502168B","1","6001","192.168.7.2","通道1","1"},
                {"1B22C9AA-3FBC-431D-8F01-D237BD6AC5A3","1","6001","192.168.7.3","通道2","2"},
                {"732F022B-99BA-4789-B730-AA8AF2DAC3B1","1","6001","192.168.7.4","通道3","3"},
                {"00A941C3-B50C-42FD-99D0-34FAFA980771","1","6001","192.168.7.5","通道4","4"},
        };
        List<CollectorDevice> unitList = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            CollectorDevice flood = CollectorDevice.builder()
                    .deviceId(data[i][0])
                    .busId(data[i][1])
                    .port(data[i][2])
                    .ip(data[i][3])
                    .name(data[i][4]).index(Integer.parseInt(data[i][5])).build();
            unitList.add(flood);
        }
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
