package com.company.start.hw3;

import java.util.Scanner;

public class EmptyRectangle {
    public static void main(String[] args) {

        int high;
        int length;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input high of rectangle");
        high = scanner.nextInt();
        System.out.println("Please input length of rectangle");
        length = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < high; i++) {
            for (int j = 1; j <= length; j++) {
                if (i == 0 || i == high - 1
                        || j == 1 || j == length) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
