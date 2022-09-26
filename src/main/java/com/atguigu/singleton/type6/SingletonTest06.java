package com.atguigu.singleton.type6;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/26 10:20
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println("懒汉式4，线程安全，Double Check");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton {

    private volatile static Singleton instance;

    private Singleton() {}

    // 提供一个静态公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
    // 同时保证了效率，推荐使用
    public synchronized static Singleton getInstance() {
        if(instance == null) {
            synchronized (SingletonTest06.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
