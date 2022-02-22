package com.company.blackjava.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");
       /* Files.deleteIfExists(filePath);
        Files.createFile(filePath);
        String dialog = "-Privet\n-Privet\n-Kak dela?\n-Xorosho! Kak y tebya?" +
                "\n-Toje xorosho!";
        Files.write(filePath, dialog.getBytes());*/

        List<String> list =  Files.readAllLines(filePath);
        for (String s : list) {
            System.out.println(s);
        }


    }
}
