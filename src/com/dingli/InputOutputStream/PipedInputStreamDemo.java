package com.dingli.InputOutputStream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 管道输入流
 */
public class PipedInputStreamDemo implements Runnable {
    private PipedInputStream pipedInputStream; // 声明管道输入流

    public PipedInputStreamDemo() {
        this.pipedInputStream = new PipedInputStream();  // 创建管道输入流对象
    }

    public PipedInputStream getPipedInputStream() {
        return pipedInputStream;
    }

    @Override
    public void run() {
        byte[] bytes = new byte[1024]; // 存储从流中读到的数据
        try {
            int length = pipedInputStream.read(bytes); // 将流中的数据读到后存入bytes数组
            System.out.println(new String(bytes, 0, length)); // 输出从流中读到的数据
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                pipedInputStream.close(); // 关闭流资源
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
