package com.dingli.edu;

public class Demo1 {
    public static void main(String[] args) {
        int a = 10;
        int c = change(a);
        System.out.println("a:" + a);
        System.out.println("c:" + c);
    }

    public static int change(int b) {
        b *= 2;
        System.out.println("b:" + b);
        return b;
    }
}
