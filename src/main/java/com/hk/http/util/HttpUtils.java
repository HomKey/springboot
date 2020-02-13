package com.hk.http.util;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;


public class HttpUtils {
    /**
     * post 请求
     *
     * @param url  请求地址
     * @param nvps 参数列表
     * @return
     */
    public static String postHttp(String url, List<NameValuePair> nvps) {
        String responseStr = null;
        HttpPost httpPost = new HttpPost(url);
        //重要！！必须设置 http 头，否则返回为乱码
        httpPost.setHeader("User-Agent","Mozilla/5.0");
        // 重要！！ 指定编码，对中文进行编码
        httpPost.setEntity(new UrlEncodedFormEntity(nvps, Charset.forName("UTF-8")));
        try (CloseableHttpResponse response = HttpClients.createDefault().execute(httpPost)) {
            HttpEntity httpEntity = response.getEntity();
            responseStr = EntityUtils.toString(httpEntity);
            EntityUtils.consume(httpEntity);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return responseStr;
    }

}
