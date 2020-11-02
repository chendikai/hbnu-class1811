package com.dingli.multiThread;

/**
 * @author 陈迪凯
 * @date 2020-11-02 11:08
 */
public class Productor implements Runnable {
    private Product product;

    public Productor(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((int)Math.random()*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        product.addProduct();
    }
}
