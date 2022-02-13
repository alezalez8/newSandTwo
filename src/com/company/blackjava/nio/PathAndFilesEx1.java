package com.company.blackjava.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathAndFilesEx1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test115.txt");
        Path directoryPath = Paths.get("C:\\Users\\Администратор\\Desktop\\M");

        System.out.println("filePath.getFileName()  " + filePath.getFileName());
        System.out.println("directoryPath.getFileName()  " + directoryPath.getFileName());
        System.out.println("-------------------------------------");
        System.out.println("filePath.getParent()  " + filePath.getParent());
        System.out.println("directoryPath.getParent()  " + directoryPath.getParent());
        System.out.println("-------------------------------------");
        System.out.println("filePath.getParent()  " + filePath.isAbsolute());
        System.out.println("directoryPath.getParent()  " + directoryPath.isAbsolute());
        System.out.println("-------------------------------------");
        System.out.println("filePath.getParent()  " + filePath.toAbsolutePath().getParent());
        System.out.println("directoryPath.getParent()  " + directoryPath.toAbsolutePath().getParent());
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("directoryPath.resolve(filePath)" + directoryPath.resolve(filePath));

        Path anotherPath = Paths.get("C:\\Users\\Администратор\\Desktop\\A\\Z\\test4.txt");
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("directoryPath.relativize(anotherPath)   " + directoryPath.relativize(anotherPath));
        Path anotherPathTwo = Paths.get("C:\\Users\\Администратор\\Desktop\\A\\Z\\test4.txt");
        System.out.println(Files.isSameFile(anotherPath, anotherPathTwo));
        System.out.println(Files.size(anotherPathTwo));

       // System.out.println(Files.readAttributes(filePath, "*"));
        Map<String, Object> map = Files.readAttributes(filePath, "*");
        for (Map.Entry<String, Object>  element : map.entrySet()) {
            System.out.println(element.getKey() + "   " + element.getValue());
        }

    }
}
