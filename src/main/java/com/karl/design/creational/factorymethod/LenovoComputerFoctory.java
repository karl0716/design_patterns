package com.karl.design.creational.factorymethod;

/**
 * 描述:  联想电脑的工厂类
 *
 * @author mh
 * @create 2020-03-07 11:58
 */
public class LenovoComputerFoctory extends ComputerFactory{
    @Override
    Computer getComputer() {
        return new LenovoComputer();
    }
}