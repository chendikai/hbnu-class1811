package com.dingli.edu;

public class Test {

    private String name;
    private int id;

    public Test() {
        this("亚瑟", 01);
        System.out.println("====");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Test(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void test() {
        int id = 10;
        System.out.println("id" + this.id);
    }
}

