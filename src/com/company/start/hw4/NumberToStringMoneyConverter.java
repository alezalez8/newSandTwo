package com.company.start.hw4;

import java.util.Scanner;

public class NumberToStringMoneyConverter {

    public static void main(String[] args) {
        int number;
        int[] arrayNumbers;
        int[] arrayNumbers2;
        char[] chWholeNumber;
        char[] chFractionalNumber;
        String hundr = " hundred ";
        String thousand = " thousand ";
        String million = " million ";
        String dollars = " dollar(s)";
        String[] wholeNumberofTriad = null;
        int sizeOfWholeNumberTriad = 0;
        String[] wholeNumber;
        String[] fractionalNumber;
        int sizeOfWholeNumber = 0;


        String[] unitsNumbers = {"", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine"};
        String[] tenNinethNumbers = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] dozenNumbers = {"", "", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"};


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        //String inputNumber = scanner.nextLine();
        scanner.close();

        String inputNumber = "123457890.45";


// ------------------------разложили на два массива стрингов до и после запятой с проверкой существования дробной части
        String[] arrayNumber = inputNumber.split("[,.]");
        wholeNumber = arrayNumber[0].split("");
        sizeOfWholeNumber = wholeNumber.length;
        if (arrayNumber.length > 1) {
            fractionalNumber = arrayNumber[1].split("");
        } else {
            fractionalNumber = null;
        }
// ----------------------конец блока
        System.out.println(inputNumber);
        //System.out.println("Whole part is " + Arrays.toString(wholeNumber));
        // System.out.println("Fractional part is " + Arrays.toString(fractionalNumber));
        System.out.println();

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

        //  ---------------- конец блока дополнения массива до числа, кратного трем

        //  System.out.println("Array added 3:  " + Arrays.toString(wholeNumberofTriad));
/*
        List<Integer> arrayLeft = Stream.of(wholeNumber).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        List<Integer> arrayRight = Stream.of(fractionalNumber).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        if(arrayLeft.size() % 3 != 0) {
        for(int i = 0; i < arrayLeft.size() % 3; i++) {
        arrayLeft.add(0, 0);
        }

        }
        System.out.println("List = " + arrayLeft);
        System.out.println("get i " + arrayLeft.get(5));*/
//---------------------


        // String[] threeNum = new String[]{"0", "0", "1"};
        //String[] threeNum = new String[]{"3", "5", "9"};
        // String[] threeNum = new String[]{"0", "5", "0"};  // no pass
        //String[] threeNum = new String[]{"0", "1", "0"};  // no pass
        // String[] threeNum = new String[]{"0", "1", "8"};  // no pass
        // String[] threeNum = new String[]{"1", "2", "9"};
        //String[] threeNum = new String[]{"3", "1", "4"};
        // String[] threeNum = new String[]{"3", "5", "9"};
        //String[] threeNum = new String[]{"3", "5", "0"};  // no pass

        String outNumber = "";
        // ------------------------- блок обработки триады -------------------------------------
        int temp = sizeOfWholeNumberTriad;
        for (int i = 0; i < sizeOfWholeNumberTriad; i += 3) {
            if (wholeNumberofTriad[i] != null && Integer.parseInt(wholeNumberofTriad[i]) > 0) {                 // если старший разряд не равен нулю, то выводим его
                outNumber += (unitsNumbers[Integer.parseInt(wholeNumberofTriad[i])] + hundr);  // " five hundreds" for example
            }
            //  --- если второй и третий элемент - от 10 до 19
            if (wholeNumberofTriad[i + 1] != null && Integer.parseInt(wholeNumberofTriad[i + 1]) == 1) {
                // int tenNines = Integer.parseInt(threeNum[1] + threeNum[2]);
                outNumber = outNumber + tenNinethNumbers[Integer.parseInt(wholeNumberofTriad[i + 2])] + " ";
            } else {
                if (wholeNumberofTriad[i + 1] != null) {
                    outNumber = outNumber + dozenNumbers[Integer.parseInt(wholeNumberofTriad[i + 1])] +
                            " " +
                            unitsNumbers[Integer.parseInt(wholeNumberofTriad[i + 2])];
                } else {
                    outNumber = outNumber + unitsNumbers[Integer.parseInt(wholeNumberofTriad[i + 2])]; // + " thousand ";
                }
            }
            if (temp == 9) {
                outNumber = outNumber + million;
            }
            if (temp == 6) {
                outNumber = outNumber + thousand;
            }
            temp -= 3;
            // System.out.print("Your number is : " + outNumber);
        }
// --------------------------------------конец блока обработки триады -----------------------------------
        System.out.println("Total number is : " + outNumber + dollars);

    }

}



