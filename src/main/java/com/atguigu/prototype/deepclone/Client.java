package com.atguigu.prototype.deepclone;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/28 10:15
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p = new DeepProtoType("宋江", new DeepCloneableTarget("大牛", "大牛类"));

        // 方式1 完成深拷贝
//        DeepProtoType p2 = (DeepProtoType) p.clone();
//        System.out.println("p.name = " + p.getName() + " p.deepCloneableTarget.hashcode = " + p.getDeepCloneableTarget().hashCode());
//        System.out.println("p2.name = " + p2.getName() + " p2.deepCloneableTarget.hashcode = " + p2.getDeepCloneableTarget().hashCode());

        // 方式2 完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p.deepClone();
        System.out.println("p.name = " + p.getName() + " p.deepCloneableTarget.hashcode = " + p.getDeepCloneableTarget().hashCode());
        System.out.println("p2.name = " + p2.getName() + " p2.deepCloneableTarget.hashcode = " + p2.getDeepCloneableTarget().hashCode());
    }
}
