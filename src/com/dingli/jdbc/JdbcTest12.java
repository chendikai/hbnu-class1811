package com.dingli.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 演示悲观锁
 *
 * @author 陈迪凯
 * @date 2020-10-28 8:06
 */
public class JdbcTest12 {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // 1、注册驱动和获取连接
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);

            // 3、获取数据库操作对象
            String sql = "select username, realname from userinfo where username = ? ";
            ps = conn.prepareStatement(sql);

            // 4、执行SQL语句
            ps.setString(1, "chendikai");
            rs = ps.executeQuery();

            // 5、处理查询结果集
            while (rs.next()) {
                System.out.println(rs.getString("username") + "\t" + rs.getString("realname"));
            }
            conn.commit();
        } catch (SQLException e) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            // 6、释放资源
            JDBCUtils.close(conn, ps, rs);
        }
    }
}
