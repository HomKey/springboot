package com.hk.base.util;

/**
 * Created by LuHj on 2019/4/28.
 */
public class Parent {
    int x = 10;

    public Parent() {
        System.out.println("Parent.Parent.x=" + x);
        add(2);
    }
    void add(int y){
        x+=y;
        System.out.println("Parent.add.x=" +x);
    }
}
