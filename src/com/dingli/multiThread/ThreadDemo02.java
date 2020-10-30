package com.dingli.multiThread;

/**
 * 输出偶数
 *
 * @author 陈迪凯
 * @date 2020-10-30 16:47
 */
public class ThreadDemo02 implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 100; i+=2) {
            System.out.println("====偶数：" + i);
        }
    }
}
