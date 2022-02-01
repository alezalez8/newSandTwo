package com.company.start.hw4;

import java.util.Scanner;

public class NumberToStringMoneyConverter {
    public static void main(String[] args) {
        String hundr = " hundred ";
        String thousand = " thousand ";
        String million = " million ";
        String dollars = " dollar(s) ";
        String cents = " cent(s)";
        String outNumber = "";
        String outNumbreFract = "";
        int sizeOfWholeNumber;
        int sizeOfWholeNumberTriad;
        String[] wholeNumber;
        String[] fractionalNumber;
        String[] wholeNumberofTriad;

        String[] unitsNumbers = {"", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine"};
        String[] tenNinethNumbers = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] dozenNumbers = {"", "", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you have?");
        String inputNumber = scanner.nextLine();
        scanner.close();
// ------------------------разложили на два массива стрингов до и после запятой с проверкой существования дробной части
        String[] arrayNumber = inputNumber.split("[,.]");
        wholeNumber = arrayNumber[0].split("");
        sizeOfWholeNumber = wholeNumber.length;
        if (arrayNumber.length > 1) {
            fractionalNumber = arrayNumber[1].split("");
        } else {
            fractionalNumber = null;
        }

// -----------------------  дополняем основной массив до кол-ва, кратное 3:
        if (sizeOfWholeNumber % 3 != 0) {
            sizeOfWholeNumberTriad = sizeOfWholeNumber + 3 - sizeOfWholeNumber % 3;
            wholeNumberofTriad = new String[sizeOfWholeNumberTriad];
            System.arraycopy(wholeNumber, 0, wholeNumberofTriad,
                    (sizeOfWholeNumberTriad - sizeOfWholeNumber), wholeNumber.length);
        } else {
            wholeNumberofTriad = wholeNumber;
            sizeOfWholeNumberTriad = wholeNumber.length;
        }

        int temp = sizeOfWholeNumberTriad;
        for (int i = 0; i < sizeOfWholeNumberTriad; i += 3) {
            if (wholeNumberofTriad[i] != null && Integer.parseInt(wholeNumberofTriad[i]) > 0) {
                outNumber += (unitsNumbers[Integer.parseInt(wholeNumberofTriad[i])] + hundr);
            }
            if (wholeNumberofTriad[i + 1] != null && Integer.parseInt(wholeNumberofTriad[i + 1]) == 1) {
                outNumber = outNumber + tenNinethNumbers[Integer.parseInt(wholeNumberofTriad[i + 2])] + " ";
            } else {
                if (wholeNumberofTriad[i + 1] != null) {
                    outNumber = outNumber + dozenNumbers[Integer.parseInt(wholeNumberofTriad[i + 1])] +
                            " " + unitsNumbers[Integer.parseInt(wholeNumberofTriad[i + 2])];
                } else {
                    outNumber = outNumber + unitsNumbers[Integer.parseInt(wholeNumberofTriad[i + 2])];
                }
            }
            if (temp == 9) {
                outNumber = outNumber + million;
            }
            if (temp == 6) {
                outNumber = outNumber + thousand;
            }
            temp -= 3;
        }

        if (fractionalNumber != null) {

            if (fractionalNumber.length == 2) {
                if (Integer.parseInt(fractionalNumber[0]) == 1) {
                    outNumbreFract = tenNinethNumbers[Integer.parseInt(fractionalNumber[1])];
                } else if (fractionalNumber[0] != null) {
                    outNumbreFract = dozenNumbers[Integer.parseInt(fractionalNumber[0])] +
                            " " + unitsNumbers[Integer.parseInt(fractionalNumber[1])];
                } else {
                    outNumbreFract = unitsNumbers[Integer.parseInt(fractionalNumber[1])];
                }
            } else {
                if (fractionalNumber.length == 1) {
                    if (Integer.parseInt(fractionalNumber[0]) == 1) {
                        outNumbreFract = tenNinethNumbers[0];
                    } else {
                        outNumbreFract = dozenNumbers[Integer.parseInt(fractionalNumber[0])];
                    }
                }
            }
        }
        if (outNumber.length() != 0) {
            outNumber += dollars;
        }

        System.out.println("You have : " + outNumber + outNumbreFract + cents);
    }
}
