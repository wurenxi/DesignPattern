package com.atguigu.factory.absfactory.pizzastore.pizza;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/27 9:59
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪pizza");
        System.out.println("伦敦的奶酪pizza 准备原材料");
    }
}
