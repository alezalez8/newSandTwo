package com.company.blackjava.multithreading;

import java.util.concurrent.*;

public class CallableExample {
    public static long factorialResult;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Factorial1 factorial = new Factorial1(5);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future future = executorService.submit(factorial);
        executorService.shutdown();
        System.out.println(future.isDone());
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(future.get());
        System.out.println(future.isDone());
        System.out.println(factorialResult);


    }
}

class Factorial1 implements Runnable {
    int factorial;

    public Factorial1(int factorial) {
        this.factorial = factorial;
    }

    @Override
    public void run() {
        long result = 1;
        for (int i = 1; i <= factorial; i++) {
            result = result * i;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        CallableExample.factorialResult = result;
    }
}
