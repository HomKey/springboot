package com.hk.base.util;

import org.junit.Test;

/**
 * Created by LuHj on 2019/4/18.
 */
public class DemoTest {

    @Test
    public void testHigh(){
        char[] hexArray = new char[]{'f','a','0','0'};
        String hexStr = "";
        for (int i = hexArray.length - 1; i >= 0; i-=2) {
            hexStr += ( i-1 < 0 ? '0' : hexArray[i - 1]) +""+ hexArray[i];
        }
        System.out.println(hexStr);

    }
}
