package com.hbnu.pojo;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author 陈迪凯
 * @date 2021-03-09 16:23
 */
public class DataType {
    private String[] arr;
    private List<String> list;
    private Map<String, String> map;
    private Properties properties;

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void printDataType() {
        System.out.println("arr:" + arr);
        System.out.println("list:" + list);
        System.out.println("map:" + map);
        System.out.println("properties:" + properties);
    }
}
