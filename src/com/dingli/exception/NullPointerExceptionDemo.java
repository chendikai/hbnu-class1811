package com.dingli.exception;

public class NullPointerExceptionDemo {
    private int i = 9;
    public static void main(String[] args) {
        NullPointerExceptionDemo nullPointerExceptionDemo = new NullPointerExceptionDemo();
        nullPointerExceptionDemo = null;
        System.out.println(nullPointerExceptionDemo.i);
    }
}
