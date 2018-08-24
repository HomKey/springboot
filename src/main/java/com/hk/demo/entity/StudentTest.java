package com.hk.demo.entity;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * Created by LuHj on 2018/8/15.
 */
public class StudentTest implements Cloneable, Serializable {

    private int id;

    public StudentTest() {
    }

    public StudentTest(Integer id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public String toString() {
        return "StudentTest [id=" + id + "]";
    }

    public static void main(String[] args) throws Exception {

        System.out.println("使用new关键字创建对象：");
        StudentTest stu1 = new StudentTest(123);
        System.out.println(stu1);
        System.out.println(" --------------------------- ");


        System.out.println("使用Class类的newInstance方法创建对象：");
        StudentTest stu2 = StudentTest.class.newInstance();    //对应类必须具有无参构造方法，且只有这一种创建方式
        System.out.println(stu2);
        System.out.println(" --------------------------- ");

        System.out.println("使用Constructor类的newInstance方法创建对象：");
        Constructor<StudentTest> constructor = StudentTest.class
                .getConstructor(Integer.class);   // 调用有参构造方法
        StudentTest stu3 = constructor.newInstance(123);
        System.out.println(stu3);
        System.out.println(" --------------------------- ");

        System.out.println("使用Clone方法创建对象：");
        StudentTest stu4 = (StudentTest) stu3.clone();
        System.out.println(stu4);
        System.out.println(" --------------------------- ");

        System.out.println("使用(反)序列化机制创建对象：");
        // 写对象
        ObjectOutputStream output = new ObjectOutputStream(
                new FileOutputStream("StudentTest.bin"));
        output.writeObject(stu4);
        output.close();

        // 读取对象
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(
                "StudentTest.bin"));
        StudentTest stu5 = (StudentTest) input.readObject();
        System.out.println(stu5);

    }
}
