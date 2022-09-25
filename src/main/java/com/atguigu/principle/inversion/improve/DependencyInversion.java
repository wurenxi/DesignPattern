package com.atguigu.principle.inversion.improve;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/25 10:50
 */
public class DependencyInversion {
    public static void main(String[] args) {
        // 客户端无需改变
        Person person = new Person();
        person.receive(new Email());

        person.receive(new WeChat());
    }
}

interface IReceiver {
    String getInfo();
}

class Email implements IReceiver{
    public String getInfo() {
        return "电子邮件信息：hello, world";
    }
}

/**
 * 新增微信
 */
class WeChat implements IReceiver {

    @Override
    public String getInfo() {
        return "微信消息：hello, ok";
    }
}

/**
 * 完成Person接收消息的功能
 * 方式2分析
 */
class Person {

//    private IReceiver receiver;

    public Person() {
    }

    /**
     * 方式2：通过构造方法传递依赖
     * @param receiver
     */
//    public Person(IReceiver receiver) {
//        this.receiver = receiver;
//    }
//
//    public void receive() {
//        System.out.println(receiver.getInfo());
//    }

    /**
     * 对接口的依赖，
     * 方式1：接口传递实现依赖
     * @param receiver
     */
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }

    /**
     * 方式3：通过setter方法传递
     * @param receiver
     */
//    public void setReceiver(IReceiver receiver) {
//        this.receiver = receiver;
//    }
//
//    public void receive() {
//        System.out.println(receiver.getInfo());
//    }
}
