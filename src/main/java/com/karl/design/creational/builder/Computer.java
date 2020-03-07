package com.karl.design.creational.builder;

/**
 * 描述:  计算机的基本组成
 *
 * @author
 * @create 2020-03-07 15:49
 */
public class Computer {
    // 主机 显示器 键盘 鼠标
    private String host;
    private String keyboard;
    private String monitor;
    private String mouse;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        host = host;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
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
}