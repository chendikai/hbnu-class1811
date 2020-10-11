package com.dingli.innerclass;

/**
 *  局部内部类
 */
public class Demo01 {
    private String name = "外部类属性";

    public void method() {
        System.out.println("==================");
    }

    public void method2() {
        int id = 2;
        class methodInner {
            String role = "局部内部类属性......";

            public void methodInnerTest() {
                System.out.println(name); // 外部类的属性
                System.out.println(role); // 内部类的属性
                System.out.println(id); // 内部类所在方法的局部变量

                innerMethod(); // 内部类方法
                method(); // 外部内方法

            }

            public void innerMethod() {
                System.out.println("内部类=====");
            }
        }
        methodInner methodInner = new methodInner();
        methodInner.methodInnerTest();
    }
}
