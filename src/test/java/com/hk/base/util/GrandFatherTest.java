package com.hk.base.util;

import org.junit.Test;

import java.lang.invoke.MethodHandle;
import static java.lang.invoke.MethodHandles.Lookup;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * Created by LuHj on 2019/5/5.
 */
public class GrandFatherTest {
    class GrandFather{
        void thinking(){
            System.out.println("GrandFather");
        }
    }

    class Father extends GrandFather{
        @Override
        void thinking() {
            System.out.println("Father");
        }
    }

    class Son extends Father{
        @Override
        void thinking() {
            System.out.println("son");
            try {
                MethodType methodType = MethodType.methodType(void.class);
                MethodHandle methodHandle = MethodHandles.lookup().findSpecial(GrandFather.class, "thinking", methodType, getClass());
                methodHandle.invoke(this);
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test(){
        (new GrandFatherTest().new Son()).thinking();
    }

    static class ClassA{
        public void println(String s){
            System.out.println(s);
        }
    }


    private static MethodHandle getPrintlnMH(Object recevier) throws Throwable{
        MethodType mt = MethodType.methodType(void.class,String.class);
        return MethodHandles.lookup().findVirtual(recevier.getClass(),"println",mt).bindTo(recevier);
    }

    @Test
    public void test2() throws Throwable {
        String name = "sSs你好";

        System.out.println(name.toLowerCase());

    }

    private int getCombination(int number){
        if (number == 2){
            return 1;
        }
        return (number - 1 )+ getCombination(number - 1);
    }

    @Test
    public void testCombination(){
        int number = 4;
        int combination = getCombination(number);
        System.out.println(combination + 1);
    }
}
