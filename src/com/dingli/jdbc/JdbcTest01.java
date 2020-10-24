package com.dingli.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 注册驱动与获取连接
 *
 * @author 陈迪凯
 * @date 2020-10-21 8:04
 */
public class JdbcTest01 {
    public static void main(String[] args) {

        Connection conn = null;
        Statement stms = null;
        try {
            // 1、注册驱动
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); // 告诉程序将使用MySQL数据库

            // 2、获取连接
            String url = "jdbc:mysql:///hbnu?serverTimezone=GMT&useSSL=false&characterEncoding=utf-8"; // 数据库url
            String user = "root"; // 数据库用户名
            String password = "chendikai"; // 数据库密码
            conn = DriverManager.getConnection(url, user, password);

            // 3、获取数据库操作对象
            stms = conn.createStatement();

            // 4、执行sql语句
            String sql = "insert into userInfo(username,password,realname,salary) values('jixin1811','1811','计信1811班',80000)";
            int count = stms.executeUpdate(sql); // 对于增、删、改这些数据库操作，执行sql语句时，调用的是executeUpdate（）方法
            System.out.println("影响的数据库数目：" + count);

            // 5、处理查询结果集
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 6、释放资源
            try {
                if (stms != null) {
                    stms.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
