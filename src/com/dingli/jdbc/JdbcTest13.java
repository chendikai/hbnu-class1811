package com.dingli.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 演示悲观锁
 *
 * @author 陈迪凯
 * @date 2020-10-28 8:12
 */
public class JdbcTest13 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // 1、注册驱动和获取连接
            conn = JDBCUtils.getConnection();

            // 3、获取数据库操作对象
            String sql = "update userinfo set salary = ? where username = ?";
            ps = conn.prepareStatement(sql);

            // 4、执行SQL语句
            ps.setDouble(1, 200);
            ps.setString(2, "chendikai");
            int count = ps.executeUpdate();
            System.out.println(count);

            // 5、处理查询结果集
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 6、释放资源
            JDBCUtils.close(conn, ps, rs);
        }
    }
}
