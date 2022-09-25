package com.atguigu.principle.ocp.improve;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/25 13:36
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();

        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraph());
    }
}

/**
 * [使用方]
 */
class GraphicEditor {
    // 接收Shape对象，然后根据type，来绘制不同的图形
    public void drawShape(Shape s) {
        s.draw();
    }
}

/**
 * Shape类，基类
 */
abstract class Shape {
    int m_type;

    public abstract void draw(); // 抽象方法
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

// 新增绘制三角形
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}

// 新增一个图像
class OtherGraph extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制其他图形");
    }
}