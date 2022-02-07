package com.company.blackjava.nio;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("test2.txt");
        File folder = new File("C:\\Users\\Администратор\\Desktop\\A");
        File folder2 = new File("C:\\Users\\Администратор\\Desktop\\A\\test20.txt");
        //System.out.println(folder.getAbsolutePath());
        System.out.println("-----------------------------------");
       // System.out.println(file.isAbsolute());
       // System.out.println(folder2.exists());
       // System.out.println(folder.mkdir());
       // System.out.println(folder2.createNewFile());
       // System.out.println(folder2.exists());
       // System.out.println(folder2.length());
       // System.out.println(folder.length());
       // System.out.println(folder2.delete());
       // System.out.println(folder.delete());
        System.out.println(Arrays.toString(folder.listFiles()));
        System.out.println("-----------------------------------");
        File[] files = folder.listFiles();
       // System.out.println(Arrays.toString(files));
        System.out.println(folder2.isHidden());
        System.out.println(folder2.canRead());
        System.out.println(folder2.canWrite());
        System.out.println(folder2.canExecute());





    }
}
