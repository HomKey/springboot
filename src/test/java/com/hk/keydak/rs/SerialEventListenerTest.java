package com.hk.keydak.rs;


import org.junit.Test;


/**
 * Created by LuHj on 2018/9/6.
 */
public class SerialEventListenerTest {

    @Test
    public void testValue(){
        String a = "ABC";
        String b = a;
        a = "BVC";
        System.out.println(b);
    }

    @Test
    public void test(){
        int a[] ={0x81, 0x88, 0xA1,0x01,0x30,0x03,0x00,0x00,0x20,0x00};
        int b[] = new int[a.length];
        int t;
        int i,sum=0;
        for(i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        for(i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        System.out.println(sum);
        System.out.println(sum&0xFF);
//        t=sum&0xFF;
//        t=~t&0xFF;
//        b[1]=t;
        sum=0;
        for(i=0;i<a.length;i++)
        {
            sum+=b[i];
        }
        System.out.println(sum&0xFF);
    }

    @Test
    public void testSerial(){
        SerialEventListener serialEventListener = new SerialEventListener("COM2", 9600);
        serialEventListener.start();
        while (true){}
    }

}
