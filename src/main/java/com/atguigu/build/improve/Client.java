package com.atguigu.build.improve;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/29 9:25
 */
public class Client {
    public static void main(String[] args) {
        // 盖普通房
        CommonHouse commonHouse = new CommonHouse();
        // 准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);

        // 完成盖房子，返回产品（普通房子）
        House house = houseDirector.constructHouse();

        // 盖高楼
        // 重置建造者
        houseDirector.setHouseBuilder(new HighBuilding());
        // 完成盖房子，返回产品（高楼）
        houseDirector.constructHouse();
    }
}
