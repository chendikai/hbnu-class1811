package com.dingli.net;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author 陈迪凯
 * @date 2020-11-11 8:18
 */
public class TcpServer08Thread implements Runnable {
    private Socket socket;

    public TcpServer08Thread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                // 3、获取流对象
                // 获取socket输入流，用于接收客户端发送过来的数据
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                // 获取文件输入流，用于获取文件中的用户名
                BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\DingLi\\user.txt"));
                // 获取socket输出流，用于向客户端反馈结果
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                // 4、从文件中读数据，并进行校验
                String username = in.readLine(); // 获取客户端发送过来的用户名

                if (username == null) {
                    break;
                }
                // 5、校验用户名
                String line = null;
                boolean flag = false;
                while ((line = bufferedReader.readLine()) != null) {
                    if (line.equals(username))  {
                        // 校验成功
                        flag = true;
                        break;
                    }
                }

                if (flag) {
                    System.out.println("欢迎" + username + "成功登录本系统");
                    out.println("欢迎" + username + "成功登录本系统");
                    break;
                } else {
                    System.out.println("用户" + username + "正在尝试登陆本系统");
                    out.println("登陆失败");
                }
                bufferedReader.close();
            }
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
