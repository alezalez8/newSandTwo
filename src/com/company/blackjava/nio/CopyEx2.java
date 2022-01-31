package com.company.blackjava.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx2 {
    public static void main(String[] args) {
        try {
            try (FileInputStream inputStream = new FileInputStream("C:\\Users\\Администратор\\Desktop" +
                    "\\турция аватар1.jpg");
              //   BufferedInputStream inputStream1 = new BufferedInputStream(inputStream);
                FileOutputStream outputStream=new FileOutputStream("C:\\Users\\Администратор\\Desktop"+
                         "\\pic.jpg")) {

                int i;
                while ((i = inputStream.read()) != -1) {
                    outputStream.write(i);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
//"C:\\Users\\Администратор\\Desktop" +
//                        "\\турция аватар1.jpg"