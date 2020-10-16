package com.dingli.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(); // 创建一个集合对象

        // 添加元素
        arrayList.add("jixin1811");
        arrayList.add(null);
        arrayList.add(new Integer(123));  // 自动装箱，将基本数据类型转为对应的包装类 int->Integer, float->Float
        arrayList.add(123.42);
        System.out.println(arrayList);
        arrayList.add(2, "hbnu");
        System.out.println(arrayList);

        // contains
        System.out.println(arrayList.contains("jixin1811"));

        System.out.println(arrayList.get(2));
        arrayList.add(123);
        System.out.println(arrayList);
        System.out.println(arrayList.indexOf(123));
        System.out.println(arrayList.isEmpty());
        arrayList.set(2, "1811");
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        // for循环遍历集合中的元素
        System.out.println("==========for循环遍历集合元素==============");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        // foreach循环遍历集合中的元素
        System.out.println("==============foreach循环遍历集合中的元素============");
        for (Object obj : arrayList) {
            System.out.println(obj);
        }

        // Iterator迭代器遍历集合元素
        System.out.println("============Iterator迭代器遍历集合元素==============");
        Iterator iterator = arrayList.iterator(); // 获取集合的迭代器
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);

        }

    }
}
