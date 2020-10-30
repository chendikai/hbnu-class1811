package com.dingli.multiThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

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

        /*
        // 线程实现方式二：实现Runnable接口
        MyRunnable myRunnable = new MyRunnable(); // 创建线程对象
        new Thread(myRunnable).start(); // 启动线程
        */

        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("子线程执行：" + i);
            }
        }).start();

        /*
        // 线程实现方式三：实现Callable接口
        MyCallable myCallable = new MyCallable(); // 创建线程对象
        FutureTask<String> stringFutureTask = new FutureTask<>(myCallable);
        Thread thread = new Thread(stringFutureTask);
        thread.start(); // 启动线程

        try {
            String str = stringFutureTask.get();
            System.out.println("实现Callable接口的返回值" + str);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        */

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程执行：" + i);

        }
    }
}
