package com.dingli.multiThread;

/**
 * 输出奇数
 *
 * @author 陈迪凯
 * @date 2020-10-30 16:45
 */
public class ThreadDemo01 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 1; i < 100; i+=2) {
            System.out.println(Thread.currentThread().getName() + ">>>奇数：" + i);
        }
    }
}
