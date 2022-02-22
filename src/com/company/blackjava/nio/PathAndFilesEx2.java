package com.company.blackjava.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesEx2 {
    public static void main(String[] args) {
        Path filePath = Paths.get("text10.txt");
        Path directoryPath = Paths.get("C:\\Users\\Администратор\\Desktop\\M");
        Path directoryAPath = Paths.get("C:\\Users\\Администратор\\Desktop\\A");

        try {
          //  Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
          //  Files.copy(filePath, directoryPath.resolve("test16.txt"), StandardCopyOption.REPLACE_EXISTING);
          //  Files.copy(directoryAPath, directoryPath.resolve("A"));
          //  Files.move(filePath, directoryPath.resolve("test15.txt"));
          //  Files.move(directoryPath.resolve(filePath), filePath);
           // Files.move(filePath, filePath.resolve("test100.txt"));
          //  Files.move(Paths.get("text10.txt"), Paths.get("text100.txt"));
          //  Files.delete(Paths.get("test5.txt"));
            Files.delete(directoryAPath);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
