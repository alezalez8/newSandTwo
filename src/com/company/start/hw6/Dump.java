package com.company.start.hw6;

import java.util.Scanner;

public class Dump {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String money;
        String tempM[];
        int dLeft[];
        int cRight[];
        String[] measureMoney = new String[] { "", "cents", "cents" };

        do {
            try {

                System.out.println("How much money do you have?");
                money = scan.nextLine();
                tempM = money.split("[,.]");
                dLeft = strToIntDig(tempM[0]);

                if (tempM.length == 1) {
                    cRight = new int[] {};
                } else if (tempM[1].length() == 1) {
                    cRight = strToIntDig(tempM[1] + "0");
                } else {
                    cRight = strToIntDig(tempM[1]);
                }

                System.out.print("You have: " + revStrByWords(digsToStrMoney(dLeft)) + "dollars ");
                System.out.println(revStrByWords(digsToStrMoney(cRight)) + measureMoney[cRight.length]);

            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("You've entered the amount of money incorrectly,"
                        + " it should be a number up to a billion!");
            }
        } while (repeat());

    }

    /*
     * Based on a string, returns an inverted integer array of elements based on
     * the numeric representation of the characters in the string.
     */
    public static int[] strToIntDig(String num) {
        int[] arr = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            arr[i] = Character.digit(num.charAt(num.length() - i - 1), 10);
        }
        return arr;
    }

    /*
     * Based on a 9-bit number, divided bit by bit into an integer array,
     * returns the value of the elements (digits) in words
     */
    public static String digsToStrMoney(int[] ind) {
        String[] digits = new String[] { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] teensNum = new String[] { "", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen" };
        String[] dozens = new String[] { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
                "ninety" };
        String[] digNum = new String[] { "hundred", "", "" };
        String[] monNum = new String[] { "", "", "", "thousand", "", "", "million", "", "" };

        String str = "";
        String dozOrNot = digits[0];

        for (int i = 0; i < ind.length; i++) {

            switch ((i + 1) % 3) {
                case 1:
                    if ((ind.length == 1 || ind.length == 4 || ind.length == 7) && i == ind.length - 1) {
                        dozOrNot = digits[ind[i]];
                    } else {
                        dozOrNot = ((i + 1 + 1) % 3 == 2 && ind[i + 1] == 1) ? teensNum[ind[i]]
                                : digits[ind[i]] + " " + dozens[ind[i + 1]];
                    }
                    break;
                case 2:
                    dozOrNot = "";
                    break;
                case 0:
                    dozOrNot = digits[ind[i]];
                    break;
            }

            if (ind.length <= 3) {
                str += digNum[(i + 1) % 3] + " " + dozOrNot;
            } else if (3 < ind.length && ind.length <= 9) {
                if (ind[i] == 0) {
                    str += " " + monNum[i] + " " + dozOrNot;
                } else {
                    str += " " + monNum[i] + " " + digNum[(i + 1) % 3] + " " + dozOrNot;
                }
            }

        }

        return str;
    }

    /* Returns word reverse line  */

    public static String revStrByWords(String orig) {
        String[] str = orig.split(" +");
        for (int i = 0; i < str.length / 2; i++) {
            String s = str[i];
            str[i] = str[str.length - 1 - i];
            str[str.length - 1 - i] = s;
        }
        return String.join(" ", str);
    }

    public static boolean repeat() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Do you want to try again? Y/N");
        char ans = scan.nextLine().charAt(0);
        return (ans == 'Y' || ans == 'y' || ans == 'Н' || ans == 'н');
    }
}
