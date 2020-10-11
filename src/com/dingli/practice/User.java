package com.dingli.practice;

import java.util.Objects;

public class User {
    private String username; // 用户名
    private String password; // 用户密码

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
       if (obj == null) {
           return false;
       }
       if (this == obj) {
           return true;
       }
       if (!(obj instanceof User)) {
           return false;
       }
       User user = (User)obj;
       return this.username.equals(user.username) && this.password.equals(user.password);
    }

}
