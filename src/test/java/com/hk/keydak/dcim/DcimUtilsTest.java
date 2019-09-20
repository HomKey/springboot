package com.hk.keydak.dcim;

import org.junit.Test;

import java.util.UUID;

/**
 * Created by HomKey on 2019/9/20.
 */
public class DcimUtilsTest {

    @Test
    public void createUUID(){
//        095183E9-5863-4E68-B5D4-1D3CF4DE5F5F

        for (int i = 0; i < 10; i++) {
            System.out.println(UUID.randomUUID().toString());
        }

    }
}
