package com.atguigu.factory.simplefactory.pizzastore.pizza;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/27 8:37
 */
public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(" 给制作奶酪披萨 准备原材料");
    }
}
