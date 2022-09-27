package com.atguigu.factory.factorymethod.pizzastore.pizza;

/**
 * @author gxl
 * @description 抽象类 Pizza
 * @createDate 2022/9/27 8:33
 */
public abstract class Pizza {

    // 聚合
    protected String name;

    /**
     * 不同的披萨原材料不一样，做成抽象方法
     */
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
