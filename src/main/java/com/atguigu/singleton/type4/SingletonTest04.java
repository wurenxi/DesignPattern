package com.atguigu.singleton.type4;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/26 10:20
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        System.out.println("懒汉式2，线程安全，同步方法");
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

    // 提供一个静态公有方法，加入同步处理的代码，解决线程安全问题
    // 懒汉式
    public synchronized static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
