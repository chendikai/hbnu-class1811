package com.hbnu.jdbcTemplate.c3p0.service;

import com.hbnu.jdbcTemplate.c3p0.dao.UserDao;

/**
 * @author 陈迪凯
 * @date 2021-03-23 16:21
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        userDao.insertUser();
    }
}
