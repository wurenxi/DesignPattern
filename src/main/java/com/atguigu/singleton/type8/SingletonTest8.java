package com.atguigu.singleton.type8;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/26 11:12
 */
public class SingletonTest8 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

// 使用枚举，可以实现单例，推荐使用
enum Singleton {
    INSTANCE; // 属性

    public void sayOk() {
        System.out.println("ok");
    }
}
