package com.dingli.summary;

public abstract class Person {
    private String name; // 姓名
    private int age; // 年龄

    public abstract void eat();

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}
