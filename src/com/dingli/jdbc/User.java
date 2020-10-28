package com.dingli.jdbc;

/**
 * 用户类
 *
 * @author 陈迪凯
 * @date 2020-10-28 8:33
 */
public class User {

    private int id;  // 用户id
    private String username; // 用户名
    private String password; // 用户密码
    private String realname; // 用户真实名字
    private double salary; // 用户薪资

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
