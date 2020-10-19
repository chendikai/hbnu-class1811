package com.dingli.annotation;

@MyAnnotation(name = "hbnu", colleage = {"湖北师范大学","湖北理工大学"})
public class AnnotationTest {
    private String name;

    @SuppressWarnings("uncheked")
    public static void main(String[] args) {
        test1();
    }

    @Deprecated
    public static void test1() {
        System.out.println("Deprecated。。。。。。");
    }

    @MyAnnotation(name = "hbnu", colleage = {"湖北师范大学","湖北理工大学"})
    public static void test2() {

    }

    @Override
    public String toString() {
        return "AnnotationTest{" +
                "name='" + name + '\'' +
                '}';
    }
}
