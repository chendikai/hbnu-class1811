package com.dingli.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 建立一个文本转换服务器，客户端给服务端发送文本数据，
 * 服务端收到数据后将文本转为大写返回给客户端，
 * 客户端可以不断输入文本数据，当客户端输入over时，转换结束
 *
 * @author 陈迪凯
 * @date 2020-11-06 17:12
 */
public class TcpClient03 {
    public static void main(String[] args) {
        try {
            // 1、创建socket服务，并指定服务端的ip和端口port
            Socket socket = new Socket("127.0.0.1", 6666);

            // 2、获取流
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); // 用于获取从键盘录入的数据
            // BufferedWriter bufferedOut = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // 用于向服务端发送数据
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader bufferedIn = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 用于获取服务端返回的数据

            // 3、获取从键盘录入的数据，并发送给服务端
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if ("over".equalsIgnoreCase(line)) {
                    break;
                }
                // 4、向服务端发送数据
                // bufferedOut.write(line);
                // bufferedOut.newLine();
                // bufferedOut.flush(); // 刷新缓冲区，刷新后数据会发送出去
                printWriter.println(line);

                // 5、接收服务端返回的数据
                String result = bufferedIn.readLine();
                System.out.println("服务端返回的数据：" + result);
            }

            // 6、关闭资源
            bufferedReader.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
