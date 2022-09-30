package com.atguigu.adapter.objectadapter;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/30 8:10
 */
public class Voltage220V {

    /**
     * 输出220V电压，不变
     * @return
     */
    public int output220V() {
        int src = 220;
        System.out.println("电压 = " + src + "伏");
        return src;
    }
}
