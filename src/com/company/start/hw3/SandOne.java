package com.company.start.hw3;

public class SandOne {
    public static void main(String[] args) {


        int high = 3;
        int countStars = 1;
        boolean direction = true;
        int temp = 1;


        for (int i = 1; i <= high; i++) {

            if (i == high) {
                direction = false;
              // countStars = high - 2;
               // i = 0;
              //  System.out.println();
            }
            System.out.print("*");
//----------------------------------------------
            if (i == countStars && direction) {
                System.out.println();
                i = 0;
                countStars++;
            }

//-----------------------------------------------

            if (!direction) {

                if (i == countStars ) {
                    System.out.println();
                   // countStars--;
                    i= 0;

                   // countStars--;
                }

                // countStars = 5;
                // i = 5;


            }


        }
    }
}
