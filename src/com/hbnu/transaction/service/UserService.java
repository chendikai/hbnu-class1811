package com.hbnu.transaction.service;

import com.hbnu.transaction.dao.UserDao;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 陈迪凯
 * @date 2021-03-30 14:38
 */
@Transactional
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * 转账业务
     */
    public void account() {
        userDao.lessMoney();

        // 模拟异常情况
        int i = 100 / 0;

        userDao.moreMoney();
    }
}
