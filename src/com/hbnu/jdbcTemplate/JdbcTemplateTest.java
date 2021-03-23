package com.hbnu.jdbcTemplate;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

/**
 * @author 陈迪凯
 * @date 2021-03-23 14:38
 */
public class JdbcTemplateTest {

    /**
     * 添加用户信息
     */
    @Test
    public void insertUser() {
        // 配置数据信息
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///hbnu?serverTimezone=GMT&useSSL=false&characterEncoding=utf8");
        dataSource.setUsername("root");
        dataSource.setPassword("chendikai");

        // 获取jdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        // 通过jdbcTemplate对象，执行数据库的CRUD操作
        String sql = "insert into tb_user values(?, ?, ?, ?)";
        int rows = jdbcTemplate.update(sql, "jixin1811", "123456", "jixin1811@qq.com", 80000.00);
        System.out.println("影响的数据行数：" + rows);
    }

    /**
     * 修改用户信息
     */
    @Test
    public void updateUser() {
        // 配置数据信息
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///hbnu?serverTimezone=GMT&useSSL=false&characterEncoding=utf8");
        dataSource.setUsername("root");
        dataSource.setPassword("chendikai");

        // 获取jdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        // 执行数据操作
        String sql = "update tb_user set password = ? where username = ?";
        int row = jdbcTemplate.update(sql, "jixin", "jixin");
        System.out.println("影响的数据行数：" + row);
    }

    /**
     * 删除用户信息
     */
    @Test
    public void deleteUser() {
        // 配置数据信息
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///hbnu?serverTimezone=GMT&useSSL=false&characterEncoding=utf8");
        dataSource.setUsername("root");
        dataSource.setPassword("chendikai");

        // 获取jdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        // 执行数据操作
        String sql = "delete from tb_user where username = ?";
        int row = jdbcTemplate.update(sql, "jixin");
        System.out.println("影响的数据行数：" + row);
    }

    /**
     * 查询
     */
    @Test
    public void selectOne() {
        // 配置数据信息
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///hbnu?serverTimezone=GMT&useSSL=false&characterEncoding=utf8");
        dataSource.setUsername("root");
        dataSource.setPassword("chendikai");

        // 获取jdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        // 执行数据操作
        String sql = "select count(*) from tb_user";
        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println("总共有：" + count + "条记录");
    }

    /**
     * 查询
     */
    @Test
    public void selectOneObject() {
        // 配置数据信息
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///hbnu?serverTimezone=GMT&useSSL=false&characterEncoding=utf8");
        dataSource.setUsername("root");
        dataSource.setPassword("chendikai");

        // 获取jdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        // 执行数据操作
        String sql = "select * from tb_user where username = ?";
        User user = jdbcTemplate.queryForObject(sql, new MyRowMapper(), "chendikai");
        System.out.println(user);
    }

    /**
     * 查询
     */
    @Test
    public void selectList() {
        // 配置数据信息
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///hbnu?serverTimezone=GMT&useSSL=false&characterEncoding=utf8");
        dataSource.setUsername("root");
        dataSource.setPassword("chendikai");

        // 获取jdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        // 执行数据操作
        String sql = "select * from tb_user";
        List<User> userList = jdbcTemplate.query(sql, new MyRowMapper());

        for (User user : userList) {
            System.out.println(user);
        }
    }
}
