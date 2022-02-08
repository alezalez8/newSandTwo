package com.company.start.hw7.lesson8;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File file1 = new File("abc.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File folder = new File("AAA");
            folder.mkdir();
        //folder.delete();

        File file2 = new File(folder, "text.docx");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }



        File workFolder = new File(".");
        File[] files = workFolder.listFiles();
        // System.out.println(Arrays.toString(files));
        for (int i = 0; i < files.length; i++) {
            String type = files[i].isDirectory() ? "Folder" : "File";
            System.out.println(files[i] + "\t" + type + "\t" + files[i].length());
        }

    }
}
