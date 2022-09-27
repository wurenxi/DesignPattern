package com.atguigu.factory.factorymethod.pizzastore.pizza;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/27 9:59
 */
public class BJPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京胡椒pizza");
        System.out.println("北京的胡椒pizza 准备原材料");
    }
}
