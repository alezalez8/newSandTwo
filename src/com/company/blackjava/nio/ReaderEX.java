package com.company.blackjava.nio;

import java.io.FileReader;
import java.io.IOException;

public class ReaderEX {


    public static void main(String[] args) throws IOException {
        String rubai;
        // FileReader fileReader = null;
        int[] chars = new int[200];

        try (FileReader fileReader = new FileReader("C:\\Users\\Администратор\\Desktop" +
                "\\test2.txt")) {

            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("Done");
        } /*catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
