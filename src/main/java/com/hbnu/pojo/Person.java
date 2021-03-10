package com.hbnu.pojo;

/**
 * @author 陈迪凯
 * @date 2021-03-09 8:29
 */
public class Person {
    private String username;
    private String password;
    private String gender;
    private String email;

    public Person setUsername(String username) {
        this.username = username;
        return this;
    }

    public Person setPassword(String password) {
        this.password = password;
        return this;
    }

    public Person setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Person setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
