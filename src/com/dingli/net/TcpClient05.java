package com.dingli.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * 序列化对象，并通过网络进行传输
 *
 * @author 陈迪凯
 * @date 2020-11-09 10:58
 */
public class TcpClient05 {
    public static void main(String[] args) {
        try {
            // 1、创建socket服务，指定服务器端的ip和端口port
            Socket socket = new Socket("127.0.0.1", 8888);

            // 2、获取流对象
            // 将对象发送给服务器端
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            // 获取服务器端返回的结果
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 3、开始发送对象给服务器端
            User user = new User();
            user.setName("jixin1811");
            user.setAge(18);
            out.writeObject(user);

            // 4、接收服务器端返回的结果
            String result = in.readLine();
            System.out.println(result);

            // 5、关闭资源
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
