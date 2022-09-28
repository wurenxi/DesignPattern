package com.atguigu.prototype.improve;


/**
 * @author gxl
 * @description
 * @createDate 2022/9/28 9:41
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("原型模式完成对象的创建");
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.setFriend(new Sheep("jack", 2, "黑色"));
        Sheep sheep2 = (Sheep)sheep.clone();
        Sheep sheep3 = (Sheep)sheep.clone();
        Sheep sheep4 = (Sheep)sheep.clone();
        Sheep sheep5 = (Sheep)sheep.clone();

//        System.out.println("sheep1 = " + sheep);
        System.out.println("sheep2 = " + sheep2 + "sheep2.friend=" + sheep2.getFriend().hashCode());
        System.out.println("sheep3 = " + sheep3 + "sheep3.friend=" + sheep3.getFriend().hashCode());
        System.out.println("sheep4 = " + sheep4 + "sheep4.friend=" + sheep4.getFriend().hashCode());
        System.out.println("sheep5 = " + sheep5 + "sheep5.friend=" + sheep5.getFriend().hashCode());
    }
}
