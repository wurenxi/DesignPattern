package com.atguigu.factory.simplefactory.pizzastore.order;

import com.atguigu.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/27 9:30
 */
public class OrderPizza2 {

    Pizza pizza;

    // 构造器
    public OrderPizza2() {
        String orderType = ""; // 用户输入的

        do {
            orderType = gettype();
            pizza = SimpleFactory.createPizza2(orderType);
            // 输出pizza
            if(pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购披萨失败");
                break;
            }
        }while (true);
    }

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
