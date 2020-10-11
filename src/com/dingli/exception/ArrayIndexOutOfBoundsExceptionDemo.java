package com.dingli.exception;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        String[] arr = {"houyi", "daji", "luban"};
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
    }
}
