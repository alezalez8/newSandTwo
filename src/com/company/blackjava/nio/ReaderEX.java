package com.company.blackjava.nio;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReaderEX {


    public static void main(String[] args) throws IOException {
        String rubai;
        FileReader fileReader = null;
        int[] chars = new int[200];

        fileReader = new FileReader("C:\\Users\\Администратор\\Desktop" +
                "\\test2.txt");
       //rubai = fileReader.getEncoding();

        try {
            for(int i = 0; i< 100; i++)
            chars[i] = fileReader.read();
           // fileReader.close();
        } finally {
            fileReader.close();
        }
        System.out.println(Arrays.toString(chars));

    }
}
