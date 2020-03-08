package com.karl.design.creational.singleton;

/**
 * 描述:  饿汉
 *
 * @author mh
 * @create 2020-03-08 13:25
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}