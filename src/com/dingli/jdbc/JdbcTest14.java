package com.dingli.jdbc;

import jdk.nashorn.internal.scripts.JD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 封装查询出来的数据
 *
 * @author 陈迪凯
 * @date 2020-10-28 8:36
 */
public class JdbcTest14 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // 1、注册驱动和获取连接
            conn = JDBCUtils.getConnection();

            // 3、获取数据库操作对象
            String sql = "select * from userinfo";
            ps = conn.prepareStatement(sql);

            // 4、执行sql语句
            rs = ps.executeQuery();

            // 5、处理查询结果集
            List<User> list = new ArrayList<>();
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setRealname(rs.getString("realname"));
                user.setSalary(rs.getDouble("salary"));
                list.add(user);
            }

            Iterator<User> iterator = list.iterator();
            while (iterator.hasNext()) {
                User user = iterator.next();
                System.out.println(user.getId() + "\t" + user.getRealname());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 6、释放资源
            JDBCUtils.close(conn, ps, rs);
        }
    }
}
