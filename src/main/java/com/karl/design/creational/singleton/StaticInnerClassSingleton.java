package com.karl.design.creational.singleton;


/**
 * 描述:  静态内部类
 *
 * @author mh
 * @create 2020-03-08 13:04
 */
public class StaticInnerClassSingleton {


    private StaticInnerClassSingleton() {

    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }

    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();

    }
}