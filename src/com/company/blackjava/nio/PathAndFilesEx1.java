package com.company.blackjava.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesEx1 {
    public static void main(String[] args) {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\Администратор\\Desktop\\M");

        System.out.println("filePath.getFileName()  " + filePath.getFileName());
        System.out.println("directoryPath.getFileName()  " + directoryPath.getFileName());
        System.out.println("-------------------------------------");
        System.out.println("filePath.getParent()  " + filePath.getParent());
        System.out.println("directoryPath.getParent()  " + directoryPath.getParent());
        System.out.println("-------------------------------------");


    }
}
