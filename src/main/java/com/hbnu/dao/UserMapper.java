package com.hbnu.dao;

import com.hbnu.pojo.User;

/**
 * @author 陈迪凯
 * @date 2021-03-30 8:23
 */
public interface UserMapper {

    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 用户信息
     */
    public User findUserByUsername(String username);
}
