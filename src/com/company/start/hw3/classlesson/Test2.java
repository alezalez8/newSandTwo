package com.company.start.hw3.classlesson;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int star;
        int lines;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input  amount of stars");
        star = scanner.nextInt();
        System.out.println("Please input  amount of lines");
        lines = scanner.nextInt();

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
