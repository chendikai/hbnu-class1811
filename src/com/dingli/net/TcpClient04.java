package com.dingli.net;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 文本文件上传至服务器端
 *
 * @author 陈迪凯
 * @date 2020-11-09 10:01
 */
public class TcpClient04 {
    public static void main(String[] args) {
        try {
            // 1、创建socket服务，指定服务器端ip和端口port
            Socket socket = new Socket("127.0.0.1", 8888);

            // 2、获取流对象
            // 获取文件输入流，读取文件内容
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(".\\src\\jdbc.properties")));
            // 获取socket输出流，向服务器端发送数据
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            // 获取socket输入流，获取服务器端返回的结果数据
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            // long time = System.currentTimeMillis(); // 获取当前时间戳
            // dos.writeLong(time);

            // 3、读取文件，并将文件内容上传至服务器端
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                // 4、向服务器端发送数据
                out.println(line);
            }
            // out.println("over");
            // out.println(time + "");
            socket.shutdownOutput();

            // 5、获取服务器端返回的结果
            String result = in.readLine();
            System.out.println(result);

            // 6、关闭资源
            bufferedReader.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
