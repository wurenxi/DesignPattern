package com.atguigu.singleton.type3;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/26 10:20
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        System.out.println("懒汉式1，线程不安全");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton {

    private static Singleton instance;

    private Singleton() {}

    // 提供一个静态公有方法，当使用该方法时，才去创建instance
    // 懒汉式
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
