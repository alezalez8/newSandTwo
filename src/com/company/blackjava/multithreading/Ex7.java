package com.company.blackjava.multithreading;

public class Ex7 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            System.out.println(i + "_____________________");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
