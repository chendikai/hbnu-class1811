package com.dingli.exception;

import java.util.Date;

public class ClassCastExceptionDemo {
    public static void main(String[] args) {
        Object obj = new Date();
        ClassCastExceptionDemo classCastExceptionDemo = (ClassCastExceptionDemo)obj;
        System.out.println("=======");
        System.out.println(classCastExceptionDemo);
    }
}
