package com.dingli.InputOutputStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
    public static void main(String[] args) {
        String fileName = "E:" + File.separator + "DingLi" + File.separator + "jixin1811_2.txt";
        File file = new File(fileName);

        Writer writer = null;

        try {
            writer = new FileWriter(fileName);

            String str = "湖北师范大学计信1811班信息";

            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
