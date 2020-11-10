package com.dingli.net;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 图片并发上传
 *
 * @author 陈迪凯
 * @date 2020-11-10 8:09
 */
public class TcpClient07 {
    public static void main(String[] args) {
        try {

            if (args.length != 1) {
                System.out.println("请上传.jpg格式的图片");
                return;
            }

            File file = new File(args[0]);

            if (!(file.exists() && file.isFile())) {
                System.out.println("文件有问题");
                return;
            }

            if (!(file.getName().endsWith(".jpg"))) {
                System.out.println("图片格式错误");
                return;
            }

            if (file.length() > 1024 * 1024 * 5) {
                System.out.println("小伙子，你没安好心");
                return;
            }

            // 1、创建socket服务，指定服务器端ip和端口port
            Socket socket = new Socket("127.0.0.1", 8888);

            // 2、获取流对象
            // 图片文件读取流，用于读取图片内容
            FileInputStream fis = new FileInputStream(file);
            // socket输出流，用于将图片内容发送给服务器端
            OutputStream out = socket.getOutputStream();
            // socket输入流，用于接收服务器端返回的结果
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 3、读取图片内容，并将内容发送给服务器端
            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = fis.read(buf)) != -1) {
                // 4、将内容发送给服务器端
                out.write(buf, 0, len);
            }

            socket.shutdownOutput(); // 给服务器端发送结束标记

            // 5、获取服务器端返回的结果
            String result = in.readLine();
            System.out.println(result);

            // 6、关闭资源
            fis.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
