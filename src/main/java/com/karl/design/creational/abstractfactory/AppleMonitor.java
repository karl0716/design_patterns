package com.karl.design.creational.abstractfactory;

/**
 * 描述:  苹果显示器的具体实现
 *
 * @author mh
 * @create 2020-03-07 14:41
 */
public class AppleMonitor implements Monitor {

    public void produce() {
        System.out.println("苹果显示器");
    }
}