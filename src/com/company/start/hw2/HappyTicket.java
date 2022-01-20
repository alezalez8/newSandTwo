package com.company.start.hw2;

import java.util.Scanner;

public class HappyTicket {

    public static void main(String[] args) {
        int[] array = new int[4];
        String inputNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input for-digit number");
        inputNumber = scanner.nextLine();
        String[] k = inputNumber.split("");

        if ((Integer.parseInt(k[0]) + Integer.parseInt(k[1])) ==
                (Integer.parseInt(k[2]) + Integer.parseInt(k[3]))) {
            System.out.println("Ticket is happy!");
        } else {
            System.out.println("Ticket is not happy!");
        }


    }
}
