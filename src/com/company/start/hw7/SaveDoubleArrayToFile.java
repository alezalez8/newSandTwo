package com.company.start.hw7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SaveDoubleArrayToFile {

    public static void main(String[] args) {
        String path = "";
        int[][] testArray = {{2, 5, 7, 8}, {45, 12, 34, 78, 22, 11}, {-23, 56, -12, 4, 88}};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path for save this array");
        path = scanner.nextLine();
        scanner.close();

        saveArray(testArray, path);

    }


    public static void saveArray(int[][] array, String path) {

        File file = new File(path + ".csv");
        StringBuilder arrayString = new StringBuilder("");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayString.append(array[i][j]);
                if (j < array[i].length - 1) {
                    arrayString.append(";");
                }
            }
            arrayString.append(System.lineSeparator());
        }

        try (PrintWriter writer = new PrintWriter(file)) {

            writer.write(arrayString.toString());
            System.out.println("Save data to file is done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
