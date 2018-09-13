package com.hk.keydak.rs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by LuHj on 2018/9/11.
 */
public class ShutDataTable {

    public static Map<Integer, Integer[]> DB = new HashMap<>();
    static {
        DB.put(2,new Integer[]{1,1,1,1});
        DB.put(3,new Integer[]{1,1,1,1,1,1,1});
        DB.put(6,new Integer[]{1,4});
        DB.put(7,new Integer[]{2,1,2,2});
        DB.put(15,new Integer[]{1});
        DB.put(35,new Integer[]{4,1});
        DB.put(48,new Integer[]{4,4,2,2,1,2});
        DB.put(49,new Integer[]{2,2,2,2,2,2,2,2,2});
        DB.put(50,new Integer[]{1,1,1,1,1,1,1,1,1,1,1,1});
        DB.put(55,new Integer[]{2,2,2,2,2,2,2,2,2,2,1});
        DB.put(56,new Integer[]{1,1,1,1,1,1,1,1,1});
        DB.put(58,new Integer[]{4,4,2,2,2});
        DB.put(66,new Integer[]{4,4,2,2,2,1,2,2,2});
        DB.put(119,new Integer[]{4,4,4,4,4,4});
        DB.put(120,new Integer[]{2,1,2,2,2,1,2,2,2,1,2,2});
    }

    public static void main(String[] args) {
        byte b = 0x30;
        Integer[] temp = ShutDataTable.DB.get((int)b);
        System.out.println(Arrays.toString(temp));
    }
}
