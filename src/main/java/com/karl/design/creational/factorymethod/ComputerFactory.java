package com.karl.design.creational.factorymethod;

/**
 * 描述:  工厂类
 *
 * @author mh
 * @create 2019-11-05 21:24
 */
public abstract class ComputerFactory {

    /**
     * 获取电脑的抽象方法
     * @return
     */
     abstract Computer getComputer();
}