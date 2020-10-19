package com.dingli.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {
    public static void main(String[] args) {
        Heroes heroes = new Heroes("铠", 18);
        try {
            // 序列化
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("out.txt"));
            objectOutputStream.writeObject(heroes);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // 反序列化
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("out.txt"));
            Heroes heroes1 = (Heroes) objectInputStream.readObject();
            System.out.println(heroes1.getName() + ": " + heroes1.getAge());
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
