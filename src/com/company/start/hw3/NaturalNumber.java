package com.company.start.hw3;

public class NaturalNumber {
    public static void main(String[] args) {
        int number = 100;

        System.out.println("List of simple numbers:");
        for (int i = 2; i <= number; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    if (i == j) {
                        System.out.print(i + "  ");
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
