package com.dingli.InputOutputStream;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * 管道流测试
 */
public class PipedStreamTest {
    public static void main(String[] args) {
        PipedOutputStreamDemo pipedOutputStreamDemo = new PipedOutputStreamDemo(); // 创建输出对象
        PipedInputStreamDemo pipedInputStreamDemo = new PipedInputStreamDemo(); // 创建输入对象

        try {
            // 管道输出流和管道输入流进行连接
            pipedOutputStreamDemo.getPipedOutputStream().connect(pipedInputStreamDemo.getPipedInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 启动线程
        new Thread(pipedOutputStreamDemo).start();
        new Thread(pipedInputStreamDemo).start();

    }
}
