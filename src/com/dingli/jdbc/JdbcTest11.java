package com.dingli.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 模糊查询演示，采用JDBC工具类
 *
 * @author 陈迪凯
 * @date 2020-10-27 9:25
 */
public class JdbcTest11 {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtils.getConnection(); // 注册驱动、获取配置文件中的数据库信息、获取连接

            String sql = "select username,password,realname,salary from userinfo where username like ?";
            ps = conn.prepareStatement(sql);

            ps.setString(1, "_h%");
            rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString(1);
                String pwd = rs.getString(2);
                String real = rs.getString(3);
                String sal = rs.getString(4);
                System.out.println(name + "\t" + pwd + "\t" + real + "\t" + sal);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(conn, ps, rs);
        }
    }
}
