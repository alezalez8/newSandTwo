package com.company.start.hw2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        double radius = 4d;
        int x;
        int y;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x");
        x = scanner.nextInt();
        System.out.println("Input y");
        y = scanner.nextInt();

        if (Math.sqrt(x * x + y * y) <= radius) {
            System.out.println("Point with coord x = " + x + ", y = " + y
                    + " is insdide circle");
        } else {
            System.out.println("Point with coord x = " + x + ", y = " + y
                    + " is outsdide circle");
        }
    }

}
