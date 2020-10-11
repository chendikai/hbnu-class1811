package com.dingli.summary;

public class Student extends Person implements Language, Basketball {
    public void study() {
        System.out.println("学生学习......");
    }
    @Override
    public void speakEnglish() {
        System.out.println("学生说英语......");
    }
    public void eat() {
        System.out.println("学生吃东西......");
    }


    @Override
    public void playBasketball() {
        System.out.println("学生打篮球......");
    }
}
