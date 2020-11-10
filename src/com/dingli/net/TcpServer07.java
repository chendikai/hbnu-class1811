package com.dingli.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 陈迪凯
 * @date 2020-11-10 9:00
 */
public class TcpServer07 {
    public static void main(String[] args) {
        try {
            // 1、创建socket服务，并监听端口
            ServerSocket serverSocket = new ServerSocket(8888);

            while (true) {
                // 2、获取socket连接
                Socket socket = serverSocket.accept();
                new Thread(new TcpServer07Thread(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
