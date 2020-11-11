package com.dingli.net;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author 陈迪凯
 * @date 2020-11-11 8:57
 */
public class UrlDemo {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://127.0.0.1:8080/hellword/index.jsp?username=chendikai&password=123456");

            System.out.println(url.getProtocol()); // 协议
            System.out.println(url.getHost()); // 主机ip地址
            System.out.println(url.getPort()); // 主机端口
            System.out.println(url.getPath()); // 资源文件
            System.out.println(url.getFile()); // 全路径
            System.out.println(url.getQuery()); // 参数
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
