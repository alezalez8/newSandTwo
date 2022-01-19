package com.company.start.hw1;

import java.util.Scanner;

public class NumberDivider {

    public static void main(String[] args) {
        int boundLow = 9999;
        int boundHigh = 99999;
        int currentDigital;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input five-digit number");
        int number = scanner.nextInt();
        if (boundLow < number && number <= boundHigh) {
            currentDigital = number / 10000;
            System.out.println(currentDigital);
            currentDigital = number % 10000 / 1000;
            System.out.println(currentDigital);
            currentDigital = number % 1000 / 100;
            System.out.println(currentDigital);
            currentDigital = number % 100 / 10;
            System.out.println(currentDigital);
            currentDigital = number % 10;
            System.out.println(currentDigital);
        } else {
            System.out.println("Sorry, you input wrong number");
        }

    }
}




