package com.company.blackjava.multithreading;

public class Ex8 {
    public static void main(String[] args) {
        TestConc testConc = new TestConc();
        Thread tr1 = new Thread(testConc);
        Thread tr2 = new Thread(testConc);
        Thread tr3 = new Thread(testConc);
        long start = System.currentTimeMillis();
        tr1.start();
        tr2.start();
        tr3.start();


        try {
            tr1.join();
            tr2.join();
            tr3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
      //  System.out.println("Time is " + (end - start));

    }
}


class CounterOne {

    volatile static int count = 0;
  /*  static Lock locker = new ReentrantLock();

    public static  void increm() {
        locker.lock();
        count++;
      //  System.out.print(CounterOne.count + "  ");
        locker.unlock();
    }*/
}


class TestConc implements Runnable {

   // Lock lock = new ReentrantLock();
    public synchronized void  counter() {
       // CounterOne.increm();
        CounterOne.count++;
        System.out.print(CounterOne.count + "  ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter();
        }
    }
}


