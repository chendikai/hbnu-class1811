package com.dingli.InputOutputStream;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * 管道输出流
 */
public class PipedOutputStreamDemo implements Runnable {
    private PipedOutputStream pipedOutputStream;  // 声明管道输出流

    public PipedOutputStreamDemo() {
        this.pipedOutputStream = new PipedOutputStream(); // 创建管道输出流对象
    }

    public PipedOutputStream getPipedOutputStream() {
        return pipedOutputStream;
    }

    @Override
    public void run() {
        String str = "湖北师范大学";  // 需要写入流中的数据
        byte[] bytes = str.getBytes(); // 将字符转为字节
        try {
            pipedOutputStream.write(bytes);  // 往流中写数据
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                pipedOutputStream.close();  // 关闭流资源
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
