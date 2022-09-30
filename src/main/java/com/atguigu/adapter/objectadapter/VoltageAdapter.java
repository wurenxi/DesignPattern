package com.atguigu.adapter.objectadapter;

/**
 * @author gxl
 * @description 适配器类
 * @createDate 2022/9/30 8:12
 */
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V; // 聚合

    /**
     * 通过构造器，传入一个 Voltage220V 实例
     * @param voltage220V
     */
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        // 获取到220V电压
        int destV = 0;
        if(null != voltage220V) {
            int srcV = voltage220V.output220V();
            System.out.println("使用对象适配器，进行适配");
            destV = srcV / 44; // 转成5V
            System.out.println("适配完成，输出的电压为 = " + destV);
        }
        return destV;
    }
}
