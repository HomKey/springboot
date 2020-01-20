package com.hk.keydak.cd2k;

import com.hk.freemarker.FreemarkerUtils;
import com.hk.keydak.cd2k.data.YdxlProject;
import freemarker.template.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by HomKey on 2019/9/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Cd2kGenerate {
    @Autowired
    private Configuration configuration;
    @Autowired
    private FreemarkerUtils freemarkerUtils;
    @Autowired
    private JdbcTemplate druidJdbcTemplate;
    @Autowired
    private JdbcTemplate cd2kSourceJdbcTemplate;
    @Autowired
    private JdbcTemplate cd2kTargetJdbcTemplate;

    private static Map<String, String> fanyiMap;

    private String insertDeviceModelTemplate = "INSERT INTO `n_DeviceModel` (`id`, `deviceTypeId`, `model`, `displayName`, `description`, `reference`) " +
            "VALUES (%s, %s, %s, %s, %s, %s);\n";
    private String insertCommandTemplate = "INSERT INTO `n_DefaultCommand` (`id`, `deviceModelId`, `name`, `startRegister`, `length`, `commandType`, `commandString`, `commandBytes`, `classId`, `addr`, `ver`, `ctrlData`, `oidStart`) " +
            "VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);\n";
    private String insertSensorTemplate = "INSERT INTO `n_SensorDefine` (`id`, `deviceModelId`, `name`, `displayName`, `description`, `registerIndex`, `scale`, `unit`, `isState`, `isBit`, `bitOrder`, `dividedBy`, `start`, `len`, `classId`, `parentId`, `attributeName`, `defaultCommandId`) " +
            "VALUES (%s, %s, %s, %s, %s,%s, %s, %s, %s, %s,%s, %s, %s, %s, %s,%s, %s, %s);\n";
    private String insertAlertTemplate = "INSERT INTO `n_AlertTemplate` (`id`, `name`, `deviceModelId`, `description`) " +
            "VALUES (%s, %s, %s, %s);\n";
    private String insertRuleDefineTemplate = "INSERT INTO `n_RuleDefine` (`id`, `name`, `classId`) " +
            "VALUES (%s,%s,%s);\n";
    private String insertAlertDefineTemplate = "INSERT INTO `n_AlertDefine` (`id`, `ruleDefineId`, `deviceModelId`, `title`, `category`, `number`, `level`, `descriptionPattern`, `repeat`, `minInterval`, `enable`) " +
            "VALUES (%s, %s, %s, %s, %s,%s, %s, %s, %s, %s,%s);\n";
    private String insertAlertTemplateDefineTemplate = "INSERT INTO `n_AlertTemplateDefine` (`id`, `alertTemplateId`, `alertDefineId`) " +
            "VALUES (%s,%s,%s);\n";
    private String insertRuleSensorDefineTemplate = "INSERT INTO `n_RuleSensorDefine` (`id`, `ruleDefineId`, `sensorDefineId`, `limit`) " +
            "VALUES (%s,%s,%s,%s);\n";
    private int tDeviceModelId;
    private int tDefaultCommandId;
    private int tSensorId;
    private int tAlertTemplateId;
    private int tRuleDefineId;
    private int tAlertDefineId;
    private int tAlertTemplateDefineId;
    private int tRuleSensorDefineId;
    private Map<String, String> sensorIdMap = new HashMap<>();
    private Map<String, String> ruleDefineIdMap = new HashMap<>();
    private Map<String, String> alertDefineIdMap = new HashMap<>();
    private Map<String, String> alertTemplateDefineIdMap = new HashMap<>();

    @Before
    public void before() {
        fanyiMap = new HashMap<>();
        List<Map<String, Object>> mapList = cd2kSourceJdbcTemplate.queryForList("SELECT * FROM n_SensorDefine");
        for (Map<String, Object> item :
                mapList) {
            Object description = item.get("description");
            String value = String.valueOf(item.get("name"));
            String key;
            if (description == null || String.valueOf(description).equals("") || String.valueOf(description).toLowerCase().equals("null")) {
                key = String.valueOf(item.get("displayName"));
            } else {
                key = String.valueOf(item.get("name"));
            }
            fanyiMap.put(key, value);
        }
        Map<String, Object> tDeviceModelMap = cd2kTargetJdbcTemplate.queryForMap("SELECT max(id) AS deviceModelId FROM n_DeviceModel");
        tDeviceModelId = (int) tDeviceModelMap.get("deviceModelId") + 1;
        Map<String, Object> tDefaultCommandMap = cd2kTargetJdbcTemplate.queryForMap("SELECT max(id) AS commandId FROM n_DefaultCommand");
        tDefaultCommandId = (int) tDefaultCommandMap.get("commandId") + 1;
        Map<String, Object> tSensorMap = cd2kTargetJdbcTemplate.queryForMap("SELECT max(id) AS sensorId FROM n_SensorDefine");
        tSensorId = (int) tSensorMap.get("sensorId") + 1;
        Map<String, Object> tAlertTemplateMap = cd2kTargetJdbcTemplate.queryForMap("SELECT max(id) AS templateId FROM n_AlertTemplate");
        tAlertTemplateId = (int) tAlertTemplateMap.get("templateId") + 1;
        Map<String, Object> tRuleDefineMap = cd2kTargetJdbcTemplate.queryForMap("SELECT max(id) AS ruleDefineId FROM n_RuleDefine");
        tRuleDefineId = (int) tRuleDefineMap.get("ruleDefineId") + 1;
        Map<String, Object> tAlertDefineMap = cd2kTargetJdbcTemplate.queryForMap("SELECT max(id) AS alertDefineId FROM n_AlertDefine");
        tAlertDefineId = (int) tAlertDefineMap.get("alertDefineId") + 1;
        Map<String, Object> tAlertTemplateDefineMap = cd2kTargetJdbcTemplate.queryForMap("SELECT max(id) AS alertTemplateDefineId FROM n_AlertTemplateDefine");
        tAlertTemplateDefineId = (int) tAlertTemplateDefineMap.get("alertTemplateDefineId") + 1;
        Map<String, Object> tRuleSensorDefineIdMap = cd2kTargetJdbcTemplate.queryForMap("SELECT max(id) AS ruleSensorDefineId FROM n_RuleSensorDefine");
        tRuleSensorDefineId = (int) tRuleSensorDefineIdMap.get("ruleSensorDefineId") + 1;

    }

    private String getEngName(String cn) {
        for (Map.Entry<String, String> item :
                fanyiMap.entrySet()) {
            if (item.getKey().contains(cn)) {
                return item.getValue();
            }
        }
        return "--------";
    }

    @Test
    public void testJdbcTemplate() {
        List<Map<String, Object>> mapList = druidJdbcTemplate.queryForList("SELECT * FROM sys_user");
        System.out.println(mapList);
    }

    /**
     *
     */
    @Test
    public void testAddDeviceSensor() {
        String insertSensorTemplate = "INSERT INTO `n_SensorDefine` (`id`, `deviceModelId`, `name`, `displayName`, `description`, `registerIndex`, `scale`, `unit`, `isState`, `isBit`, `bitOrder`, `dividedBy`, `start`, `len`, `classId`, `parentId`, `attributeName`, `defaultCommandId`) " +
                "VALUES (%s, %s, %s, %s, %s,%s, %s, %s, %s, %s,%s, %s, %s, %s, %s,%s, %s, %s);\n";
        Map<String, Object> tSensorMap = cd2kTargetJdbcTemplate.queryForMap("SELECT max(id) AS sensorId FROM n_SensorDefine");
        int tSensorId = (int) tSensorMap.get("sensorId") + 1;
        for (String[] item :
                YdxlProject.sensorData) {
            String insertSensorSql = String.format(insertSensorTemplate,
                    tSensorId,
                    YdxlProject.deviceModelId,
                    "'" + item[1] + "'",
                    "'" + item[2] + "'",
                    "'" + item[2] + "'",
                    item[0],
                    Integer.valueOf(item[3]) / 10,
                    null,
                    0,
                    0,
                    0,
                    item[3],
                    null,
                    null,
                    92,
                    null,
                    null,
                    254);
            executeSql(insertSensorSql);
            tSensorId++;
        }
    }


    @Test
    public void testAddAlertTemplate() {
        List<Map<String, Object>> list = cd2kTargetJdbcTemplate.queryForList("SELECT * FROM n_SensorDefine WHERE deviceModelId = 106 AND id <=141497");
        for (Map<String, Object> item :
                list) {
            Map<String, String> map = dealMap(item);
            String insertRuleDefineSql = String.format(insertRuleDefineTemplate,
                    tRuleDefineId,
                    map.get("displayName"),
                    69);
            executeSql(insertRuleDefineSql);
            String insertAlertDefineSql = String.format(insertAlertDefineTemplate,
                    tAlertDefineId,
                    tRuleDefineId,
                    106,
                    map.get("displayName"),
                    99,
                    10001,
                    1,
                    "''",
                    10,
                    1440,
                    1);
            executeSql(insertAlertDefineSql);
            String insertAlertTemplateDefineSql = String.format(insertAlertTemplateDefineTemplate,
                    tAlertTemplateDefineId,
                    48,
                    tAlertDefineId
                    );
            executeSql(insertAlertTemplateDefineSql);
            String insertRuleSensorDefineSql = String.format(insertRuleSensorDefineTemplate,
                    tRuleSensorDefineId,
                    tRuleDefineId,
                    map.get("id"),
                    1
            );
            executeSql(insertRuleSensorDefineSql);
            tRuleDefineId++;
            tAlertDefineId++;
            tAlertTemplateDefineId++;
            tRuleSensorDefineId++;
        }
    }

    /**
     * 根据DeviceModelId迁移数据
     */
    @Test
    public void testAddDeviceSql() {
        int sourceDeviceModelId = 96;

        // 先查出deviceModel
        Map<String, Object> modelMap = cd2kSourceJdbcTemplate.queryForMap("SELECT * FROM n_DeviceModel WHERE id = ?", sourceDeviceModelId);
        Map<String, String> modelMapNew = dealMap(modelMap);
        String insertDeviceModelSql = String.format(insertDeviceModelTemplate,
                tDeviceModelId,
                modelMapNew.get("deviceTypeId"),
                modelMapNew.get("model"),
                modelMapNew.get("displayName"),
                modelMapNew.get("description"),
                modelMapNew.get("reference"));
        executeSql(insertDeviceModelSql);

        // 命令集
        List<Map<String, Object>> commandList = cd2kSourceJdbcTemplate.queryForList("SELECT * FROM n_DefaultCommand WHERE deviceModelId = ? ORDER BY id ASC ", sourceDeviceModelId);
        for (Map<String, Object> item : commandList) {
            Map<String, String> itemNew = dealMap(item);
            String insertCommandSql = String.format(insertCommandTemplate,
                    tDefaultCommandId,
                    tDeviceModelId,
                    itemNew.get("name"),
                    itemNew.get("startRegister"),
                    itemNew.get("length"),
                    itemNew.get("commandType"),
                    itemNew.get("commandString"),
                    itemNew.get("commandBytes"),
                    itemNew.get("classId"),
                    itemNew.get("addr"),
                    itemNew.get("ver"),
                    itemNew.get("ctrlData"),
                    itemNew.get("oidStart"));
            tDefaultCommandId++;
            executeSql(insertCommandSql);
            // 传感器列表
            List<Map<String, Object>> sensorList = cd2kSourceJdbcTemplate.queryForList("SELECT * FROM n_SensorDefine WHERE defaultCommandId = ? ORDER BY id ASC ", item.get("id"));
            for (Map<String, Object> sensorItem :
                    sensorList) {
                sensorIdMap.put(String.valueOf(sensorItem.get("id")), String.valueOf(tSensorId));
                Map<String, String> sensorItemNew = dealMap(sensorItem);
                String insertSensorSql = String.format(insertSensorTemplate,
                        tSensorId,
                        tDeviceModelId,
                        sensorItemNew.get("name"),
                        sensorItemNew.get("displayName"),
                        sensorItemNew.get("description"),
                        sensorItemNew.get("registerIndex"),
                        sensorItemNew.get("scale"),
                        sensorItemNew.get("unit"),
                        sensorItemNew.get("isState").equals("'false'") ? 0 : 1,
                        sensorItemNew.get("isBit").equals("'false'") ? 0 : 1,
                        sensorItemNew.get("bitOrder"),
                        sensorItemNew.get("dividedBy"),
                        sensorItemNew.get("start"),
                        sensorItemNew.get("len"),
                        sensorItemNew.get("classId"),
                        sensorItemNew.get("parentId"),
                        sensorItemNew.get("attributeName"),
                        sensorItemNew.get("defaultCommandId")
                );
                executeSql(insertSensorSql);
                tSensorId++;
            }
        }

        // 对应的告警模板
        List<Map<String, Object>> alertTemplateList = cd2kSourceJdbcTemplate.queryForList("SELECT * FROM n_AlertTemplate WHERE deviceModelId = ? ORDER BY id ASC", sourceDeviceModelId);
        for (Map<String, Object> item :
                alertTemplateList) {
            Map<String, String> itemNew = dealMap(item);
            String insertAlertTemplateSql = String.format(insertAlertTemplate,
                    tAlertTemplateId,
                    itemNew.get("name"),
                    tDeviceModelId,
                    itemNew.get("description"));
            executeSql(insertAlertTemplateSql);
            List<Map<String, Object>> ruleDefineList = cd2kSourceJdbcTemplate.queryForList("SELECT * FROM n_RuleDefine WHERE id IN ( SELECT t.ruleDefineId FROM n_AlertDefine t WHERE t.deviceModelId = ? ) ORDER BY id ASC", sourceDeviceModelId);
            for (Map<String, Object> ruleDefineItem :
                    ruleDefineList) {
                ruleDefineIdMap.put(String.valueOf(ruleDefineItem.get("id")), String.valueOf(tRuleDefineId));
                Map<String, String> ruleDefineItemNew = dealMap(ruleDefineItem);
                String insertRuleDefineSql = String.format(insertRuleDefineTemplate,
                        tRuleDefineId,
                        ruleDefineItemNew.get("name"),
                        ruleDefineItemNew.get("classId")
                );
                tRuleDefineId++;
                executeSql(insertRuleDefineSql);
            }
            List<Map<String, Object>> alertDefineList = cd2kSourceJdbcTemplate.queryForList("SELECT * FROM n_AlertDefine WHERE deviceModelId = ? ORDER BY id ASC", sourceDeviceModelId);
            for (Map<String, Object> alertDefineItem :
                    alertDefineList) {
                alertDefineIdMap.put(String.valueOf(alertDefineItem.get("id")), String.valueOf(tAlertDefineId));
                Map<String, String> alertDefineItemNew = dealMap(alertDefineItem);
                String insertAlertDefineSql = String.format(insertAlertDefineTemplate,
                        tAlertDefineId,
                        ruleDefineIdMap.get(String.valueOf(alertDefineItem.get("ruleDefineId"))),
                        tDeviceModelId,
                        alertDefineItemNew.get("title"),
                        alertDefineItemNew.get("category"),
                        alertDefineItemNew.get("number"),
                        alertDefineItemNew.get("level"),
                        alertDefineItemNew.get("descriptionPattern"),
                        alertDefineItemNew.get("repeat"),
                        alertDefineItemNew.get("minInterval"),
                        alertDefineItemNew.get("enable").equals("'false'") ? 0 : 1
                );
                executeSql(insertAlertDefineSql);
                tAlertDefineId++;
            }

            List<Map<String, Object>> alertTemplateDefineList = cd2kSourceJdbcTemplate.queryForList("SELECT * FROM n_AlertTemplateDefine WHERE alertTemplateId IN ( SELECT t.id FROM n_AlertTemplate t WHERE t.deviceModelId = ?) ORDER BY id ASC", sourceDeviceModelId);
            for (Map<String, Object> alertTemplateDefineItem :
                    alertTemplateDefineList) {
                alertTemplateDefineIdMap.put(String.valueOf(alertTemplateDefineItem.get("id")), String.valueOf(tAlertTemplateDefineId));
                String insertAlertTemplateDefineSql = String.format(insertAlertTemplateDefineTemplate,
                        tAlertTemplateDefineId,
                        tAlertTemplateId,
                        alertDefineIdMap.get(String.valueOf(alertTemplateDefineItem.get("alertDefineId")))
                );
                executeSql(insertAlertTemplateDefineSql);
                tAlertTemplateDefineId++;
            }
            tAlertTemplateId++;


            List<Map<String, Object>> ruleSensorDefineList = cd2kSourceJdbcTemplate.queryForList("SELECT * FROM n_RuleSensorDefine WHERE ruleDefineId IN ( SELECT t.ruleDefineId FROM n_AlertDefine t WHERE t.deviceModelId = ?) ORDER BY id ASC", sourceDeviceModelId);
            for (Map<String, Object> ruleSensorDefineItem :
                    ruleSensorDefineList) {
                Map<String, String> ruleSensorDefineItemNew = dealMap(ruleSensorDefineItem);
                String insertRuleSensorDefineSql = String.format(insertRuleSensorDefineTemplate,
                        tRuleSensorDefineId,
                        ruleDefineIdMap.get(String.valueOf(ruleSensorDefineItem.get("ruleDefineId"))),
                        sensorIdMap.get(String.valueOf(ruleSensorDefineItem.get("sensorDefineId"))),
                        ruleSensorDefineItemNew.get("limit")
                );
                executeSql(insertRuleSensorDefineSql);
                tRuleSensorDefineId++;
            }
            tAlertTemplateId++;
        }
    }

    @Test
    public void test() {

    }

    private void executeSql(String sql) {
        System.out.println(sql);
    }

    private Map<String, String> dealMap(Map<String, Object> map) {
        Map<String, String> result = new HashMap<>();
        for (Map.Entry<String, Object> item :
                map.entrySet()) {
            String value = null;
            if (item.getValue() != null) {
                value = "'" + item.getValue() + "'";
            }
            result.put(item.getKey(), value);
        }
        return result;
    }
}
