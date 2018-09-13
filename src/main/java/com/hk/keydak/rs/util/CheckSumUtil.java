package com.hk.keydak.rs.util;

/**
 * Created by LuHj on 2018/9/11.
 */
public class CheckSumUtil {
    public static byte Get_xor8(byte[] bufData){
        byte temp = 0x00; //校验值
        for(int i = 0; i < bufData.length; i++){ //异或
            temp ^= bufData[i];
        }
        return temp;
    }

    public static boolean Volid_xor8 (byte[] bufData, byte value){
        if (value == Get_xor8(bufData)){
            return true;
        }else {
            return false;
        }
    }
}
