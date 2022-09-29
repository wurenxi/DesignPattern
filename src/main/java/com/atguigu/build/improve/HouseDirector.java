package com.atguigu.build.improve;

/**
 * @author gxl
 * @description 指挥者，这里去指定制作流程，返回产品
 * @createDate 2022/9/29 9:20
 */
public class HouseDirector {

    HouseBuilder houseBuilder;

    // 构造器传入
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 通过setter方法传入
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 如何处理建造房子的流程，交给指挥者
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();

        return houseBuilder.buildHouse();
    }
}
