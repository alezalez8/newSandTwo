package com.company.start.hw3;

import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args) {
        int clockWidth;
        int lengthOfStars;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input width of hourglass (number must be odd");
        clockWidth = scanner.nextInt();
        scanner.close();

        if ((clockWidth & 1) == 1) {
            for (int i = 0; i < clockWidth; i++) {

                if (i > clockWidth / 2) {
                    lengthOfStars = clockWidth - i - 1;
                } else {
                    lengthOfStars = i;
                }

                for (int j = 0; j < clockWidth; j++) {
                    if (j >= lengthOfStars && j < (clockWidth - lengthOfStars)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Your don't input odd number, try again");
        }
    }
}
