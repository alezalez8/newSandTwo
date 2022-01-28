package com.company.start.hw3;

import java.util.Scanner;

public class FigureOneCycle {
    public static void main(String[] args) {
        int figureHeight;
        int numberOfStars = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input height of figure");
        figureHeight = sc.nextInt();
        //figureHeight = 3;
        sc.close();

        for (int i = 1; i <= figureHeight; i++) {
            System.out.print("*");
            if (i == numberOfStars
            && numberOfStars < figureHeight) {
                System.out.println();
                i = 0;
                numberOfStars++;
            }
            if (i == figureHeight) {
                System.out.println();
                figureHeight--;
                i = 0;
            }
        }
    }
}
