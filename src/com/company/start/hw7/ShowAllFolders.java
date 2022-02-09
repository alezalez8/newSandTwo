package com.company.start.hw7;

import java.io.File;
import java.util.Scanner;

public class ShowAllFolders {

    public static void main(String[] args) {

        showFolders(getPath());

    }

    public static String getPath() {
        String path;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path of directory");
        path = scanner.nextLine();
        scanner.close();
        return path;
    }

    public static void showFolders(String path) {

        File file = new File(path);

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    System.out.println(files[i].getName());
                }
            }
        } else {
            System.out.println("This is not a directory");
        }

    }
}
