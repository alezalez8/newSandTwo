package com.company.concurrency_lessons.alishevExtendedJava.collectionsFramework;

import java.util.Random;
import java.util.concurrent.*;

public class TestOne {
    //  private static int result;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);


        Future<Integer> future = executorService.submit(() -> {
            System.out.println("Starting");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished");

            Random random = new Random();
            int randomValue = random.nextInt(10);
            if (randomValue < 5) {
                System.out.println("------" + randomValue);
                throw new Exception("Something bad happened");
            }
            return randomValue;
        });

        executorService.shutdown();

        try {
            int result = future.get();
            System.out.println("Result is " + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (
                ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
            e.printStackTrace();
        }

    }

}
