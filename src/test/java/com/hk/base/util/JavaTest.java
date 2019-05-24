package com.hk.base.util;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LuHj on 2019/4/18.
 */
public class JavaTest {

    @Test
    public void testHigh() {
        char[] hexArray = new char[]{'f', 'a', '0', '0'};
        String hexStr = "";
        for (int i = hexArray.length - 1; i >= 0; i -= 2) {
            hexStr += (i - 1 < 0 ? '0' : hexArray[i - 1]) + "" + hexArray[i];
        }
        System.out.println(hexStr);
    }


    @Test
    public void testInt() {
        System.out.println("===========================");
        StringBuilder a = new StringBuilder("A");
        StringBuilder b = new StringBuilder("B");
        operator(a, b);
        System.out.println(a + "," + b);

        System.out.println("===========================");
        Map<String, Object> map = new HashMap<>();
        map.put("name",null);
        System.out.println(map.size());
        map.put("name", "name");
        System.out.println(map.size());
        map.put("value","1");
        System.out.println(map.size());

        System.out.println("===========================");
        int i = 9;
        int j= 3;
        switch (i++){
            case 3:
                System.out.println(3);
            case 9:
                System.out.println(9);
                System.out.println(i);
                default:
                    System.out.println("default");
        }

        System.out.println("===========================");
        System.out.println("" + ('A' + 1));
        System.out.println('A' + 1);

        System.out.println("===========================");
        Parent parent = new Child();
        System.out.println("child.main.x="+parent.x);

        System.out.println("===========================");
        Integer f1 = 120, f2 = 120, f3 = 138, f4=138;
        Integer f5 = new Integer(127), f6 = new Integer(127), f7 = new Integer(120);
        System.out.println(f1 == f2);
        System.out.println(f3 == f4);
        System.out.println(f5 == f6);
        System.out.println(f1 == f7);

        System.out.println("===========================");
        try {
            try {
                throw new B1();
            }catch (A1 e){
                System.out.println(" A ");
                throw e;
            }
        }catch (B1 e){
            System.out.println(" B ");
        }finally {
            System.out.println("finally");
        }

        System.out.println("===========================");
        Inc inc = new Inc();
        int k = 0;
        inc.fermin(k);
        k = k++;
        System.out.println(k);

        System.out.println("===========================");
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        try {
            Class<?> clazz = classLoader.loadClass("com.hk.base.util.Aload");
            System.out.println("test");
            clazz.forName("com.hk.base.util.Aload");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String s1 = "abc" + "def";
        String s2 = new String(s1);
        String s3 = new StringBuffer().append(s1).toString();
        if (s1.equals(s2))
            System.out.println(".equals success");
        if (s1 == s2){
            System.out.println("== success");
        }
        if (s3 == s1){
            System.out.println("s3 == success");
        }

    }

    private static void operator(StringBuilder x, StringBuilder y) {
        x.append(y);
        y = x;
    }

    class A1 extends Exception{}
    class B1 extends A1{}
    class Inc {
        void fermin(int i){
            i++;
        }
    }

    @Test
    public void testInteger(){
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Integer h = 100;
        Integer i = 121;
        Long g = 3L;

        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(c == (a+b));
        System.out.println(c.equals(a+b));
        System.out.println(g == (a+b));
        System.out.println(g.equals(a+b));
        System.out.println(e == (h + h + i));
        System.out.println(e.equals(h + h + i));

    }
}
