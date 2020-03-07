package com.karl.design.creational.abstractfactory;

/**
 * 描述:  联想显示器实现
 *
 * @author mh
 * @create 2020-03-07 14:43
 */
public class LenovoMonitor implements Monitor{

    public void produce() {
        System.out.println("联想显示器");
    }
}