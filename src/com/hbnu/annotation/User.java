package com.hbnu.annotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author 陈迪凯
 * @date 2021-03-09 16:56
 */
@Component(value = "user")
public class User {
    public void add() {
        System.out.println("User......add......");
    }
}
