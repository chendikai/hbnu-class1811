package com.dingli.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * 使用PreparedStatement进行增、删、改
 *
 * @author 陈迪凯
 * @date 2020-10-27 8:00
 */
public class JdbcTest08 {

    public static void main(String[] args) {
        // 获取配置文件中的数据库信息
        ResourceBundle resourceBundle = ResourceBundle.getBundle("jdbc");

        String driver = resourceBundle.getString("driver");
        String url = resourceBundle.getString("url");
        String user = resourceBundle.getString("user");
        String password = resourceBundle.getString("password");

        // 声明变量
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // 1、注册驱动
            Class.forName(driver);

            // 2、获取连接
            conn = DriverManager.getConnection(url, user, password);

            // 3、获取数据库操作对象
            // String sql = "insert into userinfo(username,password,realname,salary) values(?,?,?,?) "; // 新增数据
            // String sql = "update userinfo set salary=? where username=?"; // 修改数据
            String sql = "delete from userinfo where username = ?";

            ps = conn.prepareStatement(sql);

            // 4、执行SQL语句
            /*
            // 新增数据
            ps.setString(1, "zhangsanfeng");
            ps.setString(2, "zhang123456");
            ps.setString(3, "张三丰");
            ps.setDouble(4, 90000);
            */

            /*
            // 修改数据
            ps.setDouble(1, 88888);
            ps.setString(2, "zhangsanfeng");
            */

            // 删除数据
            ps.setString(1,"zhangsanfeng");
            int count = ps.executeUpdate();
            System.out.println("影响数据库中的数据：" + count);

            // 5、处理查询结果集

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 6、释放资源
            try {
                if (ps != null) {
                    ps.close();
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
