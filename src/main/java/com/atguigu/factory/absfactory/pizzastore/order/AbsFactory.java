package com.atguigu.factory.absfactory.pizzastore.order;

import com.atguigu.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * 抽象工厂模式的抽象层
 */
public interface AbsFactory {

    /**
     * 让下面的工厂子类来具体的实现
     * @param orderType
     * @return
     */
    Pizza createPizza(String orderType);
}
