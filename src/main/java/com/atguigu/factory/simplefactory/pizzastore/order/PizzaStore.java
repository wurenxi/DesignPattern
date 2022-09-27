package com.atguigu.factory.simplefactory.pizzastore.order;

/**
 * @author gxl
 * @description 相当于一个客户端，发出订购
 * @createDate 2022/9/27 8:51
 */
public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza();

        // 使用简单工厂模式
//        new OrderPizza(new SimpleFactory());
//        System.out.println("退出程序");

        new OrderPizza2();
    }
}
