package com.dingli.common;

public class Test {
    public static void main(String[] args) {
        Object houyi1 = new Houyi("后羿", 1);
        Object houyi2 = new Houyi("后羿", 1);
//        System.out.println(houyi1.equals(houyi2));

        String str = "nba cba";
        String str2 = "abCAbc ";
        System.out.println(str.length());
        System.out.println(str.indexOf('b'));
        System.out.println(str.lastIndexOf('b'));
        System.out.println(str.substring(2));
        System.out.println(str.trim());
        System.out.println(str.equals(str2)); // false
        System.out.println(str.equalsIgnoreCase(str2)); // true
        System.out.println(str.toUpperCase());

        // 字符串截取
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        byte[] bytes = str2.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
    }
}
