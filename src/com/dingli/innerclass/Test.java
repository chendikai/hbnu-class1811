package com.dingli.innerclass;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Test {
    public static void main(String[] args) {
//        Demo demo = new Demo();
//        Demo.Inner inner = demo.new Inner(); // 创建内部类对象
//        inner.innerMethod();

//        Demo01 demo01 = new Demo01();
//        demo01.method2();

        new Test().callInner(new InterfaceTest() {
            @Override
            public void fighting() {
                System.out.println("==========");
            }
        });
    }

    public void callInner(InterfaceTest interfaceTest) {
        interfaceTest.fighting();
    }
}
