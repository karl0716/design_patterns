package com.karl.design.creational.abstractfactory;

/**
 * 描述:  测试类
 *
 * @author mh
 * @create 2020-03-07 14:52
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        CourseFactory appleCourseFactory = new AppleCourseFactory();
        Computer appleComputer = appleCourseFactory.getComputer();
        Monitor appleMonitor = appleCourseFactory.getMonitor();
        appleComputer.produce();
        appleMonitor.produce();

        CourseFactory lenovoCourseFactory = new LenovoCourseFactory();
        Computer lenovoComputer = lenovoCourseFactory.getComputer();
        Monitor lenovoMonitor = lenovoCourseFactory.getMonitor();
        lenovoComputer.produce();
        lenovoMonitor.produce();
    }
}