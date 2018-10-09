package com.hk.base.util;

import java.io.*;

/**
 * Created by LuHj on 2018/10/9.
 */
public class FileUtils {

    public static String readFileToString(String filePath){
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String resultJson = "";
        try {
            fis = new FileInputStream(filePath);
            isr = new InputStreamReader(fis, "UTF-8");
            br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String nextLine = "";
            while ((nextLine = br.readLine()) != null){
                sb.append(nextLine);
            }
            resultJson = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (isr != null) {
                    isr.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return resultJson;
    }



}
