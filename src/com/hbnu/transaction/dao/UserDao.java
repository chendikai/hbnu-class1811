package com.hbnu.transaction.dao;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author 陈迪凯
 * @date 2021-03-30 14:37
 */
public class UserDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * zhangsan账户少钱
     */
    public void lessMoney() {
        String sql = "update tb_account set account = account - ? where username = ?";
        jdbcTemplate.update(sql, 1000.00, "zhangsan");
    }

    /**
     * lisi账户多钱
     */
    public void moreMoney() {
        String sql = "update tb_account set account = account + ? where username = ?";
        jdbcTemplate.update(sql, 1000.00, "lisi");

    }
}
