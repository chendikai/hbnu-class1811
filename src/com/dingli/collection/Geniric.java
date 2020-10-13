package com.dingli.collection;

/**
 * 自定义一个可以存储任意类型数据的数组
 */
public class Geniric {
    private Object[] arrayObject;

    public Geniric(int capacity) {
        this.arrayObject = new Object[capacity];
    }

    public void addData(int index, Object data) {
        arrayObject[index] = data;
    }

    public Object getData(int index) {
        return arrayObject[index];
    }
}
