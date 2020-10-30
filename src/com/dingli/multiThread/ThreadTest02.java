package com.dingli.multiThread;

/**
 * @author 陈迪凯
 * @date 2020-10-30 16:48
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        ThreadDemo01 threadDemo01 = new ThreadDemo01(); // 创建线程对象
        ThreadDemo02 threadDemo02 = new ThreadDemo02(); // 创建线程对象

        threadDemo01.start(); // 启动线程
        new Thread(threadDemo02).start(); // 启动线程

        threadDemo01.setName("自定义线程名");
        System.out.println(threadDemo01.getName());

        System.out.println(threadDemo01.isAlive());
    }
}
