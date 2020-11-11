package com.dingli.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 模拟用户登录，从键盘输入用户名，限制登录次数为3次
 *
 * @author 陈迪凯
 * @date 2020-11-11 8:05
 */
public class TcpClient08 {

    public static void main(String[] args) {
        try {
            // 1、创建socket服务，指定服务器端ip和端口port
            Socket socket = new Socket("127.0.0.1", 9999);

            // 2、获取流对象
            // 获取键盘输入流，用于获取键盘输入的数据
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            // 获取socket输出流，用于向服务器端发送数据
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            // 获取socket输入流，用于接收服务器端返回的数据
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            for (int i = 0; i < 3; i++) {
                // 3、获取键盘输入的数据
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }

                // 4、将键盘输入的数据发送到服务器端
                out.println(line);

                // 5、获取服务器端返回的结果
                String result = in.readLine();
                System.out.println(result);

                if (result.contains("欢迎")) {
                    break;
                }
            }

            // 6、关闭资源
            bufferedReader.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
