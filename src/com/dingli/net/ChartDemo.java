package com.dingli.net;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 聊天室程序
 *
 * @author 陈迪凯
 * @date 2020-11-04 9:03
 */
public class ChartDemo {
    public static void main(String[] args) {
        try {
            DatagramSocket sendSocket = new DatagramSocket();
            DatagramSocket receiveSocket = new DatagramSocket(8888);

            new Thread(new SendThread(sendSocket)).start();
            new Thread(new ReceiveThread(receiveSocket)).start();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
