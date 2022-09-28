package com.atguigu.prototype.deepclone;

import lombok.*;

import java.io.Serializable;

/**
 * @author gxl
 * @description 该类的属性，都是String，使用默认的clone完成即可
 * @createDate 2022/9/28 10:05
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
public class DeepCloneableTarget implements Serializable, Cloneable {

    private String cloneName;

    private String cloneClass;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
