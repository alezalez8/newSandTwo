package com.company.start.hw7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class MyNotePad {
    public static void main(String[] args) {
        String path = "testPad.txt";

        saveNotePad(enterText(), path);


    }


    public static String enterText() {
        StringBuilder text = new StringBuilder("");
        String inputLine = "";
        boolean isEnd = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line and press enter.");
        System.out.println("For exit from text enter N or n and press enter");

/*
        for (; scanner.hasNextLine(); ) {
            inputLine = scanner.nextLine();
            if (inputLine.toLowerCase().equals("n")) {
                text.append(inputLine);
                text.append(System.lineSeparator());
                System.out.println(text.toString());
            } else {
                break;
            }
        }
*/

        while (!isEnd) {

            inputLine = scanner.nextLine();
            if (inputLine.toLowerCase().equals("n")) {
                isEnd = true;
            } else {
                text.append(inputLine);
                text.append(System.lineSeparator());
            }
        }
        scanner.close();
        return text.toString();
    }


    public static void saveNotePad(String text, String path) {
        File file = new File(path);
        try (PrintWriter writer = new PrintWriter(file)) {
            {
            writer.write(text);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
