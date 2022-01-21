package com.company.start.hw2;

import java.util.Scanner;

public class DetermineYear {

    public static void main(String[] args) {
        int inputYear;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input year");
        inputYear = scanner.nextInt();
        if (inputYear % 4 == 0 &&
                ((inputYear % 100 != 0) || (inputYear % 400 == 0))
        ) {
            System.out.println("This is the leap year!");
        } else {
            System.out.println("This is not a leap year ");
        }
    }
}
