package com.dingli.collection;

public class Heroes {
    private String heroesId;
    private String name;
    private String role;
    private String sex;

    public Heroes(String heroesId, String name, String role, String sex) {
        this.heroesId = heroesId;
        this.name = name;
        this.role = role;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Heroes{" +
                "heroesId='" + heroesId + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
