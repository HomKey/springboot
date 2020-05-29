package com.hk.thread;

public class LocalThreadWeak {
    public static void main(String[] args) {
        new Service1().process();
    }

}
class Service1 {

    public void process() {
        User user = new User("鲁毅");
        //将User对象存储到 holder 中
        UserContextHolder.holder.set(user);
        new Service2().process();
    }
}

class Service2 {

    public void process() {
        User user = UserContextHolder.holder.get();
        System.out.println("Service2拿到用户名: " + user.name);
        new Service3().process();
    }
}

class Service3 {

    public void process() {
        System.gc();
        User user = UserContextHolder.holder.get();
        System.out.println("Service3拿到用户名: " + user.name);
        UserContextHolder.holder.remove();
    }
}
class UserContextHolder {
    public static ThreadLocal<User> holder = new ThreadLocal<>();
}

class User {

    String name;

    public User(String name) {
        this.name = name;
    }
}