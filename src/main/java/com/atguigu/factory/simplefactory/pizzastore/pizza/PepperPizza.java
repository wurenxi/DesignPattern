package com.atguigu.factory.simplefactory.pizzastore.pizza;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/27 9:01
 */
public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给胡椒披萨准备原材料");
    }
}
