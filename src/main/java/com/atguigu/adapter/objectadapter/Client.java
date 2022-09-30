package com.atguigu.adapter.objectadapter;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/30 8:17
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("==== 对象适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
