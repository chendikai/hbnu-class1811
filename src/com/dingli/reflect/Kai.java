package com.dingli.reflect;

public class Kai extends Heroes {
    private double blood;
    public String role;

    public double getBlood() {
        return blood;
    }

    public void setBlood(double blood) {
        this.blood = blood;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Kai(String name, int age, double blood, String role) {
        super(name, age);
        this.blood = blood;
        this.role = role;
    }

    public Kai(String name, int age) {
        super(name, age);
    }

    public Kai() {
        super();
    }

    public void fighting() {
        System.out.println("fighting......");
    }

    private void bloodReturning() {
        System.out.println("bloodReturning......");
    }
}
