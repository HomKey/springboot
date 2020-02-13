package com.hk.translate.impl;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.hk.http.util.HttpUtils;
import com.hk.translate.ITranslate;
import com.hk.translate.enums.GoogleTranslateEnum;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.*;

public class GoogleTranslate implements ITranslate {
//    http://translate.google.cn/translate_a/single?client=gtx&dt=t&dj=1&ie=UTF-8&sl=auto&tl=zh_TW&q=calculate
    private static final String HTTPS_PATH = "https://translate.googleapis.com/translate_a/single";
    private static final String HTTP_PATH = "http://translate.google.cn/translate_a/single";
    private static final String CLIENT = "gtx";
    private static final String DT = "t";

    private volatile static GoogleTranslate instance = null;

    private GoogleTranslate() {
    }

    public static GoogleTranslate getInstance() {
        if (null == instance) {
            synchronized (GoogleTranslate.class) {
                if (null == instance) {
                    instance = new GoogleTranslate();
                }
            }
        }
        return instance;
    }

    @Override
    public boolean isSupport(String language) {
        return null != GoogleTranslateEnum.get(language);
    }

    @Override
    public String translateText(String text, String sourceLang, String targetLang) {
        GoogleTranslateEnum sourceGoogleLang = GoogleTranslateEnum.get(sourceLang);
        GoogleTranslateEnum targetGoogleLang = GoogleTranslateEnum.get(targetLang);
        if (null == sourceGoogleLang || null == targetGoogleLang) {
            return "";
        }
        List<NameValuePair> nameValuePairs = new ArrayList<>();
        nameValuePairs.add(new BasicNameValuePair("client", CLIENT));
        nameValuePairs.add(new BasicNameValuePair("dt", DT));
        nameValuePairs.add(new BasicNameValuePair("sl", sourceGoogleLang.getValue()));
        nameValuePairs.add(new BasicNameValuePair("tl", targetGoogleLang.getValue()));
        nameValuePairs.add(new BasicNameValuePair("q", text));
        // https
//        String httpsResp = HttpUtils.postHttp(HTTPS_PATH, nameValuePairs);
//        if (null == httpsResp) {
//            return "";
//        }
        // http
        nameValuePairs.add(new BasicNameValuePair("ie","UTF-8"));
        nameValuePairs.add(new BasicNameValuePair("dj","1"));
        String httpResp = HttpUtils.postHttp(HTTP_PATH, nameValuePairs);
        if (null == httpResp) {
            return "";
        }
        return getResult(httpResp);
    }

    private String getResult(String jsonResponse) {
        JsonParser jsonParser = new JsonParser();
        JsonElement element = jsonParser.parse(jsonResponse);
        JsonArray sentences = element.getAsJsonObject().get("sentences").getAsJsonArray();
        if (sentences.size() > 0) {
            JsonElement element1 = sentences.get(0);
            return element1.getAsJsonObject().get("trans").getAsString();
        }
        return "";
    }


}
