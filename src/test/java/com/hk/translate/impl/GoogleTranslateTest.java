package com.hk.translate.impl;

import com.hk.translate.ITranslate;
import org.junit.Test;

import static org.junit.Assert.*;

public class GoogleTranslateTest {
    @Test
    public void testGoogleTranslate(){
        ITranslate translate = GoogleTranslate.getInstance();
        String s = translate.translateText("温度", "auto", "en");
        System.out.println(s);
        String t = translate.translateText(s, "auto", "zh_cn");
        System.out.println(t);
    }


}