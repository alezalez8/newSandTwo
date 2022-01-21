package com.company.start.hw2;

import java.util.Scanner;

public class HappyTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input for-digit number");

        // ------------------ решение в "лоб"

        int happyNumber = scanner.nextInt();
        int numbOne = happyNumber / 1000;
        int numbTwo = happyNumber % 1000 / 100;
        int numbThree = happyNumber % 100 / 10;
        int numbFour = happyNumber % 10;

        if (numbOne + numbTwo == numbThree + numbFour) {
            System.out.println("Ticket is happy!");
        } else {
            System.out.println("Ticket is not happy!");
        }
        // --------------- конец данного решения

        /* ---------------- более красивое решение, как для меня :)
         ------------------ для проверки расскомитить блок снизу   и закоммитить
          блок сверху, начиная к комента "решение в "лоб" --------------------
          */


        /*
        int[] array = new int[4];
        String inputNumber;

        inputNumber = scanner.nextLine();
        String[] k = inputNumber.split("");

        if ((Integer.parseInt(k[0]) + Integer.parseInt(k[1])) ==
                (Integer.parseInt(k[2]) + Integer.parseInt(k[3]))) {
            System.out.println("Ticket is happy!");
        } else {
            System.out.println("Ticket is not happy!");
        }
*/

    }
}


