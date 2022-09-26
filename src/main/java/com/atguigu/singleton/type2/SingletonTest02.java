package com.atguigu.singleton.type2;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/26 9:52
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

// 饿汉式（静态变量）
class Singleton {

    // 1.构造器私有化
    private Singleton() {}

    static {
        instance = new Singleton();
    }

    // 2.在本类内部创建一个对象实例
    private static final Singleton instance;

    // 3.对外提供公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
