package com.hk.java8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ReplaceDemo {
    public static void main(String[] args) {
        String temp = "my.ni.hao";
        String str1 = temp.replace('.', '#');
        String str2 = temp.replace(".", "#");
        String str3 = temp.replaceFirst(".", "#");
        String str4 = temp.replaceAll(".", "#");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        String str = "BB";
        switch (str){
            case "Aa":
                System.out.println("1");
                break;
            case "BB":
                System.out.println("2");
                break;
            default:
                System.out.println("out");
                break;
        }

        Set<String> set1 = new HashSet<>();
        set1.add("Aa");
        set1.add("BB");
        set1.add(null);
        Set<String> set2 = new TreeSet<>();
        set2.add("Aa");
        set2.add("BB");
        set2.add(null);

        System.out.println("end");
    }
}
