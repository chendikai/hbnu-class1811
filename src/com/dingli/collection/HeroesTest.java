package com.dingli.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class HeroesTest {
    public static void main(String[] args) {
        Heroes houyi = new Heroes("001", "后羿", "射手", "男");
        Heroes daji = new Heroes("002", "妲己", "法师", "女");
        Heroes yase = new Heroes("003", "亚瑟", "坦克", "男");

        ArrayList<Heroes> arrayList = new ArrayList<>();

        arrayList.add(houyi);
        arrayList.add(daji);
        arrayList.add(yase);

        Iterator<Heroes> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Heroes heroes = iterator.next();
            System.out.println(heroes);
        }
    }
}
