package com.company.start.hw5.lesson6;

public class Sand {
    public static void main(String[] args) {
        String origPal;
        StringBuilder revPal;

        for (int i = 999; i >= 900; i--) {
            for (int j = i; j >= 900; j--) {

                origPal = Integer.toString(i * j);
                revPal = new StringBuilder(origPal).reverse();
                if (origPal.equals(revPal.toString())) {
                    System.out.print("First 3-digits number = " + i+"; ");
                    System.out.println("Second 3-digits number = " + j);
                    System.out.println("The maximum palindrome from product of 3 digits numbers is: " + i * j);

                    return;
                }

            }
        }
    }
}
