package com.company.start.hw7.lesson8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReaderCVS {
    public static void main(String[] args) {
        //int[][] testArray = {{2, 5, 7, 8}, {45, 12, 34, 78, 22, 11}, {-23, 56, -12, 4, 88}};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of file");
        String path = scanner.nextLine();
        String inputData = readerData(path);

        int[][] arrayCSV = converterCVS(inputData);
        System.out.println(Arrays.deepToString(arrayCSV));

    }

    public static String readerData(String path) {
        StringBuilder data = new StringBuilder();
        File file = new File(path);
        if (!file.exists() || file.isDirectory()) {
            return "";
        }
        try
                (Scanner scanner = new Scanner(file)) {
            for (; scanner.hasNextLine(); ) {
                data.append(scanner.nextLine()).append(" ");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File is not exist or damaged " + e.getMessage());
        }
        return data.toString();
    }


    public static int[][] converterCVS(String data) {
        String[] array1 = data.split(" ");
        int[][] arrayCVS = new int[array1.length][];
        String[] tempArray;

        for (int i = 0; i < array1.length; i++) {
            tempArray = array1[i].split("[;,]");
            arrayCVS[i] = new int[tempArray.length];
            for (int j = 0; j < tempArray.length; j++) {
                arrayCVS[i][j] = Integer.parseInt(tempArray[j]);
            }
        }
        return arrayCVS;
    }
}

/*
               input data:
               int[][] testArray = {{2, 5, 7, 8}, {45, 12, 34, 78, 22, 11}, {-23, 56, -12, 4, 88}};

               or  file doubleArray.csv :
                        2;5;7;8
                        45;12;34;78;22;11
                        -23;56;-12;4;88

               output array:
               [[2, 5, 7, 8], [45, 12, 34, 78, 22, 11], [-23, 56, -12, 4, 88]]
* */

