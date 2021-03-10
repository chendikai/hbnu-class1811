package com.hbnu.pojo;

/**
 * @author 陈迪凯
 * @date 2021-03-09 8:37
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setUsername("chendikai").setGender("男").setPassword("123456").setEmail("chendikai1314@163.com");
        System.out.println(person);
    }
}
