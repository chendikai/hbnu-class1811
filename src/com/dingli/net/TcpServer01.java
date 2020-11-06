package com.dingli.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 客户端发送一次数据，服务端接收一次数据
 * 
 * @author 陈迪凯
 * @date 2020-11-06 16:33
 */
public class TcpServer01 {
    public static void main(String[] args) {
        try {
            // 1、创建socket服务，并监听端口
            ServerSocket serverSocket = new ServerSocket(8888);
            
            // 2、获取连接
            Socket socket = serverSocket.accept();
            
            // 3、获取socket输入流，用于接收客户端发送过来读数据
            InputStream in = socket.getInputStream();
            
            // 4、获取客户端的数据
            byte[] buf = new byte[1024];
            int len = in.read(buf);
            System.out.println(new String(buf, 0, len));

            // 5、关闭资源
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
