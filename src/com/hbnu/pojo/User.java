package com.hbnu.pojo;

/**
 * @author 陈迪凯
 * @date 2021-03-02 16:28
 */
public class User {

    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public void add() {
        System.out.println("properties injected..." + username);
    }
}
