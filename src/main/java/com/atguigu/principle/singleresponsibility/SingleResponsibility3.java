package com.atguigu.principle.singleresponsibility;

/**
 * @author gxl
 * @description 方式3的分析
 * 1.这种修改方法没有对原来的类做大的修改，只是增加方法
 * 2.虽然没有在类级别上遵守单一职责原则，但在方法级别上，仍然是遵守单一职责
 * 3.前提，类中方法非常的少，否则应该拆分 类
 * @createDate 2022/9/24 9:17
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();

        vehicle2.run("汽车");
        vehicle2.runWater("潜艇");
        vehicle2.runAir("飞机");
    }
}

class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行...");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空运行...");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水中运行...");
    }
}
