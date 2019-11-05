package com.karl.design.creational.simplefactory;

/**
 * 描述:  测试类
 *
 * @author mh
 * @create 2019-11-05 21:19
 */
public class SimplefactoryTest {
    public static void main(String[] args) {
//        //原始的获取对象
//        Computer computer = new AppleComputer();
//        computer.produce();  //苹果电脑
//        Computer computer1 = new LenovoComputer();
//        computer1.produce(); // 联想电脑

        //用简单工厂的方式创建对象
        ComputerFactory computerFactory = new ComputerFactory();
        Computer computer = computerFactory.getComputer("apple");
        computer.produce(); //苹果电脑
        Computer computer1 = computerFactory.getComputer("lenovo");
        computer1.produce();// 联想电脑
    }
}