package com.hk.base.util;

/**
 * Created by LuHj on 2019/4/28.
 */
public class Child extends Parent {
    int x = 9;

    @Override
    void add(int y) {
        System.out.println("Child.add.before.x=" + x);
        x+=y;
        System.out.println("Child.add.after.x=" + x);
    }
}
