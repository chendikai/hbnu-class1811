package com.dingli.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 聊天程序接收端线程
 *
 * @author 陈迪凯
 * @date 2020-11-04 8:59
 */
public class ReceiveThread implements Runnable {
    private DatagramSocket datagramSocket;

    public ReceiveThread(DatagramSocket datagramSocket) {
        this.datagramSocket = datagramSocket;
    }

    @Override
    public void run() {
        try {
            while (true) {
                byte[] buf = new byte[1024 * 1024];
                DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);

                datagramSocket.receive(datagramPacket);

                String ip = datagramPacket.getAddress().getHostAddress(); // 获取发送端ip
                String data = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
                System.out.println(ip + ">>>" + data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            datagramSocket.close();
        }
    }
}
