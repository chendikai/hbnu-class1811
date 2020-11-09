package com.dingli.net;

import java.io.Serializable;

/**
 * @author 陈迪凯
 * @date 2020-11-09 10:55
 */
public class User implements Serializable {
    private static final long serialVersionUID = -2153591078168152155L;

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
