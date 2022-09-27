package com.atguigu.factory.simplefactory.pizzastore.pizza;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/27 8:38
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(" 给希腊披萨 准备原材料");
    }
}
