package com.karl.design.creational.simplefactory;

/**
 * 描述:  工厂类
 *
 * @author mh
 * @create 2019-11-05 21:24
 */
public class ComputerFactory {

    public Computer getComputer(String name){
        if("apple".equalsIgnoreCase(name)){
            return new AppleComputer();
        } else if("lenovo".equalsIgnoreCase(name)){
            return new LenovoComputer();
        }else {
            return null;
        }
    }
}