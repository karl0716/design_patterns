package com.karl.design.creational.builder;

/**
 * 描述:  计算器建造抽象类
 *
 * @author mh
 * @create 2020-03-07 15:53
 */
public abstract class ComputerBuilder {

    public abstract void builderHost(String host);

    public abstract void builderKeyboard(String keyboard);

    public abstract void builderMonitor(String monitor);

    public abstract void builderMouse(String mouse);

    public abstract Computer makeComputer();
}