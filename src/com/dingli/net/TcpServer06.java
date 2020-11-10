package com.dingli.net;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 图片上传
 *
 * @author 陈迪凯
 * @date 2020-11-10 8:18
 */
public class TcpServer06 {

    public static void main(String[] args) {
        try {
            // 1、创建socket服务，并监听端口
            ServerSocket serverSocket = new ServerSocket(8888);

            // 2、获取socket连接
            Socket socket = serverSocket.accept();

            // 3、获取流对象
            InputStream in = socket.getInputStream(); // 获取从客户端接收的内容
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true); // 向服务器端反馈结果
            FileOutputStream fos = new FileOutputStream("E:\\DingLi\\test.jpg"); // 向文件中写数据

            // 4、读客户端发送过来的数据，并将数据写入到文件中
            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = in.read(buf)) != -1) {
                // 5、将读到的数据写入文件
                fos.write(buf, 0, len);
            }

            // 6、向客户端反馈结果
            out.println("图片上传成功");

            // 7、关闭资源
            fos.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
