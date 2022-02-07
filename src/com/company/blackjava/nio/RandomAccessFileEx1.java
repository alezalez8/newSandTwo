package com.company.blackjava.nio;

import java.io.FileNotFoundException;
import java.io.IOException;

public class RandomAccessFileEx1 {
    public static void main(String[] args) {
        try (java.io.RandomAccessFile file
                     = new java.io.RandomAccessFile("text10.txt", "rw")) {

           /* int a = file.read();
            System.out.print((char)a);
            String s1 = file.readLine();
            System.out.println(s1);


            file.seek(101);
            s1 = file.readLine();
            System.out.println(s1);
            System.out.println(file.getFilePointer());
            file.seek(0);
            file.writeBytes("Hello");
            file.seek(0);
            s1 = file.readLine();
            System.out.println(s1);*/

            file.seek(file.length() - 1);
            System.out.println(file.getFilePointer());
            file.writeBytes("\n\t\t\t\t\tWilliam Buttler Yeats   ");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
