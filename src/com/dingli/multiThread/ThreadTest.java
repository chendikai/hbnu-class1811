package com.dingli.multiThread;

/**
 * 测试线程
 *
 * @author 陈迪凯
 * @date 2020-10-28 9:19
 */
public class ThreadTest {
    public static void main(String[] args) {

        /*
        // 线程实现方式一：继承Thread类
        MyThread myThread = new MyThread(); // 创建线程对象
        myThread.start(); // 启动线程
        */

        // 线程实现方式二：实现Runnable接口
        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable).start();

        for (int i = 0; i < 200; i++) {
            System.out.println("主线程执行：" + i);

        }

    }
}
