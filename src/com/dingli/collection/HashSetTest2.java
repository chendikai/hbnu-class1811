package com.dingli.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {
    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<>();

        hashSet.add(new Person("后羿", 18));
        hashSet.add(new Person("妲己", 18));
        hashSet.add(new Person("后羿", 18));
        hashSet.add(new Person("鲁班", 18));
        hashSet.add(new Person("小乔", 18));

        Iterator<Person> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
