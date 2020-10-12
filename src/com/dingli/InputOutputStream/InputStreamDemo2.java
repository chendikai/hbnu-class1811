package com.dingli.InputOutputStream;

import java.io.*;

public class InputStreamDemo2 {
    public static void main(String[] args) {
        String fileName = "E:" + File.separator + "DingLi" + File.separator + "jixin1811.txt";
        File file = new File(fileName);

        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream(file);

            byte[] bytes = new byte[1024];  // 存放从文件中读取到的数据

            int temp = 0;
            int length = 0;

            while ((temp = inputStream.read()) != -1) {
                bytes[length] = (byte) temp;
                length++;
            }

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
