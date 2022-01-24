package com.company.blackjava.multithreading;

public class Ex12 {
    static final Object lock = new Object();

    void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");
        }
    }

    void scypeCall() {
        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ends");
        }
    }

    void whatsUpCall() {
        synchronized (lock) {
            System.out.println("WhatsUp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("WhatsUp call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsUp());


        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImplMobile implements Runnable {
    @Override
    public void run() {
        new Ex12().mobileCall();

    }
}

class RunnableImplSkype implements Runnable {
    @Override
    public void run() {
        new Ex12().scypeCall();

    }
}

class RunnableImplWhatsUp implements Runnable {
    @Override
    public void run() {
        new Ex12().whatsUpCall();

    }
}
