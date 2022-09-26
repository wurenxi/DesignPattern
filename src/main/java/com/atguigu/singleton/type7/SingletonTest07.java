package com.atguigu.singleton.type7;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/26 10:20
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        System.out.println("懒汉式7，线程安全，静态内部类实现");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton {

    private Singleton() {}

    // 写一个静态内部类，该类中有一个静态属性Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    // 提供一个静态公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
    // 同时保证了效率，推荐使用
    public synchronized static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
