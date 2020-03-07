package com.karl.design.creational.factorymethod;

/**
 * 描述:  测试类
 *
 * @author mh
 * @create 2019-11-05 21:19
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        //工厂方法

        ComputerFactory computerFactory = new AppleComputerFoctory();
        Computer computer = computerFactory.getComputer();
        computer.produce();

        ComputerFactory computerFactory1 = new LenovoComputerFoctory();
        Computer computer1 = computerFactory1.getComputer();
        computer1.produce();

    }
}