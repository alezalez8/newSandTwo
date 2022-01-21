package com.company.start.hw2;

import java.util.Scanner;

public class TrianglePresent {


    public static void main(String[] args) {
        int sideA;
        int sideB;
        int sideC;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input length of side A");
        sideA = scanner.nextInt();
        System.out.println("Input length of side B");
        sideB = scanner.nextInt();
        System.out.println("Input length of side C");
        sideC = scanner.nextInt();

        if (sideA + sideB > sideC
                && sideA + sideC > sideB
                && sideB + sideC > sideA) {
            System.out.println("This triangle is valid");
        } else {
            System.out.println("This triangle is not valid");
        }

    }


}
