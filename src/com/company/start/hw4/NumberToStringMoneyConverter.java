package com.company.start.hw4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberToStringMoneyConverter {

    public static void main(String[] args) {
        int number;
        int[] arrayNumbers;
        int[] arrayNumbers2;
        char[] chWholeNumber;
        char[] chFractionalNumber;
        String hundr = " hundred";
        String sousand = "thousand";
        String dollars = "dollar(s)";
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

        String inputNumber = "1234.45";


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

        System.out.println("Whole part is " + Arrays.toString(wholeNumber));
        System.out.println("Fractional part is " + Arrays.toString(fractionalNumber));

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


        for (int i = 0; i < sizeOfWholeNumberTriad; i += 2) {

            // ---- текущая позиция, кратная трем:

            if (wholeNumberofTriad[i] != null && Integer.parseInt(wholeNumberofTriad[i]) > 0) {                 // если старший разряд не равен нулю, то выводим его
                outNumber = unitsNumbers[Integer.parseInt(wholeNumberofTriad[i])] + hundr + " ";  // " five hundreds" for example
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
                    outNumber = outNumber + unitsNumbers[Integer.parseInt(wholeNumberofTriad[i + 2])] + " millons ";
                }
            }
            System.out.print("Your number is : " + outNumber);

            // ch = inputNumber.toCharArray();
            // print(ch);

            // System.out.println(wholeNumber);
            // System.out.println(fractionalNumber);
// --------------------------------------конец блока обработки триады -----------------------------------
        }
        System.out.println("Total number is : " + outNumber);

    }

}

/*
        Map<String, String>  unitsNumber = new HashMap<>();
        Map<String, String>  dozensNumber = new HashMap<>();
        Map<String, String>  eleven_ninethNumber = new HashMap<>();


        unitsNumber.put("0", "");
        unitsNumber.put("1", "one");
        unitsNumber.put("2", "two");
        unitsNumber.put("3", "three");
        unitsNumber.put("4", "four");
        unitsNumber.put("5", "five");
        unitsNumber.put("6", "six");
        unitsNumber.put("7", "seven");
        unitsNumber.put("8", "eight");
        unitsNumber.put("9", "nine");
        unitsNumber.put("10", "ten");

        dozensNumber.put("2","twenty");
        dozensNumber.put("3","thirty");
        dozensNumber.put("4","forty");
        dozensNumber.put("5","fifty");
        dozensNumber.put("6","sixty");
        dozensNumber.put("7","seventy");
        dozensNumber.put("8","eighty");
        dozensNumber.put("9","ninety");

        eleven_ninethNumber.put("11", "eleven");
        eleven_ninethNumber.put("12", "twelve");
        eleven_ninethNumber.put("13", "thirteen");
        eleven_ninethNumber.put("14", "fourteen");
        eleven_ninethNumber.put("15", "fifteen");
        eleven_ninethNumber.put("16", "sixteen");
        eleven_ninethNumber.put("17", "seventeen");
        eleven_ninethNumber.put("18", "eighteen");
        eleven_ninethNumber.put("19", "nineteen");
*/


