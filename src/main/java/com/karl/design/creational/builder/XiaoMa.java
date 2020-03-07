package com.karl.design.creational.builder;

/**
 * 描述:  小马 - 负责组装电脑的技术人员
 *
 * @author mh
 * @create 2020-03-07 16:02
 */
public class XiaoMa {
    private ComputerBuilder computerBuilder;

    public XiaoMa(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer makeComputer(String host, String keyboard, String monitor, String mouse) {
        System.out.println("开始组装电脑: "+"host = [" + host + "], keyboard = [" + keyboard + "], monitor = [" + monitor + "], mouse = [" + mouse + "]");
        computerBuilder.builderHost(host);
        computerBuilder.builderKeyboard(keyboard);
        computerBuilder.builderMonitor(monitor);
        computerBuilder.builderMouse(mouse);
        return computerBuilder.makeComputer();
    }
}