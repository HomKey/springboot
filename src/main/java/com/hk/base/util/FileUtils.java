package com.hk.base.util;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

/**
 * Created by LuHj on 2018/10/9.
 */
public class FileUtils {

    /**
     * 读取文件
     *
     * @param filePath
     * @param charset
     * @return
     */
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

    /**
     * 读取文件
     *
     * @param filePath
     * @return
     */
    public static String readFileToString(String filePath) {
        return readFileToString(filePath, StandardCharsets.UTF_8);
    }

    /**
     * 每行读取文件内容
     *
     * @param filePath         文件路径
     * @param charset          字符集
     * @param handleLineString
     */
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

    /**
     * 每行读取文件内容
     *
     * @param filePath         文件路径
     * @param handleLineString
     */
    public static void readFileWithLine(String filePath, IHandleLineString handleLineString) {
        readFileWithLine(filePath, StandardCharsets.UTF_8, handleLineString);
    }

    /**
     * 获取所有文件名(递归每层的文件夹)
     *
     * @param path   文件路径
     * @param result 结果集
     */
    public static void scanAllFiles(String path, List<String> result) {
        List<String> fileList = scanFiles(path);
        result.addAll(fileList);
        List<String> optional = scanFolders(path);
        optional.forEach(str -> {
            scanAllFiles(str, result);
        });
    }

    /**
     * 获取路径下的所有文件(非文件夹)路径
     *
     * @param path 文件路径
     * @return
     */
    public static List<String> scanFiles(String path) {
        return scanFiles(path, false);
    }

    /**
     * 获取路径下的所有文件路径
     *
     * @param path        文件路径
     * @param isDirectory 是否是文件夹
     * @return
     */
    public static List<String> scanFiles(String path, boolean isDirectory) {
        List<String> filePaths = new ArrayList<>();
        try (Stream<Path> pathStream = Files.list(Paths.get(path))) {
            pathStream.filter(p -> p.toFile().isDirectory() == isDirectory)
                    .forEach(s -> {
                        filePaths.add(s.toString());
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filePaths;
    }

    /**
     * 获取路径下的所有文件夹路径
     *
     * @param path 文件路径
     * @return
     */
    public static List<String> scanFolders(String path) {
        return scanFiles(path, true);
    }

    /**
     * 创建文件并写入内容
     *
     * @param filePath 文件路径
     * @param context  写入内容
     * @return
     */
    public static boolean createFile(String filePath, String context) {
        Path path = Paths.get(filePath);
        boolean flag = false;
        if (!Files.exists(path)) {
            try {
                Files.createFile(path);
                Files.write(path, context.getBytes());
                flag = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return flag;
    }

    /**
     * 覆盖文件内容
     *
     * @param filePath 文件路径
     * @param context  覆盖的内容
     */
    public static void write(String filePath, String context) {
        write(filePath, context, false);
    }

    /**
     * 写入文件
     *
     * @param filePath 文件路径
     * @param context  写入内容
     * @param isAppend 是否追加
     */
    public static boolean write(String filePath, String context, boolean isAppend) {
        boolean flag = false;
        Path path = Paths.get(filePath);
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            if (isAppend) {
                writer.append(context);
            } else {
                writer.write(context);
            }
            flag = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 根据文件路径截取文件名
     *
     * @param filePath 文件路径
     * @return
     */
    public static String getFileName(String filePath) {
        String[] temp = filePath.trim().split("\\\\");
        return temp[temp.length - 1];
    }

    /**
     * 获取文件夹名称
     *
     * @param path 文件路径
     * @return
     */
    public static List<String> getFolderName(String path) {
        List<String> list = new ArrayList<>();
        File dir = new File(path);
        File[] file = dir.listFiles();

        for (int i = 0; i < file.length; i++) {
            if (file[i].isDirectory()) {
                list.add(file[i].getName());
            }
        }
        return list;
    }

    /**
     * 替换文件内容
     *
     * @param path   文件路径
     * @param regex 正则表达式
     * @param replacement 新字符串
     * @param num    替换次数(num=0时全局替换)
     * @return
     */
    public static boolean replaceFile(String path, String regex, String replacement, int num) {
        if (regex == null || replacement == null) {
            return false;
        }
        String context = readFileToString(path);
        for (int i = 0; i < num; i++) {
            context = context.replaceFirst(regex, replacement);
        }
        if (num <= 0) {
            context = context.replaceAll(regex, replacement);
        }
        return write(path, context, false);
    }

    /**
     * 删除文件
     * @param filePath
     * @return
     */
    public static boolean deleteFile(String filePath) {
        File file = new File(filePath);
        return !(file.exists() && file.isFile() && !file.delete());
    }

    /**
     * 复制文件
     * @param srcPath 源文件
     * @param desPath 目标文件
     * @return
     */
    public static boolean copyFile(String srcPath, String desPath) {
        return createFile(desPath, readFileToString(srcPath));
    }

}
