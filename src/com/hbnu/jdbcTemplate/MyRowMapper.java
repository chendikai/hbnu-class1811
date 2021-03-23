package com.hbnu.jdbcTemplate;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 陈迪凯
 * @date 2021-03-23 15:16
 */
public class MyRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {

        // 获取查询结果
        String username = resultSet.getString("username");
        String password = resultSet.getString("password");
        String email = resultSet.getString("email");
        double salary = resultSet.getDouble("salary");

        // 将查询到的结果封装到对象中
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setSalary(salary);

        return user;
    }
}
