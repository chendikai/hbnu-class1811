package com.dingli.jdbc;

/**
 * 调用数据库接口
 *
 * @author 陈迪凯
 * @date 2020-10-20 9:15
 */
public class JavaPragrammer {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        JdbcInterface jdbcInterface = new MysqlJdbc();
        Class<?> clazz = Class.forName("com.dingli.jdbc.MysqlJdbc");
        JdbcInterface jdbcInterface = (JdbcInterface) clazz.newInstance();
        jdbcInterface.getConnection();
    }
}
