package com.hk.base.util;

import org.junit.Test;

import java.util.List;

/**
 * Created by LuHj on 2018/10/15.
 */
public class FileUtilsTest {

    @Test
    public void readFileToStringTest() throws Exception {
        String s = FileUtils.readFileToString("E:\\wsp\\wsp_intellij\\springboot\\src\\test\\resources\\file\\json\\data.json");
        System.out.println(s);
    }

    @Test
    public void testScanAllFiles() {
        List<String> result = FileUtils.scanAllFiles("E:\\wsp\\wsp_intellij\\springboot\\src\\test\\resources\\file");
        result.forEach(System.out::println);
    }

    @Test
    public void testZszl() {
        // 合并所有配置到1个配置中
        StringBuffer CommandXml = new StringBuffer();
        StringBuffer DeviceDefineXml = new StringBuffer();
        CommandXml.append("<linked-list>\n");
        DeviceDefineXml.append("<linked-list>\n");
        List<String> result = FileUtils.scanAllFiles("C:\\Users\\tandewei\\Desktop\\肿瘤\\实施\\单独配置");
        result.forEach(str -> {
            switch (FileUtils.getFileName(str)) {
                case "Commands.xml":
                    FileUtils.readFileWithLine(str, (filePath, lineStr) -> {
                        if (!lineStr.contains("linked-list")) {
                            CommandXml.append(lineStr).append("\n");
                        }
                    });
                    break;
                case "DeviceDefines.xml":
                    FileUtils.readFileWithLine(str, (filePath, lineStr) -> {
                        if (!lineStr.contains("linked-list")) {
                            DeviceDefineXml.append(lineStr).append("\n");
                        }
                    });
                    break;
                default:
                    break;
            }
        });
        CommandXml.append("</linked-list>");
        DeviceDefineXml.append("</linked-list>");
        FileUtils.write("C:\\Users\\tandewei\\Desktop\\肿瘤\\实施\\配置\\Commands.xml", CommandXml.toString());
        FileUtils.write("C:\\Users\\tandewei\\Desktop\\肿瘤\\实施\\配置\\DeviceDefines.xml", DeviceDefineXml.toString());
    }

    @Test
    public void scanFilesTest() throws Exception {
        List<String> list = FileUtils.scanFiles("./src/test/resources/file/json");
        list.forEach(System.out::println);
    }

    @Test
    public void testScanFolder() {
        List<String> list = FileUtils.scanFolders("./src/test/resources/file");
        list.forEach(System.out::println);
    }

    @Test
    public void testReadFileWithLine() throws Exception {
        FileUtils.readFileWithLine("./src/test/resources/file/json/data.json", (filePath, str) -> System.out.println(str));
    }

    @Test
    public void testCreateFile() {
        boolean txt = FileUtils.createFile("./src/test/resources/file/txt/demo.txt", "txt1111111111");
        System.out.println(txt);
    }

    @Test
    public void testWrite() {
        FileUtils.write("./src/test/resources/file/txt/demo.txt", " 2222 ");
    }

    private static int index = 1;

    @Test
    public void testXml() {
        FileUtils.readFileWithLine("./src/test/resources/file/txt/demo.txt", (filePath, str) -> {
            String[] split = str.split("\\|");
            System.out.println("<SimplePropertyDefine>\n" +
                    "    <name>" + str.replace("UPS.","").replace(".","") + "|" + index + "</name>\n" +
                    "    <sensorEntry>\n" +
                    "        <deviceId>{{DEVICE_ID}}</deviceId>\n" +
                    "        <sensorId>" + split[0] + "</sensorId>\n" +
                    "        <displayName>" + split[1] + "</displayName>\n" +
                    "    </sensorEntry>\n" +
                    "</SimplePropertyDefine>");
            index++;
        });
    }
}