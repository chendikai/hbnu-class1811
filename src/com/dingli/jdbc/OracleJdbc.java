package com.dingli.jdbc;

/**
 * ORACLE公司实现SUN公司制定的接口
 *
 * @author 陈迪凯
 * @date 2020-10-20 9:12
 */
public class OracleJdbc implements JdbcInterface {
    @Override
    public void getConnection() {
        System.out.println("成功连接ORACLE数据库......");
    }
}
