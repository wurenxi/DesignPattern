package com.atguigu.adapter.objectadapter;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/30 8:15
 */
public class Phone {

    // 充电
    public void charging(IVoltage5V iVoltage5V) {
        if(iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V，可以充电~~~");
        }else if(iVoltage5V.output5V() > 5) {
            System.out.println("电压过高，无法充电");
        }
    }
}
