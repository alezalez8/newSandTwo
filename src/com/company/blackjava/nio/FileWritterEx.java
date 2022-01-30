package com.company.blackjava.nio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно!\n" +
                "Вот последняя правда, открытая мной.\n";

        String s = "privet\n";

        File file = new File("C:\\Users\\Администратор\\Desktop" +
        "\\test2.txt");
        System.out.println(file.getFreeSpace());

        FileWriter writer = null;
        try {
            writer = new FileWriter(file, true);
          //  for (int i = 0; i < rubai.length(); i++) {
              //  writer.write(rubai.charAt(i));
                writer.write(rubai);
              // writer.write(s);
          //  }
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
        System.out.println(file.getFreeSpace());


    }
}
// C:\Users\Администратор\Desktop\test1.txt