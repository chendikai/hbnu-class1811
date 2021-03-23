package com.hbnu.jdbcTemplate.c3p0.dao;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author 陈迪凯
 * @date 2021-03-23 15:50
 */
public class UserDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insertUser() {
        String sql = "insert into tb_user values(?, ?, ?, ?)";
        int rows = jdbcTemplate.update(sql, "jixin", "12345679", "jixin@163.com", 8000.00);
        System.out.println("影响的数据库行数：" + rows);
    }
}
