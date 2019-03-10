package test;

import seriable.Seriable;

import java.io.*;

/**
 * 序列化破坏单例
 *
 */
public class SerianleTest {
    public static void main(String[] args) {
        Seriable seriable =null;
        Seriable seriable11 = Seriable.getInstance();
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream =new FileOutputStream("seriable.obj");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(seriable11);
            objectOutputStream.flush();
            objectOutputStream.close();
            FileInputStream fileInputStream = new FileInputStream("seriable.obj");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            seriable = (Seriable) objectInputStream.readObject();
            System.out.println(seriable == seriable11);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
