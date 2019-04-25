package com.hk.base.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by LuHj on 2018/10/15.
 */
public class DeviceStrHandle implements IHandleLineString {

    public static Set<String> caemhList = new HashSet<>();
    public static Set<String> cracList = new HashSet<>();
    public static Set<String> pdcList = new HashSet<>();
    public static Set<String> ubitList = new HashSet<>();
    public static boolean isGet = false;
    public static String host = "";
    @Override
    public void handle(String filePath, String str) {

        if (str!=null && str.contains("<deviceId>")){
            isGet = true;
            String[] fileName = filePath.split("#");
            StringBuffer context = new StringBuffer();
            if (fileName.length == 3){
                String[] array = fileName[0].split("config");
                String name = array[1].substring(1, array[1].length());
//                System.out.println(name);
                String deviceId = str.replaceAll("<deviceId>", "").replaceAll("</deviceId>", "").trim();
                String deviceStr = name + "#" +deviceId;

                switch (name){
                    case "CAEMH":
                        caemhList.add(host + "=" + deviceId);
                        break;
                    case "CRAC":
                        cracList.add(host + "=" + deviceId);
                        break;
                    case "PDC":
                        pdcList.add(host + "=" + deviceId);
                        break;
                    case "Ubit":
                        ubitList.add(host + "=" + deviceId);
                        break;
                }

            }
        }
        if (str!=null && str.contains("<destinationHost>")){
            host = str.replace("<destinationHost>", "").replace("</destinationHost>", "").trim();
        }


    }



}
