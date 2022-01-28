package com.company.start.hw4;

import java.util.Scanner;

public class SumOfSymbols {
    public static void main(String[] args) {
        String stroka;
        int sumOfChar = 0;
        String[] stringsArray;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input line");
        stroka = scanner.nextLine();
        scanner.close();
        stringsArray = stroka.split("");

        for (String elem : stringsArray
        ) {
            if ("b".equals(elem)) {
                sumOfChar++;
            }
        }
        System.out.println("Amount of char 'b' is " + sumOfChar);

    }
}
