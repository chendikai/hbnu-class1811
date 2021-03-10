package com.hbnu.annotation;

import org.springframework.stereotype.Component;

/**
 * @author 陈迪凯
 * @date 2021-03-09 17:19
 */
@Component(value = "userDao")
public class UserDao {
    public void printUserDao() {
        System.out.println("UserDao......printUserDao......");
    }
}
