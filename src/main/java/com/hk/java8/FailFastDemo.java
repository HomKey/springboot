package com.hk.java8;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FailFastDemo {

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        List<String> listStr = Arrays.asList("hello","world","name","I","U","He","She");
        for (int i = 0; i < listStr.size(); i++) {
            User user = new User();
            user.setId(i);
            user.setName(listStr.get(i));
            list.add(user);
        }
        Iterator<User> iterator = list.iterator();
        int i=0;
        while (iterator.hasNext()){
            i++;
            User next = iterator.next();
//            next.setName("abc");
            System.out.println(next.name);
            if (i == 2){
                iterator.remove();
                list.remove(2);
            }
        }
        System.out.println(list);
        System.out.println("end");
    }
    public static class User{
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
