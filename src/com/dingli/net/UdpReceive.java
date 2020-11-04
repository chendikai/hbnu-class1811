package com.dingli.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author 陈迪凯
 * @date 2020-11-03 9:24
 */
public class UdpReceive {
    public static void main(String[] args) {
        DatagramSocket datagramSocket = null;
        try {
            datagramSocket = new DatagramSocket(9999);

            while (true) {
                byte[] bytes = new byte[1024];
                DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);

                datagramSocket.receive(datagramPacket);

                System.out.println(datagramPacket.getAddress().getHostAddress());
                System.out.println(datagramPacket.getAddress().getHostName());
                System.out.println(new String(datagramPacket.getData(), 0, datagramPacket.getLength()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
