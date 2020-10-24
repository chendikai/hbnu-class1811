package com.dingli.jdbc;

import com.mysql.cj.x.protobuf.MysqlxSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 更新和删除数据
 *
 * @author 陈迪凯
 * @date 2020-10-23 16:26
 */
public class JdbcTest03 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1、注册驱动
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            // 2、获取连接
            String url = "jdbc:mysql://127.0.0.1:3306/hbnu?serverTimezone=GMT&useSSL=false&characterEncoding=utf-8";
            String user = "root"; // hbnujixin
            String password = "chendikai"; // 123456
            conn = DriverManager.getConnection(url, user, password);

            // 3、获取数据库操作对象
            stmt = conn.createStatement();

            // 4、执行SQL语句
            String sql = "update userinfo set password='654321' where username='chendikai'";
            int count = stmt.executeUpdate(sql); // 对于数据库操作中的增、删、改，调用的是executeUpdate()
            System.out.println("影响的数据量：" + count);

            // 5、处理查询结果集
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
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
