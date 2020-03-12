package com.hk.keydak;

import com.hk.base.util.HexUtil;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by HomKey on 2020/3/9.
 */
public class WgDataUtilsTest {
    @Test
    public void toLong() throws Exception {
        Long lo = WgDataUtils.toLong(new byte[]{0x1D,(byte) 0x85,(byte) 0xB5,0x0D  });
        Long lo2 = WgDataUtils.toLong(new byte[]{0x00, (byte) 0x00, (byte) 0x00, 0x04});
        System.out.println(lo);
    }


    @Test
    public void testByte(){
        byte[] bytes = WgDataUtils.toBytes(225001298);
        System.out.println(Arrays.toString(HexUtil.toHexStringArray(bytes, false)));
    }

}