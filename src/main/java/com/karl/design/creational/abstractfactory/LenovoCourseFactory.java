package com.karl.design.creational.abstractfactory;

/**
 * 描述:  联想的产品工厂
 *
 * @author mh
 * @create 2020-03-07 14:45
 */
public class LenovoCourseFactory extends CourseFactory{

    @Override
    Computer getComputer() {
        return new LenovoComputer();
    }

    @Override
    Monitor getMonitor() {
        return new LenovoMonitor();
    }
}