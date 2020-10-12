package com.dingli.InputOutputStream;

import java.io.*;

public class InputStreamDemo {
    public static void main(String[] args) {
        String fileName = "E:" + File.separator + "DingLi" + File.separator + "jixin1811.txt";
        File file = new File(fileName);

        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream(file);

            byte[] bytes = new byte[(int) file.length()];  // 存放从文件中读取到的数据

            int length = inputStream.read(bytes); // 将流中的数据读取出来，并存放到bytes数组中

            System.out.println(new String(bytes, 0, length));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
