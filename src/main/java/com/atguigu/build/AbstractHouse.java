package com.atguigu.build;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/29 8:41
 */
public abstract class AbstractHouse {

    // 打地基
    public abstract void buildBasic();

    // 砌墙
    public abstract void buildWalls();

    // 封顶
    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
