package com.dingli.InputOutputStream;

import java.io.File;

public class PrintFiles {
    public static void main(String[] args) {
        String fileName = "E:" + File.separator + "DingLi";
        File file = new File(fileName);

        printAllFiles(file);
    }

    private static void printAllFiles(File file) {
        if (file != null) {
            if (file.isDirectory()) {
                File[] files = file.listFiles(); // 获取当前目录下的所有文件
                for (File f : files) {
                    printAllFiles(f);
                }
            } else {
                if (file.getAbsolutePath().endsWith(".java")) {
                    System.out.println(file);
                }
            }
        }
    }
}
