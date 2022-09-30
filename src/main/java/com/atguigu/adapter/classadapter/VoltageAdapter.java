package com.atguigu.adapter.classadapter;

/**
 * @author gxl
 * @description 适配器类
 * @createDate 2022/9/30 8:12
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{

    @Override
    public int output5V() {
        // 获取到220V电压
        int srcV = super.output220V();
        int destV = srcV / 44; // 转成5V
        return destV;
    }
}
