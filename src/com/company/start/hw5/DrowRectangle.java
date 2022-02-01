package com.company.start.hw5;

import java.util.Scanner;

public class DrowRectangle {

    public static void main(String[] args) {
        int length;
        int heigth;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter heigth of rectangle ");
        heigth = scanner.nextInt();
        System.out.println("Enter length of rectangle ");
        length = scanner.nextInt();
        scanner.close();

        drowRectangle(length, heigth);
    }

    public static void drowRectangle(int length, int heigth) {
        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0 || i == heigth - 1
                        || j == 0 || j == length - 1) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }

}
