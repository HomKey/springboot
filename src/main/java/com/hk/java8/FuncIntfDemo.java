package com.hk.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by LuHj on 2018/8/24.
 */
public class FuncIntfDemo {
    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");
        names.forEach(System.out::println);

        // 构造器引用：它的语法是Class::new，或者更一般的Class< T >::new实例如下：
        final FCar fCar = FCar.create( FCar::new );
        final List<FCar> fCars = Arrays.asList( fCar );
        // 静态方法引用：它的语法是Class::static_method，实例如下：
        fCars.forEach( FCar::collide );
        // 特定类的任意对象的方法引用：它的语法是Class::method实例如下：
        fCars.forEach( FCar::repair );
        // 特定对象的方法引用：它的语法是instance::method实例如下：
        final FCar police = FCar.create( FCar::new );
        fCars.forEach( police::follow );
    }
}
class FCar {
    //Supplier是jdk1.8的接口，这里和lamda一起使用了
    public static FCar create(final Supplier<FCar> supplier) {
        return supplier.get();
    }

    public static void collide(final FCar FCar) {
        System.out.println("Collided " + FCar.toString());
    }

    public void follow(final FCar another) {
        System.out.println("Following the " + another.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }
}
