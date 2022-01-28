package com.company.blackjava.multithreading;

public class InterruptingEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        InterraptedThread thread = new InterraptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();

        thread.join();
        System.out.println("Main ends");

    }
}

class InterraptedThread extends Thread {
    double sqrtSum = 0;

    public void run() {
        for (int i = 0; i <= 1000000000; i++) {
            if (isInterrupted()) {
                System.out.println("I was interrupted");
                System.out.println(sqrtSum);

                return;
            }
            sqrtSum += Math.sqrt(i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                //e.printStackTrace();
                System.out.println("мы спали, а нас прервали");
                System.out.println("Завершаем работу");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}
