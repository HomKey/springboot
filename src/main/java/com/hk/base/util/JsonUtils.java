package com.hk.base.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * Created by LuHj on 2018/10/9.
 */
public class JsonUtils {
    public static <T> T readJson(String filePath, Class<T> classOfT){
        String jsonStr = FileUtils.readFileToString(filePath);
        Gson gson = new Gson();
        T result = gson.fromJson(jsonStr, new TypeToken<T>() {
        }.getType());
        return result;
    }

    public static <T> List<T> readJsonList(String filePath, Class<T> classOfT){
        String jsonStr = FileUtils.readFileToString(filePath);
        Gson gson = new Gson();
        List<T> results = gson.fromJson(jsonStr, new TypeToken<List<T>>() {
        }.getType());
        return results;
    }
}
