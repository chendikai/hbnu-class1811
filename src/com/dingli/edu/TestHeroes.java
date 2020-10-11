package com.dingli.edu;

public class TestHeroes {
    public static void main(String[] args) {
        Heroes heroes01 = new HouYi();
        Heroes heroes02 = new DaJi();

        heroes01.run();  // 后羿移动......
        System.out.println("后羿角色id：" + heroes01.roleId);  // 2

        heroes02.run();  // 妲己移动......
        System.out.println("妲己角色id：" + heroes02.roleId);  // 3
    }
}
