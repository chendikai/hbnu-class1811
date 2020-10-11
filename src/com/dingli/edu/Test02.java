package com.dingli.edu;

public class Test02 {

    public static void main(String[] args) {
        String s1, s2, s3 = "abc", s4 = "abc";

        s1 = new String("abc");
        s2 = new String("abc");

        System.out.println("s1==s2: " + (s1 == s2)); // false
        System.out.println("s1==s3: " + (s1 == s3)); // false
        System.out.println("s3==s4: " + (s3 == s4)); // true

        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
        System.out.println("s1.equals(s3): " + s1.equals(s3)); //
        System.out.println("s3.equals(s4): " + s3.equals(s4)); // true
    }
}
