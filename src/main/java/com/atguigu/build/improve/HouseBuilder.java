package com.atguigu.build.improve;

/**
 * @author gxl
 * @description 抽象的建造者
 * @createDate 2022/9/29 9:11
 */
public abstract class HouseBuilder {

    protected House house = new House();

    // 将建造的流程写好，抽象的方法
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    // 建造房子好后，将产品（房子）返回
    public House buildHouse() {
        return house;
    }
}
