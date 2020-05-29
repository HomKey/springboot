package com.hk.base.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class HexUtilTest {

    @Test
    public void test(){
        byte[] data = new byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        String str = String.format("%s.%s.%s.%s",
                HexUtil.byteArrayToInt(data,0,4),
                HexUtil.byteArrayToInt(data,3,4),
                HexUtil.byteArrayToInt(data,7,4),
                HexUtil.byteArrayToInt(data,11,4)
        );
        System.out.println(str);
    }
}