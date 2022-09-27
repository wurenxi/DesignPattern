package com.atguigu.factory.simplefactory.pizzastore.order;

import com.atguigu.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/27 8:40
 */
public class OrderPizza {

    // 构造器
//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType; // 订购披萨的类型
//
//        do {
//            orderType = gettype();
//            if(orderType.equals("greek")) {
//                pizza = new GreekPizza();
//                pizza.setName("希腊披萨");
//            }else if(orderType.equals("cheese")) {
//                pizza = new CheesePizza();
//                pizza.setName("奶酪披萨");
//            }else if(orderType.equals("pepper")) {
//                pizza = new PepperPizza();
//                pizza.setName("胡椒披萨");
//            }else {
//                break;
//            }
//            // 输出pizza制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while (true);
//    }

    // 定义一个简单工厂对象
    SimpleFactory simpleFactory;

    Pizza pizza;

    // 构造器
    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType = ""; // 用户输入的
        this.simpleFactory = simpleFactory; // 设置简单工厂对象

        do {
            orderType = gettype();
            pizza = simpleFactory.createPizza(orderType);
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
