package com.dingli.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> objectObjectHashMap = new HashMap<>();

        objectObjectHashMap.put(1, "jixin");
        objectObjectHashMap.put(1, "jixin1");
        objectObjectHashMap.put(2, "jixin2");
        objectObjectHashMap.put(3, "jixin3");
        objectObjectHashMap.put(4, "jixin4");

        Set<Integer> integers = objectObjectHashMap.keySet(); // 获取集合中的所有key
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        Collection<String> values = objectObjectHashMap.values(); // 获取集合中所有的value
        Iterator<String> iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }

        System.out.println();
        Set<Map.Entry<Integer, String>> entries = objectObjectHashMap.entrySet(); // 获取map集合中的实体数据
        Iterator<Map.Entry<Integer, String>> iterator2 = entries.iterator();
        while (iterator2.hasNext()) {
            Map.Entry<Integer, String> entry = iterator2.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);

        }
    }
}
