package com.company.start.hw7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CounterOfLetters {

    public static void main(String[] args) {
        String text;
        text = reader("text10.txt");
        int[] stat = countChar(text);
        //System.out.println(Arrays.toString(stat));
        printResult(stat);

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


    public static void printResult(int[] array) {
        int ofset = 97;
        int max = 0;
        int current = 0;

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                    current = i;
                }
            }
            if (array[current] != 0) {
                System.out.printf("Letter %s :  %d times", (char) (current + ofset), array[current]);
                System.out.println();
                array[current] = 0;
                max = 0;
            }
        }
    }
}
