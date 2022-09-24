package com.atguigu.principle.singleresponsibility;

/**
 * @author gxl
 * @description 方案2的分析
 * 1.遵守了单一职责原则
 * 2.但是这样做，改动很大，即要将类分解，同时修改客户端
 * 3.改进，直接修改Vehicle类，改动的代码会比较的少 => 方案3
 * @createDate 2022/9/24 9:13
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle rVehicle = new RoadVehicle();
        rVehicle.run("摩托车");
        rVehicle.run("汽车");

        AirVehicle aVehicle = new AirVehicle();
        aVehicle.run("飞机");
    }
}

class RoadVehicle {
    public void run (String vehicle) {
        System.out.println(vehicle + "公路运行");
    }
}

class AirVehicle {
    public void run (String vehicle) {
        System.out.println(vehicle + "天空运行");
    }
}

class WaterVehicle {
    public void run (String vehicle) {
        System.out.println(vehicle + "水中运行");
    }
}
