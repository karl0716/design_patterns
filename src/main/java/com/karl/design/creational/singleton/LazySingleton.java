package com.karl.design.creational.singleton;

/**
 * 描述:  单例模式 - 懒汉式
 * 注意延迟加载
 * 线程不安全，
 *
 * @author mh
 * @create 2020-03-07 18:22
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton() {

    }

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
