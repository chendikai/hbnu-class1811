package com.dingli.InputOutputStream;

import java.io.*;

/**
 * 字符输出流对象转字节输出流对象
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) {
        String fileName = "E:" + File.separator + "DingLi" + File.separator + "20201013jixin1811.txt";
        File file = new File(fileName);

        OutputStreamWriter outputStreamWriter = null;

        try {
            // 创建outputStreamWriter对象，outputStreamWriter对象的参数是一个字节输出流对象
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file));

            String str = "2020年10月13日计信1811班";

            outputStreamWriter.write(str);

            System.out.println("写数据成功.......");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStreamWriter.close();
                System.out.println("流资源关闭......");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
