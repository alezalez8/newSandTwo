package com.company.start.hw2.classlesson;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        int entrance = 4;
        int flat = 9;
        int roomOnFlat = 4;
        int inputApartment;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number of apartment");
        inputApartment = scanner.nextInt();
        if (0 < inputApartment && inputApartment <= 144) {
            System.out.println(inputApartment % 36);

        } else {
            System.out.println("You input wrong number of apartment");
        }

    }
}
