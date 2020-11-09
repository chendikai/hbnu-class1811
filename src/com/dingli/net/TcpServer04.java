package com.dingli.net;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 文本文件上传至服务器端
 *
 * @author 陈迪凯
 * @date 2020-11-09 10:13
 */
public class TcpServer04 {
    public static void main(String[] args) {
        try {
            // 1、创建socket服务，监听端口
            ServerSocket serverSocket = new ServerSocket(8888);

            // 2、获取socket连接
            Socket socket = serverSocket.accept(); // 阻塞式方法

            // 3、获取流对象
            // 获取socket输入流，接收客户端发送过来的数据
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            PrintWriter printWriter = new PrintWriter(new FileWriter("E:\\DingLi\\1811.txt"), true);

            // DataInputStream dis = new DataInputStream(socket.getInputStream());
            // long time = dis.readLong();

            // 4、获取文件内容，并将客户端的文件内容保存到服务端文件
            String line = null;
            while ((line = in.readLine()) != null) {
                // if ("over".equals(line)) {
                //     break;
                // }

                // if ((time + "").equals(line)) {
                //     break;
                // }

                // 5、向文件中写数据
                printWriter.println(line);
            }

            // 6、向客户端反馈数据
            out.println("文件上传成功");

            // 7、关闭资源
            printWriter.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
