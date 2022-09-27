package com.atguigu.factory.absfactory.pizzastore.pizza;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/27 9:59
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪pizza");
        System.out.println("北京的奶酪pizza 准备原材料");
    }
}
