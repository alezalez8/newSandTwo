package com.company.start.hw7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyNotePad {
    public static void main(String[] args) {
        // String path = "testPad.txt";

        enterText();


    }


    public static void enterText() {
        StringBuilder text = new StringBuilder("");
        String inputLine = "";
        boolean isEnd = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line and press enter.");
        System.out.println("For exit and save enter N or n and press enter");

        while (!isEnd) {
            inputLine = scanner.nextLine();
            if (inputLine.toLowerCase().equals("n")) {
                isEnd = true;
            } else {
                text.append(inputLine);
                text.append(System.lineSeparator());
            }
        }
        System.out.println("Enter name of file");
        inputLine = scanner.nextLine();
        scanner.close();

        saveNotePad(text.toString(), inputLine);

    }

    public static void saveNotePad(String text, String path) {
        File file = new File(path);
        try (PrintWriter writer = new PrintWriter(file)) {
            {
                writer.write(text);
                System.out.println("Done!");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Something was happened...  :(");
            System.out.println("Try again");
        }

    }
}
