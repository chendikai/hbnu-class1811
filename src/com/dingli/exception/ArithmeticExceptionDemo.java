package com.dingli.exception;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            divide(4, 0);
        } catch (ArithmeticException e) {
            System.out.println("=========");
        }
    }

    public static void divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("不能被0整除");
        }
        int result = x / y;
        System.out.println(result);
    }
}
