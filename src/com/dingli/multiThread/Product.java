package com.dingli.multiThread;

/**
 * @author 陈迪凯
 * @date 2020-11-02 11:03
 */
public class Product {

    private int products; // 共享数据

    public synchronized void addProduct() {
        while (true) {
            if (products >= 20) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                products++;
                System.out.println("生产者生产产品：" + products);
                notifyAll();
            }
        }
    }

    public synchronized void getProduct() {
        while (true) {
            if (products <= 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("消费者消费产品：" + products);
                products--;
                notifyAll();
            }
        }
    }
}
