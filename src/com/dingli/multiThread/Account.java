package com.dingli.multiThread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 陈迪凯
 * @date 2020-11-02 10:31
 */
public class Account implements Runnable {
    private double money; // 共享资源

    private final ReentrantLock lock = new ReentrantLock(); // 创建锁对象

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep((int) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            /*
            synchronized (this) {
                money += 1000;
                System.out.println(Thread.currentThread().getName() + "存入1000元，\n当前余额" + money);
            }
            */

            lock.lock(); // 加锁
            money += 1000;
            System.out.println(Thread.currentThread().getName() + "存入1000元，\n当前余额" + money);
            lock.unlock(); // 开锁
        }
    }
}
