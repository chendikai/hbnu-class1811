package com.dingli.net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 客户端发送一次数据，服务端接收一次数据
 *
 * @author 陈迪凯
 * @date 2020-11-06 16:28
 */
public class TcpClient01 {
    public static void main(String[] args) {
        try {
            // 1、创建socket服务，并指定服务端的ip和端口port
            Socket socket = new Socket("127.0.0.1", 8888);

            // 2、获取socket的输出流，是为了向服务端发送数据
            OutputStream out = socket.getOutputStream();

            // 3、准备数据,并发送数据
            byte[] buf = "hbnu jixin 1811".getBytes();
            out.write(buf);

            // 4、关闭资源
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
