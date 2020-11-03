package com.dingli.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author 陈迪凯
 * @date 2020-11-03 9:12
 */
public class UdpSend {
    public static void main(String[] args) {
        DatagramSocket datagramSocket = null;
        try {
            // 端口范围0-65536，0-1024这些端口有特殊用途，不建议使用这些端口
            datagramSocket = new DatagramSocket(8888);

            // DatagramPacket(byte[] buf, int length, InetAddress address, int port)
            byte[] bufr = "Jixin 1811".getBytes();
            DatagramPacket datagramPacket = new DatagramPacket(bufr, bufr.length, InetAddress.getByName("127.0.0.1"), 9999);

            datagramSocket.send(datagramPacket);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (datagramSocket != null) {
                datagramSocket.close();
            }

        }
    }
}
