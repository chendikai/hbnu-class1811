package com.dingli.multiThread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 陈迪凯
 * @date 2020-10-30 17:32
 */
public class Ticket implements Runnable {

    private int ticket = 10; // 共享资源

    private final ReentrantLock lock = new ReentrantLock(); // 创建锁对象

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.lock(); // 获取锁
            // 操作了共享资源的代码
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "卖出了" + ticket + "号票");
                ticket--;
            } else {
                break;
            }
            lock.unlock(); // 释放锁
        }
    }
}
