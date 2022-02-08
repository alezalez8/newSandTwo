package com.company.start.hw7.lesson8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lesson8b {
    public static void main(String[] args) {

        String[] goods = new String[]{"Latte", "Americano", "Capuchino", "Tea", "Espresso"};
        int[] price = new int[]{15, 12, 20, 15, 14};
        int[] n = new int[]{200, 150, 250, 100, 220};
        File file = new File("report.csv");
        String del = ";";

        // saveReport(file, del, goods, price, n);

        System.out.println(loadStringFromFile(file));
       /* File file = new File("hello.txt");

        try {
            try (PrintWriter printWriter = new PrintWriter(file)) {

                printWriter.println("Hello world");

            }
        } catch (IOException e) {
            System.out.println("Ошибка вывода");;
        }*/
    }

    public static void saveReport(File file, String del, String[] goods,
                                  int[] price, int[] n) {
        try {
            try (PrintWriter printWriter = new PrintWriter(file)) {
                for (int i = 0; i < goods.length; i++) {
                    printWriter.println(goods[i] + del + price[i] + del + n[i]);
                }
            }
        } catch (IOException e) {
            System.out.println("Wrong files");
        }
    }

    public static String loadStringFromFile(File file) {
        String text = "";
        try {
            try (Scanner scanner = new Scanner(file)) {
                for (; scanner.hasNextLine(); ) {
                    text = text + scanner.nextLine() + System.lineSeparator();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Нет такого файла");
        }
        return text;
    }
}
