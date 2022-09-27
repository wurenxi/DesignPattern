package com.atguigu.factory.absfactory.pizzastore.order;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/27 10:49
 */
public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza(new BJFactory());

        new OrderPizza(new LDFactory());
    }
}
