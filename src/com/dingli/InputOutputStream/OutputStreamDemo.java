package com.dingli.InputOutputStream;

import java.io.*;

public class OutputStreamDemo {
    public static void main(String[] args) {
        String fileName = "E:" + File.separator + "DingLi" + File.separator + "jixin1811.txt";
        File file = new File(fileName);

        // 声明字节输出流
        OutputStream outputStream = null;

        try {
            // 创建字节输出流对象
            outputStream = new FileOutputStream(file, true); // 如果文件不存在，则会自动创建文件

            String str = "\r\n班长：姚樊";

            byte[] bytes = str.getBytes();  // 将字符转为字节

            // 往流中写数据
            // outputStream.write(bytes);

            // 一个字节一个字节往流中写数据
            for (int i = 0; i < bytes.length; i++) {
                outputStream.write(bytes[i]);
            }

            System.out.println("数据写入成功......");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
                System.out.println("流资源关闭......");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
