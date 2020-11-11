package com.dingli.net;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author 陈迪凯
 * @date 2020-11-11 9:04
 */
public class UrlDownload {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://m801.music.126.net/20201111093648/93d98e3af475417aca35d213dd765f38/jdyyaac/obj/w5rDlsOJwrLDjj7CmsOj/4719706484/e0bb/bdbf/f021/e2c648aff66d526df5628c48eb0c4e65.m4a");

            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

            InputStream in = urlConnection.getInputStream();

            FileOutputStream fos = new FileOutputStream("E:\\DingLi\\music.m4a");

            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = in.read(buf)) != -1) {
                fos.write(buf, 0, len);
            }

            fos.close();
            in.close();
            urlConnection.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
