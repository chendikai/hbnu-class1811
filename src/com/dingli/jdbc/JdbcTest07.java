package com.dingli.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 模拟用户登录，采用预编译数据库操作对象
 *
 * @author 陈迪凯
 * @date 2020-10-26 11:14
 */
public class JdbcTest07 {
    public static void main(String[] args) {
        // 1、给用户一个输入用户名和密码的界面
        Map<String, String> userinfo = initUI();

        // 2、校验用户名和密码
        boolean successLogin = login(userinfo);

        // 3、给用户登录成功或失败的提示信息
        System.out.println(successLogin ? "登录成功" : "登录失败");
    }

    /**
     * 校验用户输入的用户名和密码
     *
     * @param userinfo 用户输入的信息
     * @return 返回校验结果
     */
    private static boolean login(Map<String, String> userinfo) {

        boolean flag = false; // 校验成功或失败的标记

        String name = userinfo.get("username");
        String pwd = userinfo.get("password");

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // 1、注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2、获取数据库连接
            String url = "jdbc:mysql://127.0.0.1:3306/hbnu?serverTimezone=GMT&useSSL=false&characterEncoding=utf-8";
            String user = "root";
            String password = "chendikai";
            conn = DriverManager.getConnection(url, user, password);

            // 3、获取数据库操作对象
            String sql = "select * from userinfo where username=? and password=?";
            ps = conn.prepareStatement(sql);

            // 4、执行sql语句
            ps.setString(1, name);
            ps.setString(2, pwd);
            rs = ps.executeQuery();

            // 5、处理查询结果集
            while (rs.next()) {
                flag = true;
                break;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 6、释放资源
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

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

        return flag;
    }

    /**
     * 初始化界面，给用户提供输入用户名和密码的入口
     *
     * @return 返回结果是存储了用户信息的集合
     */
    private static Map<String, String> initUI() {
        Map<String, String> hashMap = new HashMap<>(); // hashMap这个集合用来存储用户输入的用户名和密码

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入用户名：");
        String username = scanner.nextLine();

        System.out.println("请输入密码：");
        String password = scanner.nextLine();

        // 将用户输入的信息存入集合中
        hashMap.put("username", username);
        hashMap.put("password", password);

        return hashMap;
    }
}
