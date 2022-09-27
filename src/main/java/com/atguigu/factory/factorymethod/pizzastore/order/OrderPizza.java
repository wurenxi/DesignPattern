package com.atguigu.factory.factorymethod.pizzastore.order;

import com.atguigu.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/27 8:40
 */
public abstract class OrderPizza {

    // 构造器
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = gettype();
            pizza = createPizza(orderType); // 抽象方法，由工厂子类完成
            if(pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                break;
            }
        }while (true);
    }

    // 定义一个抽象方法，createPizza，让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    // 写一个方法，可以获取客户希望订单的披萨种类
    public String gettype() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type: ");
            return strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
