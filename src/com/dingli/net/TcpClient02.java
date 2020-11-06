package com.dingli.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 客户端和服务端进行数据交互
 *
 * @author 陈迪凯
 * @date 2020-11-06 16:44
 */
public class TcpClient02 {
    public static void main(String[] args) {
        try {
            // 1、创建socket服务，并指定服务端的ip和端口port
            Socket socket = new Socket("127.0.0.1", 9999);

            // 2、获取socket的输入流和输出流
            OutputStream out = socket.getOutputStream(); // 用于向服务端发送数据
            InputStream in = socket.getInputStream(); // 用于接收服务端返回的数据

            // 3、准备数据，并发送给服务端
            out.write("服务端，你好".getBytes());

            // 4、接收服务端返回的数据
            byte[] buf = new byte[1024];
            int len = in.read(buf);
            System.out.println("服务端返回的数据：" + new String(buf, 0, len));

            // 5、关闭资源
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
