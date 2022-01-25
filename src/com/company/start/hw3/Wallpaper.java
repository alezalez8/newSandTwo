package com.company.start.hw3;

import java.util.Scanner;

public class Wallpaper {
    public static void main(String[] args) {
        int numberOfColumns;
        int numerOfLines = 5;
        String stars = "***";
        String plus = "+++";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input  amount of columns");
        numberOfColumns = scanner.nextInt();

        if (numberOfColumns > 0) {
            for (int i = 0; i < numerOfLines; i++) {
                for (int j = 0; j < numberOfColumns; j++) {
                    if ((j & 1) != 0) {
                        System.out.print(plus);
                    } else {
                        System.out.print(stars);
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("You entered wrong number");
        }

    }
}
