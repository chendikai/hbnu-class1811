package com.dingli.collection;

public class GenericTest {
    public static void main(String[] args) {
        Geniric geniric = new Geniric(4);

        // 往自定义的数组里面添加数据
        geniric.addData(0, "jixin1811");
        geniric.addData(1, 1811);

        String data1 = (String) geniric.getData(0);
        String data2 = (String) geniric.getData(1);
    }
}
