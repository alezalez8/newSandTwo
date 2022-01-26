package com.company.start.hw3;

import java.util.Scanner;

public class FigureOneCycle {
    public static void main(String[] args) {
        int high = 5;
        int countStars = 1;
        boolean direction = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input high of figure");
        //high = scanner.nextInt();
        scanner.close();
/*
        for (int i = 0; i <= high; i++) {
            if (countStars <= i && direction) {
                i = 0;
                countStars++;
                System.out.println();
            } else {
                System.out.print("*");
            }
*/
        for (int i = 1; i <= high; i++) {
            if(i == high) {
                direction = false;
            }
            if (direction) {
                if (i <= countStars) {
                    System.out.print("*");
                } else {
                    i = 0;
                    countStars++;
                    System.out.println();
                    if(i == high-1) {
                        direction = false;
                    }
                }

                if(!direction){
                    System.out.println();
                    i = 0;
                    high--;

                }
            } else {
              /*  System.out.println();
                i = 0;
                high--;*/
            }
        }






/*
            if (i == high) {
                System.out.println();
                i = 0;
                high--;
            }
            if (!direction) {
                System.out.print("*");
            }
*/


    }
}
/*
*  for (int i = 1; i <= high; i++) {
            if (countStars <= i && direction) {
                i = 0;
                countStars++;
                System.out.println();
            } else {
                System.out.print("*");
            }
* */
