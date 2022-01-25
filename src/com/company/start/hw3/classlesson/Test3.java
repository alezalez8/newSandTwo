package com.company.start.hw3.classlesson;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int star;
        int lines;
        int temp = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input  amount of stars");
        star = scanner.nextInt();


        for (int i = 0; i < star; i++) {
            for (int j = 1; j < star - i; j++) {
                System.out.print(" ");
            }
            for (int k = star + 1; k > star - i; k--) {
                System.out.print("*");
            }
            System.out.println();

        }


    }
}

