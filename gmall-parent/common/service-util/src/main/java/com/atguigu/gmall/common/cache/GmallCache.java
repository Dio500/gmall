package com.atguigu.gmall.common.cache;


import java.lang.annotation.*;


@Target(ElementType.METHOD)//作用范围：方法
@Retention(RetentionPolicy.RUNTIME)// 注解会在class字节码文件中存在，在运行时可以通过反射获取到
@Documented//标记注解
public @interface GmallCache {
    String prefix() default "cache";
}

/**
 * @Target、@Retention、@Documented、@Inherited  Java四大元注解
 * @Target 描述注解的使用范围
 *      TYPE ： 类型上面 用于描述类、接口(包括注解类型) 或enum声明
 *      FIELD： 用于描述字段
 *      METHOD ：方法
 *      PARAMETER： 参数 【参数名】
 *      CONSTRUCTOR ： 构造方法
 *      LOCAL_VARIABLE： 局部变量
 *      ANNOTATION_TYPE ： 可以打在注解上面
 *      PACKAGE ：可以打在包上面
 *      TYPE_PARAMETER： 参数类型【形式参数类型】
 *      TYPE_USE ： 任何位置都可以
 *
 * @Retention 用于描述一个注解存在的生命周期，主要包括源码，字节码文件，运行时
 *      RetentionPolicy.SOURCE：注解只保留在源文件，当Java文件编译成class文件的时候，注解被遗弃；
 *      RetentionPolicy.CLASS：注解被保留到class文件，但jvm加载class文件时候被遗弃【默认】
 *      RetentionPolicy.RUNTIME：注解不仅被保存到class文件中，jvm加载class文件之后，仍然存在,
 *          所以他们能在运行时被JVM或其他使用反射机制的代码所读取和使用
 *
 * @Documented：表示该注解是否可以生成到 API文档中。注意：@Documented是一个标记注解，没有成员。
 *
 * @Inherited  注解可以被继承
 */