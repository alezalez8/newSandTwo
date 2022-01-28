package com.company.blackjava.multithreading;

import java.util.concurrent.Semaphore;

public class SemahporeEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        Person person1 = new Person("Aleks", callBox);
        Person person2 = new Person("Gena", callBox);
        Person person3 = new Person("Lena", callBox);
        Person person4 = new Person("Sanya", callBox);
        Person person5 = new Person("Yriy", callBox);




    }
}


class Person extends Thread {
    String name;
    private Semaphore callBox;


    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ждет...");
            callBox.acquire();
            System.out.println(name + " пользуется телефоном");
            sleep(2000);
            System.out.println(name + " завершил разговор");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            callBox.release();
        }
    }
}