package com.karl.design.creational.factorymethod;

/**
 * 描述:  联想电脑
 *
 * @author mh
 * @create 2019-11-05 21:18
 */
public class LenovoComputer implements Computer {

    public void produce() {
        System.out.println("联想电脑");
    }
}