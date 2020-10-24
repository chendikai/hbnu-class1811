package com.dingli.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 执行更新与删除
 *
 * @author 陈迪凯
 * @date 2020-10-21 9:06
 */
public class JdbcTest02 {
    public static void main(String[] args) {

        Connection conn = null;
        Statement stms = null;
        try {
            // 1、注册驱动
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            // 2、获取连接
            String url = "jdbc:mysql://localhost:3306/hbnu?serverTimezone=GMT&useSSL=false&characterEncoding=utf-8";
            String user = "root";
            String password = "chendikai";
            conn = DriverManager.getConnection(url, user, password);

            // 3、获取数据库操作对象
            stms = conn.createStatement();

            // 4、执行sql语句
            String sql = "update userInfo set salary=10000 where realname='计信1811班'";
            int count = stms.executeUpdate(sql);
            System.out.println("影响的数据数目：" + count);

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
