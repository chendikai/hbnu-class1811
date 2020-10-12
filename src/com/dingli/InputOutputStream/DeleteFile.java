package com.dingli.InputOutputStream;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        String fileName = "E:" + File.separator + "DingLi" + File.separator + "jixin1811.txt";

        File file = new File(fileName);

        if (file.exists()) {
            file.delete();
        } else {
            System.out.println("文件不存在......");
        }
    }
}
