package com.atguigu.factory.absfactory.pizzastore.order;

import com.atguigu.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.atguigu.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.atguigu.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/27 10:39
 */
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }

        return pizza;
    }
}
