package com.karl.design.creational.builder.v2;

import com.karl.design.creational.builder.ComputerBuilder;

/**
 * 描述:  升级版的计算机
 *
 * @author mh
 * @create 2020-03-07 16:54
 */
public class Computer {

    private String host;
    private String keyboard;
    private String monitor;
    private String mouse;


    public Computer(ComputerBuilder ComputerBuilder) {
        this.host = ComputerBuilder.host;
        this.keyboard = ComputerBuilder.keyboard;
        this.monitor = ComputerBuilder.monitor;
        this.mouse = ComputerBuilder.mouse;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "host='" + host + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", monitor='" + monitor + '\'' +
                ", mouse='" + mouse + '\'' +
                '}';
    }


    /**
     * 匿名内容类 负责构建计算器
     */
    public static class ComputerBuilder {
        private String host;
        private String keyboard;
        private String monitor;
        private String mouse;

        /**
         *  返回也是 ComputerBuilder 可以链式调用
         */
        public ComputerBuilder builderHost(String host) {
            this.host = host;
            return this;
        }

        public ComputerBuilder builderKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public ComputerBuilder builderMonitor(String monitor) {
            this.monitor = monitor;
            return this;
        }

        public ComputerBuilder builderMouse(String mouse) {
            this.mouse = mouse;
            return this;
        }

        /**
         *  组装
         */
        public Computer build() {
            return new Computer(this);
        }


    }

}