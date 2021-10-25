package com.company.concurrency_lessons.vasko;

public class VolatileMain {

    private static int counter;

    public static void main(String[] args) {

    }

    private static class SimpleWriter extends Thread {
        @Override
        public void run() {
            int localCounter = counter;
            for (int i = 0; i < 10; i++) {
                System.out.println("Writer increments counter " + (localCounter + 1));
                counter = ++localCounter;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class SimpleReader extends Thread {
        @Override
        public void run() {
            int localCounter = counter;

            while (localCounter < 10) {
                System.out.println("Reader reads counter " + counter);
                localCounter = counter;
            }
        }
    }

}


