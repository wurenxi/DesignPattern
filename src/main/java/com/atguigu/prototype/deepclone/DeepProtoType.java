package com.atguigu.prototype.deepclone;

import lombok.*;

import java.io.*;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/28 10:08
 */
@NoArgsConstructor
@AllArgsConstructor
// @Data注解会重写hashcode，导致深拷贝后的两个对象的引用类型对象hash值相同
@Setter @Getter
public class DeepProtoType implements Serializable, Cloneable {

    private String name;

    private DeepCloneableTarget deepCloneableTarget;

    /**
     * 深拷贝 - 方式1 使用clone方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 1.完成对基本数据和String的克隆
        deep = super.clone();
        // 2.对引用类型的属性，进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.setDeepCloneableTarget((DeepCloneableTarget) deepCloneableTarget.clone());

        return deepProtoType;
    }

    /**
     * 深拷贝 - 方式2 通过对象的序列化实现（推荐）
     */
    public Object deepClone() {
        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);

            oos.writeObject(this); // 当前这个对象以对象流的方式输出

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return ois.readObject();
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            // 关闭流
            try {
                if(ois != null)
                    ois.close();
                if(bis != null)
                    bis.close();
                if(oos != null)
                    oos.close();
                if(bos != null)
                    bos.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
