package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，标识某方法需要实现公共字段的自动填充
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    // 定义枚举，表示需要自动填充的属性:数据库操作类型 UPDATE INSERT
    OperationType value();  //OperationType是枚举类型，一般包含插入修改删除
                            // value()是个特权名字，代表这个属性可以省略名字直接写
}
