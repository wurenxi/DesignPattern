package com.atguigu.principle.liskov;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/25 12:36
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));

        System.out.println("------------------------");
        B b = new B();
        System.out.println("11-3=" + b.func1(11, 3)); // 这里本意是求出11-3
        System.out.println("1-8=" + b.func1(1, 8)); // 1-8
        System.out.println("11+3+9=" + b.func2(11, 3));
    }
}

/**
 * A类
 */
class A {
    /**
     * 返回两个数的差
     * @param num1
     * @param num2
     * @return
     */
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class B extends A{
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}
