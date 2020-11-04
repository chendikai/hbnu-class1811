package com.dingli.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 从键盘输入数据
 *
 * @author 陈迪凯
 * @date 2020-11-04 8:18
 */
public class UdpSend02 {
    public static void main(String[] args) {
        DatagramSocket datagramSocket = null;
        try {
            // 1、创建udp socket 服务
            datagramSocket = new DatagramSocket();

            // 2、将数据封装到数据报包中
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            while ((line = buf.readLine()) != null) {
                if ("bye".equalsIgnoreCase(line)) {
                    break;
                }
                DatagramPacket datagramPacket = new DatagramPacket(line.getBytes(), line.length(),
                        InetAddress.getByName("127.0.0.1"), 9999);

                // 3、发送数据
                datagramSocket.send(datagramPacket);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            datagramSocket.close();
        }
    }
}
