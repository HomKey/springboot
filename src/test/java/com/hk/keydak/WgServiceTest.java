package com.hk.keydak;

import com.hk.base.util.HexUtil;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by HomKey on 2020/3/10.
 */
public class WgServiceTest {
    private WgService wgService;

    @Before
    public void before(){
        wgService = new WgService();
    }

    @Test
    public void testGetSetTargetCommand(){
//        3 225001298
//        4 225001290
//        5 225001360
//        6 225006581

        byte[] sn1 = WgDataUtils.getSn(225001298);
        print(wgService.getSetTargetCommand(sn1,"10.10.0.92",60000,0));

    }

    private void print(byte[] bytes){
        String[] strings = HexUtil.toHexStringArray(bytes, false);
        System.out.println(Arrays.toString(strings)
                .replaceAll(",", "")
                .replaceAll("\\[","")
                .replaceAll("]",""));
    }
}