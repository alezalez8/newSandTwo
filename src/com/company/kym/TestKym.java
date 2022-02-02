package com.company.kym;

import java.util.Scanner;

public class TestKym {
    public static void main(String[] args) {

        String text;
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");
        text = sc.nextLine();

        sum = (words(text));
        System.out.print("Сумма слов в Вашем тексте:" + sum);

    }

    public static int words(String text) {
        String[] t;
        t = text.split("[ ]");
        int s = 0;
        for (int i = 0; i < t.length; i++) {
            s++;
        }
        return s;
    }
}
