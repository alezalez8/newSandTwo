package com.company.start.hw2;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        int xA = 0;
        int yA = 0;
        int xB = 4;
        int yB = 4;
        int xC = 6;
        int yC = 1;
        int xP;
        int yP;
        int resA;
        int resB;
        int resC;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input X: ");
        xP = scanner.nextInt();
        System.out.println("Please input Y: ");
        yP = scanner.nextInt();

        // https://abakbot.ru/online-2/280-pointreug

        resA = (xA - xP) * (yB - yA) - (xB - xA) * (yA - yP);
        resB = (xB - xP) * (yC - yB) - (xC - xB) * (yB - yP);
        resC = (xC - xP) * (yA - yC) - (xA - xC) * (yC - yP);


        if ((resA < 0 && resB < 0 && resC < 0) ||
                (resA > 0 && resB > 0 && resC > 0)) {
            System.out.println("This point is belongs to this triangle");
        } else {
            System.out.println("This point is outside of this triangle");
        }

    }

}
