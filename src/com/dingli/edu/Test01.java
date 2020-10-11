package com.dingli.edu;

public class Test01 {
    static int id = 12;

    public static void changeId(int id) {
        id *= 2;
        System.out.println(id);
    }

    public static void main(String[] args) {
        Test01 test011 = new Test01();
        Test01 test012 = new Test01();

        test012.id = 20;

        System.out.println(test011.id);

        System.out.println(test012.id);
    }
}
