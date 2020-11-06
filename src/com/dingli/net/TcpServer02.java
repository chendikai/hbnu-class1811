package com.dingli.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 客户端和服务端进行数据交互
 *
 * @author 陈迪凯
 * @date 2020-11-06 16:50
 */
public class TcpServer02 {
    public static void main(String[] args) {
        try {
            // 1、创建socket服务，并监听端口
            ServerSocket serverSocket = new ServerSocket(9999);

            // 2、获取连接
            Socket socket = serverSocket.accept();

            // 3、获取socket的输入流和输出流
            InputStream in = socket.getInputStream(); // 用于接收客户端发送过来的数据
            OutputStream out = socket.getOutputStream(); // 用于给客户端反馈数据

            // 4、获取客户端发送的数据
            byte[] buf = new byte[1024];
            int len = in.read(buf);
            System.out.println("客户端发送的数据：" + new String(buf, 0, len));

            // 5、反馈数据给客户端
            out.write("客户端，你也好".getBytes());

            // 6、关闭资源
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
