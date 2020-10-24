package com.dingli.jdbc;

import com.sun.media.sound.SoftTuning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

/**
 * 驱动注册的第二种方式
 *
 * @author 陈迪凯
 * @date 2020-10-23 16:53
 */
public class JdbcTest04 {
    public static void main(String[] args) {
        // 获取配置文件中的数据库信息
        ResourceBundle resourceBundle = ResourceBundle.getBundle("jdbc");
        String driver = resourceBundle.getString("driver");
        String url = resourceBundle.getString("url");
        String user = resourceBundle.getString("user");
        String password = resourceBundle.getString("password");

        Connection conn = null;
        Statement stmt = null;
        try {
            // 1、注册驱动
            // DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Class.forName(driver);

            // 2、获取连接
            conn = DriverManager.getConnection(url, user, password);

            // 3、获取数据库操作对象
            stmt = conn.createStatement();

            // 4、执行sql语句
            // String sql = "insert into userinfo(username,password,realname,salary) values('houyi','houyi123','后羿',80000)"; // 新增数据
            // String sql = "update userinfo set salary=70000 where username='chendikai'"; // 修改数据
            String sql = "delete from userinfo where username='chendikai'";
            int count = stmt.executeUpdate(sql); // 对于数据库操作中的增、删、改用executeUpdate()方法
            System.out.println("影响的数据数量：" + count);
        } catch (Exception e) {
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
