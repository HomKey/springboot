package com.hk.demo.controller;

import org.junit.Test;

import java.util.UUID;

/**
 * Created by LuHj on 2019/7/11.
 */
public class UUIDTest {
    
    @Test
    public void test(){
        UUID uuid = UUID.fromString("02cc30c5-2df1-445f-8f26-02b83effeb422");
        System.out.println(uuid.toString());
        UUID uuid1 = UUID.fromString("02cc30c5-2df1-445f-8f26-12b83effeb422");// 8 - 4 - 4 - 4 - 13
        System.out.println(uuid1.toString());
        UUID uuid2 = UUID.fromString("02cc30c5-2df1-445f-8f26-2b83effeb422");
        System.out.println(uuid2.toString());
    }
    @Test
    public void testInt(){
        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;
        int k = i+j;
        System.out.println(k);
    }
}
