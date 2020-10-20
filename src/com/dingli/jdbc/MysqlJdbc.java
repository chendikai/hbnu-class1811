package com.dingli.jdbc;

/**
 * Mysql数据库厂商实现SUN公司制定的接口
 *
 * @author 陈迪凯
 * @date 2020-10-20 9:10
 */
public class MysqlJdbc implements JdbcInterface {
    @Override
    public void getConnection() {
        System.out.println("成功连接Mysql数据库......");
    }
}
