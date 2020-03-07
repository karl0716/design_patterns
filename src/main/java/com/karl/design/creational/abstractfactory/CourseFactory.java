package com.karl.design.creational.abstractfactory;

/**
 * 描述:  产品族工厂
 *
 * @author mh
 * @create 2020-03-07 14:35
 */
public abstract class CourseFactory {

    /**
     * 获取电脑
     *
     * @return Computer
     */
    abstract Computer getComputer();

    /**
     * 获取显示器
     *
     * @return Monitor
     */
    abstract Monitor getMonitor();

}