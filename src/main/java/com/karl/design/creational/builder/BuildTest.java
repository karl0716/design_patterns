package com.karl.design.creational.builder;

/**
 * 描述:  测试类
 *
 * @author mh
 * @create 2020-03-07 16:18
 */
public class BuildTest {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilderProcess();
        XiaoMa xiaoMa = new XiaoMa(computerBuilder);
        xiaoMa.makeComputer("联想主机", "海盗船键盘", "三星显示器", "小米鼠标");
    }

}