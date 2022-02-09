package com.company.start.hw7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CounterOfLetters {

    public static void main(String[] args) {
        String text;
        text = reader("test15.txt");
        int[] stat = countChar(text);
        System.out.println(Arrays.toString(stat));
        // printResult(stat);


        printResultTwo(newCounterChar(text));


    }


    public static String reader(String path) {
        File file = new File(path);
        String text = "";
        if (!file.exists() || file.isDirectory()) {
            System.out.println("It is not a needed file, please try again");
            return text;
        }
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                text += scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        text = text.replaceAll("[ ,;@#$%^&*()_=]+", "").toLowerCase();
        return text;
    }

    public static int[] countChar(String stroka) {
        int[] statistika = new int[26];
        int ofset = 97;
        char[] arrayStroka = stroka.toCharArray();
        for (int i = 0; i < stroka.length(); i++) {
            for (int j = 97; j < 123; j++) {
                if ((int) arrayStroka[i] == j) {
                    statistika[j - ofset]++;
                }
            }
        }
        return statistika;
    }


    public static Map<Integer, Integer> newCounterChar(String stroka) {
        Map<Integer, Integer> map = new TreeMap<>();
        char[] arrayStroka = stroka.toCharArray();
        int temp = 0;
        int ofset = 97;
        for (int i = 0; i < stroka.length(); i++) {
            for (int j = 97; j < 123; j++) {
                if (stroka.charAt(i) == (char) j) {
                    if( map.get(j) == null)
                    {
                        map.put(j, 0);
                    }
                    temp = map.get(j) + 1;
                    map.put(j, temp);
                    temp = 0;
                }
            }
        }


        return map;
    }


    public static void printResultTwo(Map<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> element : map.entrySet()
        ) {
            if (element.getValue() != null)
                System.out.println(element.getKey() + "   " + element.getValue());
        }
    }

    public static void printResult(int[] array) {
        int ofset = 97;


        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.printf("Letter %s present in this text %d times", (char) (i + ofset), array[i]);
                System.out.println();
            }

        }
    }

}
