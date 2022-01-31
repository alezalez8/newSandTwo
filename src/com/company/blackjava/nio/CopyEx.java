package com.company.blackjava.nio;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("C:\\Users\\Администратор\\Desktop" +
                        "\\турция аватар1.jpg"));
             BufferedWriter writer = new BufferedWriter(
                     new FileWriter("C:\\Users\\Администратор\\Desktop" +
                             "\\pic.jpg"))) {
            /*
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
*/

            String stroka;
            while ((stroka = reader.readLine()) != null) {
                writer.write(stroka);
            }
            System.out.println("Done");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
/*
String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно!\n" +
                "Вот последняя правда, открытая мной.\n";
* */