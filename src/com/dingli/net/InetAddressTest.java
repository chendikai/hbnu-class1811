package com.dingli.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 陈迪凯
 * @date 2020-11-03 8:58
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("192.168.8.114");
//            System.out.println(InetAddress.getLocalHost().toString());
//            System.out.println(inetAddress.toString());

            System.out.println(inetAddress.getHostAddress());
            System.out.println(inetAddress.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
