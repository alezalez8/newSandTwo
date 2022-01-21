package com.company.start.hw2;

import java.util.Scanner;

public class NineFlatHome {
    public static void main(String[] args) {
        int entrance = 4;
        int flat = 9;
        int roomOnFlat = 4;
        int accountApartInEntrance;
        int inputApartment;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number of apartment");
        inputApartment = scanner.nextInt();
        if (0 < inputApartment && inputApartment <= 144) {

            accountApartInEntrance = roomOnFlat * flat;

            System.out.printf("Apartment is in %d entrance and on the %d floor",
                    (inputApartment - 1) / (accountApartInEntrance) + 1,
                    (inputApartment - 1) % (accountApartInEntrance) / roomOnFlat + 1);

        } else {
            System.out.println("You input wrong number of apartment");
        }

    }
}
