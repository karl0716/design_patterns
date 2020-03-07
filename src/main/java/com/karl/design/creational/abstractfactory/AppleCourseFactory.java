package com.karl.design.creational.abstractfactory;

/**
 * 描述:  苹果产品工厂
 *
 * @author mh
 * @create 2020-03-07 14:39
 */
public class AppleCourseFactory extends CourseFactory{

    @Override
    Computer getComputer() {
        return new AppleComputer();
    }

    @Override
    Monitor getMonitor() {
        return new AppleMonitor();
    }
}