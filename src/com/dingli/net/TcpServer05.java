package com.dingli.net;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 序列化对象，并通过网络进行传输
 *
 * @author 陈迪凯
 * @date 2020-11-09 11:03
 */
public class TcpServer05 {
    public static void main(String[] args) {
        try {
            // 1、创建socket服务，监听端口
            ServerSocket serverSocket = new ServerSocket(8888);

            // 2、获取socket连接
            Socket socket = serverSocket.accept();
            String ip = socket.getInetAddress().getHostAddress();
            System.out.println(ip + "......connected");

            // 3、获取流对象
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream()); // 获取客户端发送过来的对象
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true); // 向客户端返回结果

            // 4、开始获取客户端传过来的对象，并进行反序列化
            User user = (User) in.readObject();
            System.out.println(user.getName() + ":" + user.getAge());

            // 5、向客户端返回结果
            out.println("反序列化成功");

            // 6、关闭资源
            socket.close();
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
