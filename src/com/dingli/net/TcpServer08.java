package com.dingli.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 模拟用户登录，从键盘输入用户名，限制登录次数为3次
 *
 * @author 陈迪凯
 * @date 2020-11-11 8:16
 */
public class TcpServer08 {
    public static void main(String[] args) {
        try {
            // 1、创建socket服务，监听端口
            ServerSocket serverSocket = new ServerSocket(9999);
            while (true) {
                // 2、获取socket连接对象
                Socket socket = serverSocket.accept();
                new Thread(new TcpServer08Thread(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
