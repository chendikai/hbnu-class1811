package com.dingli.innerclass;

public class Demo {

    private String name = "外部类属性......";

    public void outerMethod() {
        System.out.println("外部类方法......");
    }

    public void method() {
        System.out.println("====================");
    }

    class Inner {
        private String innerName = "内部类属性......";
        private String name = "与外部类重名的内部类属性......";

        public void innerMethod() {
            System.out.println(name); // 内部类属性
            System.out.println(Demo.this.name); //外部类属性
            System.out.println(innerName);

            outerMethod();
            method();
            Demo.this.method();

        }

        public void method() {
            System.out.println("********************");
        }

        public void innerMethod1() {
            System.out.println("内部类方法......");
        }
    }
}
