package com.dingli.InputOutputStream;

import java.io.*;

/**
 * 字节输入流对象转字符输入流对象
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) {
        String fileName = "E:" + File.separator + "DingLi" + File.separator + "20201013jixin1811.txt";
        File file = new File(fileName);

        InputStreamReader inputStreamReader = null;

        try {
            // 创建一个inputStreamReader对象，inputStreamReader对象的参数为字节输入流对象
            inputStreamReader = new InputStreamReader(new FileInputStream(file));

            char[] chars = new char[1024];
            int length = inputStreamReader.read(chars); // 这一步执行完后，流中的数据存入chars数组中

            System.out.println(new String(chars, 0, length));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStreamReader.close();
                System.out.println("流资源关闭......");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
