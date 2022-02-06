package com.company.start.hw6;

import java.util.Scanner;

public class BinaryCalculator {
    public static void main(String[] args) {
        int binary;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter binary number");
        binary = scanner.nextInt(2);
        scanner.close();
        System.out.println("Dec value is: " + binary);
    }
}
