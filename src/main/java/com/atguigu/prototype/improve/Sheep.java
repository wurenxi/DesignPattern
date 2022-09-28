package com.atguigu.prototype.improve;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/28 9:10
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Sheep implements Cloneable {

    private String name;

    private int age;

    private String color;

    private String address = "蒙古羊";

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    /**
     * 克隆该实例，使用默认的clone方法来完成
     * @return
     */
    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        return sheep;
    }
}
