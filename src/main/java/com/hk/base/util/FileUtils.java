package com.hk.base.util;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by LuHj on 2018/10/9.
 */
public class FileUtils {

    public static String readFileToString(String filePath) {
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
            while ((nextLine = br.readLine()) != null) {
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

    public static String readFileWithLine(String filePath, IHandleLineString handleLineString) {
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
            while ((nextLine = br.readLine()) != null) {
                handleLineString.handle(filePath, nextLine);
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

    public static List<String> scanFiles(String path) {
        List<String> filePaths = new ArrayList<String>();
        LinkedList<File> list = new LinkedList<File>();
        File dir = new File(path);
        File[] file = dir.listFiles();

        for (int i = 0; i < file.length; i++) {
            if (file[i].isDirectory()) {
                // 把第一层的目录，全部放入链表
                list.add(file[i]);
            }else{
                filePaths.add(file[i].getAbsolutePath());
            }
        }
        // 循环遍历链表
        while (!list.isEmpty()) {
            // 把链表的第一个记录删除
            File tmp = list.removeFirst();
            // 如果删除的目录是一个路径的话
            if (tmp.isDirectory()) {
                // 列出这个目录下的文件到数组中
                file = tmp.listFiles();
                if (file == null) {// 空目录
                    continue;
                }
                // 遍历文件数组
                for (int i = 0; i < file.length; ++i) {
                    if (file[i].isDirectory()) {
                        // 如果遍历到的是目录，则将继续被加入链表
                        list.add(file[i]);
                    }
                    filePaths.add(file[i].getAbsolutePath());
                }
            }
        }
        return filePaths;
    }

    public static boolean creatFile(String name, String context) throws IOException {
        boolean flag = false;
        File filename = new File(name);
        if (!filename.exists()) {
            filename.createNewFile();
            flag = true;
            writeFile(filename, context);
        }
        return flag;
    }

    public static boolean writeFile(File file, String newStr) throws IOException {
        // 先读取原有文件内容，然后进行写入操作
        boolean flag = false;
        String filein = newStr + "\r\n";
        String temp = "";

        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        FileOutputStream fos = null;
        PrintWriter pw = null;
        try {
            // 文件路径
            // 将文件读入输入流
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            StringBuffer buf = new StringBuffer();

            // 保存该文件原有的内容
            for (int j = 1; (temp = br.readLine()) != null; j++) {
                buf = buf.append(temp);
                // System.getProperty("line.separator")
                // 行与行之间的分隔符 相当于“\n”
                buf = buf.append(System.getProperty("line.separator"));
            }
            buf.append(filein);

            fos = new FileOutputStream(file);
            pw = new PrintWriter(fos);
            pw.write(buf.toString().toCharArray());
            pw.flush();
            flag = true;
        } catch (IOException e1) {
            // TODO 自动生成 catch 块
            throw e1;
        } finally {
            if (pw != null) {
                pw.close();
            }
            if (fos != null) {
                fos.close();
            }
            if (br != null) {
                br.close();
            }
            if (isr != null) {
                isr.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
        return flag;
    }

    public static  void write(File file, String context){
//        File file = new File("/root/sms.log");
        FileOutputStream out= null;
        try {
            if(!file.exists()) {
                file.createNewFile();
            }else{
                FileWriter fw = new FileWriter(file);
                fw.write("");
                fw.close();
            }
            out = new FileOutputStream(file,true);
            out.write(context.toString().getBytes("utf-8"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
