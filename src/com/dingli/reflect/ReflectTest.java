package com.dingli.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Heroes heroes = new Kai("铠", 16, 100.12, "战士");

        // 1、类名.class
        Class clazz1 = Kai.class;

        // 2、通过对象的getClass()获取字节码对象
        Class clazz2 = heroes.getClass();

        // 3、通过Class类的forName()
        Class clazz3 = Class.forName("com.dingli.reflect.Kai");

        // 4、通过反射获取构造方法，并通过构造方法创建对象
        try {
            // 获取指定构造器
            Constructor constructor = clazz3.getConstructor(String.class, int.class, double.class, String.class);
            // 通过构造器创建对象
            Heroes heroes1 = (Heroes) constructor.newInstance("后羿", 20, 200, "射手");
            System.out.println(heroes1.getName());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        // 5、通过字节码对象创建对象
        try {
            Heroes heroes2 = (Kai) clazz1.newInstance();
            // 5.1 通过反射获取属性，并赋值
            Field blood = clazz3.getDeclaredField("blood");
            blood.setAccessible(true);
            Field role = clazz3.getField("role");
            role.setAccessible(true);

            // 5.2 给属性赋值
            blood.set(heroes2, 120);
            role.set(heroes2, "射手");

            // 5.3 取值
            double a = (double) blood.get(heroes2);
            String n = (String) role.get(heroes2);
            System.out.println(n + ":" + a);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
