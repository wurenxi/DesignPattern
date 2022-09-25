package com.atguigu.principle.ocp;

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
    }
}

/**
 * [使用方]
 */
class GraphicEditor {
    // 接收Shape对象，然后根据type，来绘制不同的图形
    public void drawShape(Shape s) {
        if(s.m_type == 1)
            drawRectangle(s);
        else if(s.m_type == 2)
            drawCircle(s);
        else if(s.m_type == 3)
            drawTriangle(s);
    }

    public void drawRectangle(Shape r) {
        System.out.println("绘制矩形");
    }

    public void drawCircle(Shape r) {
        System.out.println("绘制圆形");
    }

    // 绘制三角形
    public void drawTriangle(Shape r) {
        System.out.println("绘制三角形");
    }
}

/**
 * Shape类，基类
 */
class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}

// 新增绘制三角形
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
}