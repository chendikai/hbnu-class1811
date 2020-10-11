package com.dingli.exception;

public class Test {
    public static void main(String[] args) {
        int i = -1;
        if (i < 0) {
            try {
                throw new DefineException("i的值不能小于0");
            } catch (DefineException e) {
                e.printStackTrace();
            }
        }

    }
}
