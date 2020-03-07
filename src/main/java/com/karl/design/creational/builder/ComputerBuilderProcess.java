package com.karl.design.creational.builder;

/**
 * 描述:  电脑正在的组装实现类
 *
 * @author mh
 * @create 2020-03-07 15:58
 */
public class ComputerBuilderProcess extends ComputerBuilder {

    private Computer computer = new Computer();

    @Override
    public void builderHost(String host) {
        computer.setHost(host);
    }

    @Override
    public void builderKeyboard(String keyboard) {
        computer.setKeyboard(keyboard);
    }

    @Override
    public void builderMonitor(String monitor) {
        computer.setMonitor(monitor);

    }

    @Override
    public void builderMouse(String mouse) {
        computer.setMouse(mouse);
    }

    @Override
    public Computer makeComputer() {
        return computer;
    }
}