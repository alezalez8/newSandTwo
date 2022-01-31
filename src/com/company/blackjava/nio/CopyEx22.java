package com.company.blackjava.nio;

import java.io.*;

public class CopyEx22 {
    public static void main(String[] args) throws IOException {
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\Администратор\\Desktop" +
                "\\турция аватар1.jpg"));

                BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Администратор\\Desktop" +
                        "\\pic2.jpg")))
        {
            int temp;
            while ((temp = inputStream.read()) != -1) {

                outputStream.write(temp);

            }


        }
}
}
