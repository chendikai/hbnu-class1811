package com.dingli.multiThread;

/**
 * @author 陈迪凯
 * @date 2020-11-02 11:13
 */
public class ProAndConTest {
    public static void main(String[] args) {
        Product product = new Product();

        new Thread(new Productor(product)).start(); // 启动生产者线程
        new Thread(new Consumer(product)).start(); // 启动消费者线程
    }
}
