package com.dingli.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 聊天程序发送端线程
 *
 * @author 陈迪凯
 * @date 2020-11-04 8:53
 */
public class SendThread implements Runnable {
    private DatagramSocket datagramSocket;

    public SendThread(DatagramSocket datagramSocket) {
        this.datagramSocket = datagramSocket;
    }

    @Override
    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if ("886".equalsIgnoreCase(line)) {
                    break;
                }
                DatagramPacket datagramPacket = new DatagramPacket(line.getBytes(), line.getBytes().length,
                        InetAddress.getByName("192.168.8.255"), 8888);

                datagramSocket.send(datagramPacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            datagramSocket.close();
        }
    }
}
