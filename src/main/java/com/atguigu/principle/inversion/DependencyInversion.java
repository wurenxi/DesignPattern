package com.atguigu.principle.inversion;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/25 10:50
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息：hello, world";
    }
}

/**
 * 完成Person接收消息的功能
 * 方式1分析
 * 1.简单，比较容易想到
 * 2.如果获取的对象是 微信，短信等，则新增类，同时Person也要增加相应的接收方法
 * 3.解决思路：引入一个抽象的接口IReceiver，表示接收者，这样Person类与接口Receiver发生依赖
 *  因为Email，WeiXin等等属于接收的范围，它们各自实现IReceiver接口，这样符合依赖倒转原则
 */
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
