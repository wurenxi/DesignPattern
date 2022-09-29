package com.atguigu.build;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/29 8:43
 */
public class CommonHouse extends AbstractHouse{

    @Override
    public void buildBasic() {
        System.out.println(" 普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println(" 普通房子封顶");
    }
}
