package com.atguigu.factory.factorymethod.pizzastore.pizza;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/27 9:59
 */
public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦胡椒pizza");
        System.out.println("伦敦的胡椒pizza 准备原材料");
    }
}
