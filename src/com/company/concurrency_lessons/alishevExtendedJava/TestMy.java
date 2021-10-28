package com.company.concurrency_lessons.alishevExtendedJava;

import com.company.concurrency_lessons.vasko.ColorScheme;

import static com.company.concurrency_lessons.vasko.ColorScheme.*;

public class TestMy {
    public static void main(String[] args) {


        MyThreadClass myThreadClass = new MyThreadClass();
        myThreadClass.start();

        Thread myThreadClassTwo = new Thread(new ExRun());
        myThreadClassTwo.start();
        System.out.println( YELLOW + "Main  name of thread is " +"\"" + Thread.currentThread().getName() + "\"");
        System.out.printf(BLUE + "%s Main  name of thread %n", Thread.currentThread().getName());
    }
}

class MyThreadClass extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(GREEN+ "Thread_one " + i + "  name of thread is " + Thread.currentThread().getName());
/*
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();

            } */
        }
    }
}

class ExRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            System.out.println(RED + "Thread_two " + i + "  name of thread is " + Thread.currentThread().getName());
 /*           try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
*/
        }
    }
}

