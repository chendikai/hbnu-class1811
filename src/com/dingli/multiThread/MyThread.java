package com.dingli.multiThread;

/**
 * 多线程实现方式一：继承Thread类
 *
 * @author 陈迪凯
 * @date 2020-10-28 9:17
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程开始执行" + i);
        }
    }
}
