package com.dingli.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * 银行转账业务演示事务的提交
 *
 * @author 陈迪凯
 * @date 2020-10-27 8:53
 */
public class JdbcTest10 {
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

        try {
            // 1、注册驱动
            Class.forName(driver);

            // 2、获取连接
            conn = DriverManager.getConnection(url, user, password);

            conn.setAutoCommit(false); // 将事务的自动提交改为手动提交

            // 3、获取数据库操作对象
            String sql = "update userinfo set salary = ? where username = ?";
            ps = conn.prepareStatement(sql);

            // 4、执行sql语句
            ps.setDouble(1, 10000);
            ps.setString(2, "sqwr");
            int count = ps.executeUpdate();

            ps.setDouble(1, 98888);
            ps.setString(2, "chendikai");
            count += ps.executeUpdate();
            System.out.println(count == 2 ? "转账成功" : "转账失败");

            // 5、处理查询结果集

            conn.commit(); // 事务提交
        }  catch (Exception e) {
            try {
                if (conn != null) {
                    conn.rollback(); // 事务回滚
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
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
