package com.dingli.jdbc;

/**
 * SqlServer公司实现SUN公司制定的接口
 *
 * @author 陈迪凯
 * @date 2020-10-20 9:13
 */
public class SqlserverJdbc implements JdbcInterface {
    @Override
    public void getConnection() {
        System.out.println("成功连接SQLSERVER数据库......");
    }
}
