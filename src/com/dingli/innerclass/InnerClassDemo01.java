package com.dingli.innerclass;

import java.security.PublicKey;

public class InnerClassDemo01 {
    private String name = "1811";

    public class InnerClass {
        String role = "Inner......";
        public void innerMethod () {
            System.out.println("内部类访问外部类属性：" + name);
        }
    }

    {
        // 代码块
        class Inner {

        }
    }



    public static void main(String[] args) {
        InnerClassDemo01 innerClassDemo01 = new InnerClassDemo01();
        InnerClass innerClass = innerClassDemo01.new InnerClass();
        System.out.println(innerClass.role);
        innerClass.innerMethod();
    }
}
