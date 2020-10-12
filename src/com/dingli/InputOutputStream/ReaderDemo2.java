package com.dingli.InputOutputStream;

import java.io.*;

public class ReaderDemo2 {
    public static void main(String[] args) {
        String fileName = "E:" + File.separator + "DingLi" + File.separator + "jixin1811_2.txt";
        File file = new File(fileName);

        Reader reader = null;

        try {
            reader = new FileReader(file);

            char[] chars = new char[1024];

            int temp = 0;
            int length = 0;
            while ((temp = reader.read()) != -1) {
                chars[length] = (char) temp;
                length++;
            }

            System.out.println(new String(chars));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
