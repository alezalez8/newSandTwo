package com.company.start.hw4;

public class NumberToStringMoneyConverter {

    public static void main(String[] args) {
        int number;
        int[] arrayNumbers;
        int[] arrayNumbers2;
        char[] chWholeNumber;
        char[] chFractionalNumber;
        String hundr = " hundred(s)";
        String sousand = "sousand";
        String dollars = "dollars";

        String wholeNumber;
        String fractionalNumber;

        String[] unitsNumbers = {"", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine"};
        String[] tenNinethNumbers = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] dozenNumbers = {"","", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"};

//-------------------- нужное, не удалять
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        String inputNumber = scanner.nextLine();
        //double mmm = scanner.nextDouble();

        scanner.close();
        // String textMoney = String.format("%.2f",mmm);
        // System.out.println("Text money =  " + textMoney);

        String[] arrayNumber = inputNumber.split("[,.]");
        wholeNumber = arrayNumber[0];
        if (arrayNumber.length > 1) {
            fractionalNumber = arrayNumber[1];
        } else {
            fractionalNumber = "";
        }



        List<Integer> arraOne = Stream.of(wholeNumber).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        System.out.println("List = " + arraOne);
*/
//---------------------

       String[] threeNum = new String[]{"3", "5", "9"};
       // String[] threeNum = new String[]{"0", "5", "0"};  // no pass
        //String[] threeNum = new String[]{"0", "1", "0"};  // no pass
       // String[] threeNum = new String[]{"0", "1", "8"};  // no pass
       // String[] threeNum = new String[]{"1", "2", "9"};
        //String[] threeNum = new String[]{"3", "1", "4"};
       // String[] threeNum = new String[]{"3", "5", "9"};
        //String[] threeNum = new String[]{"3", "5", "0"};  // no pass

        String outNumber = "";


        if (Integer.parseInt(threeNum[0]) > 0) {                 // если старший разряд не равен нулю, то выводим его
            outNumber = unitsNumbers[Integer.parseInt(threeNum[0])] + hundr + " ";  // " five hundreds" for example
        }
        //  --- если второй и третий элемент - от 10 до 19
        if (Integer.parseInt(threeNum[1]) == 1) {

           // int tenNines = Integer.parseInt(threeNum[1] + threeNum[2]);
            outNumber = outNumber + tenNinethNumbers[Integer.parseInt(threeNum[2])] + " ";

        } else {
            outNumber = outNumber + dozenNumbers[Integer.parseInt(threeNum[1])] +
                    " " +
                    unitsNumbers[Integer.parseInt(threeNum[2])];
        }
        System.out.println("Your number is : " + outNumber);

        // ch = inputNumber.toCharArray();
        // print(ch);

        // System.out.println(wholeNumber);
        // System.out.println(fractionalNumber);

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


