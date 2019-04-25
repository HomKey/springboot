package com.hk.base.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by LuHj on 2018/10/23.
 */
public class GetDeviceInfoHandle implements IHandleLineString {

    public static boolean skip = false;

//    public static Map<String, Set<String>> datas = new HashMap<>();

    public static Map<String, String> datas = new HashMap<>();

    @Override
    public void handle(String filePath, String str) {
        String fileName = FileUtils.getFileName(filePath);
        switch (fileName){
            case "commands.xml":
                if (str.contains("name") && !(str.contains("_h") || str.contains("_l"))){
                    String key = str.replace("<name>","").replace("</name>","").trim();
//                    System.out.println(key);
                    datas.put(key,"null");
                }
                break;
            case "DeviceDefines.xml":
                if (str.contains("name") && !(str.contains("_h") || str.contains("_l"))){
                    String key = str.replace("<name>","").replace("</name>","").trim();
//                    System.out.println(key);
                    datas.put(key,"null");
                }
                break;
            default:
                break;
        }
    }



    private boolean skip(String str){
        if (str.contains("<!--")){
            skip = true;
        }
        if (str.contains("-->")){
            skip = false;
        }
        return skip;
    }
}
