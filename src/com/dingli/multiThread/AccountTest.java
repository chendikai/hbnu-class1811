package com.dingli.multiThread;

/**
 * @author 陈迪凯
 * @date 2020-11-02 10:34
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();

        new Thread(account, "A储户").start();
        new Thread(account, "B储户").start();
    }
}
