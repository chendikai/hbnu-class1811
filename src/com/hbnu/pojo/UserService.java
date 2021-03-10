package com.hbnu.pojo;

/**
 * @author 陈迪凯
 * @date 2021-03-09 15:46
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void printUserService() {
        System.out.println("UserService......printUserService");
        userDao.printUserDao();
    }
}
