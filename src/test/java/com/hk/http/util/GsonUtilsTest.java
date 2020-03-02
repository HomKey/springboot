package com.hk.http.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GsonUtilsTest {

    @Test
    public void testGson(){
        String jsonStr = "{\"sentences\":[{\"trans\":\"計算\",\"orig\":\"calculate\",\"backend\":1}],\"src\":\"en\",\"confidence\":0.9609375,\"spell\":{},\"ld_result\":{\"srclangs\":[\"en\"],\"srclangs_confidences\":[0.9609375],\"extended_srclangs\":[\"en\"]}}";
        JsonParser jsonParser = new JsonParser();
        JsonElement element = jsonParser.parse(jsonStr);
        JsonElement element1 = element.getAsJsonObject().get("sentences").getAsJsonArray().get(0);
        String trans = element1.getAsJsonObject().get("trans").getAsString();
        System.out.println(trans);
    }

}