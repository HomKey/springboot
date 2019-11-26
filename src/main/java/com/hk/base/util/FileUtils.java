package com.hk.base.util;

import io.netty.util.CharsetUtil;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by LuHj on 2018/10/9.
 */
public class FileUtils {

    public static String readFileToString(String filePath, Charset charset) {
        StringBuilder stringBuilder = new StringBuilder();
        Path path = Paths.get(filePath);
        try (Stream<String> stream = Files.lines(path, charset)) {
            stream.forEach(str -> stringBuilder.append(str).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public static String readFileToString(String filePath) {
        return readFileToString(filePath, StandardCharsets.UTF_8);
    }

    public static void readFileWithLine(String filePath, Charset charset, IHandleLineString handleLineString) {
        Path path = Paths.get(filePath);
        try (Stream<String> stream = Files.lines(path, charset)) {
            stream.forEach(s -> {
                handleLineString.handle(filePath, s);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFileWithLine(String filePath, IHandleLineString handleLineString) {
        readFileWithLine(filePath, StandardCharsets.UTF_8, handleLineString);
    }


    public static List<String> scanFiles(String path, boolean isDirectory) {
        List<String> filePaths = new ArrayList<>();
        try (Stream<Path> pathStream = Files.list(Paths.get(path))) {
            pathStream.filter(p -> p.toFile().isDirectory() == isDirectory)
                    .forEach(s -> {
                        filePaths.add(s.getFileName().toString());
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filePaths;
    }

    public static List<String> scanFolders(String path) {
        return scanFiles(path, true);
    }

    public static boolean createFile(String filePath, String context) throws IOException {
        Path path = Paths.get(filePath);
        boolean flag = false;
        if (!Files.exists(path)){
            Files.createFile(path);
            Files.write(path, context.getBytes());
            flag = true;
        }
        return flag;
    }

    public static boolean writeFile(File file, String newStr) throws IOException {
        boolean flag = false;
        String filein = newStr + "\r\n";
        String temp = "";
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        FileOutputStream fos = null;
        PrintWriter pw = null;
        try {
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            StringBuffer buf = new StringBuffer();
            // 保存该文件原有的内容
            for (int j = 1; (temp = br.readLine()) != null; j++) {
                buf = buf.append(temp);
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

    public static void write(File file, String context, boolean isAppend) {
        FileOutputStream out = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            out = new FileOutputStream(file, isAppend);
            out.write(context.getBytes(CharsetUtil.UTF_8));
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

    public static void write(File file, String context) {
        write(file, context, true);
    }

    public static void write(String filePath, String context) {
        Path path = Paths.get(filePath);
        try (BufferedWriter writer = Files.newBufferedWriter(path)){
            writer.write(context);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void write(String filePath, String context, boolean isAppend) {
        write(new File(filePath), context, isAppend);
    }

    public static String getFileName(String filePath) {
        String[] temp = filePath.trim().split("\\\\");
        return temp[temp.length - 1];
    }

    public static List<String> getFolderName(String path) {
        List<String> list = new ArrayList<String>();
        File dir = new File(path);
        File[] file = dir.listFiles();

        for (int i = 0; i < file.length; i++) {
            if (file[i].isDirectory()) {
                list.add(file[i].getName());
            }
        }
        return list;
    }

    public static void replaceFile(String path, Map<String, String> map) {
        String context = readFileToString(path);
        for (Map.Entry<String, String> s : map.entrySet()) {
            context = context.replaceAll(s.getKey(), s.getValue());
        }
        write(path, context, false);
    }
}
