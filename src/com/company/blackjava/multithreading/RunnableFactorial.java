package com.company.blackjava.multithreading;

import java.util.concurrent.*;

public class RunnableFactorial {
    public static long factorialResult;

    public static void main(String[] args) throws InterruptedException {
        Factorial factorial = new Factorial(5);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        //executorService.execute( factorial);
        Future<Long> future = executorService.submit(factorial);

        //executorService.awaitTermination(10, TimeUnit.SECONDS);
        try {
            System.out.println(future.isDone());
            System.out.println("Хотим получить результат ");
            factorialResult = future.get();
            System.out.println(future.isDone());
            System.out.println("Получили  результат ");
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
            ;
        } finally {
            executorService.shutdown();
        }
        System.out.println("Factorial = " + factorialResult);

    }
}

class Factorial implements Callable<Long> {
    int factorial;


    public Factorial(int factorial) {
        this.factorial = factorial;
    }

    @Override
    public Long call() throws Exception {
        if (factorial <= 0) {
            throw new Exception("Wrong number");
        }
        long result = 1;
        for (int i = 1; i <= factorial; i++) {
            result = result * i;
            Thread.sleep(1000);
        }
        // RunnableFactorial.factorialResult = result;
        return result;
    }
}
