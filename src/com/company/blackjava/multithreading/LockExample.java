package com.company.blackjava.multithreading;

public class LockExample {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.scypeCall();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.whatsupCall();
            }
        });
        thread2.setDaemon(true);
        thread3.setDaemon(true);
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("Thread 1 :  " + thread1.getState());
        System.out.println("Thread 1 daemon :  " + thread1.isDaemon());
        System.out.println("Thread 2 :  " + thread2.getState());
        System.out.println("Thread 2  daemon:  " + thread2.isDaemon());
        System.out.println("Thread 3 :  " + thread3.getState());


    }
}

class Call {
    // Lock lock = new ReentrantLock();

    synchronized void mobileCall() {
        //synchronized (this){
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } // }


    }

    synchronized void scypeCall() {
        // synchronized (this){
        try {
            System.out.println("Scype call starts");
            Thread.sleep(5000);
            System.out.println("Scype call ends");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // }

    }

    synchronized void whatsupCall() {
        //synchronized (this){
        try {
            System.out.println("Whatsup call starts");
            Thread.sleep(7000);
            System.out.println("Whatsup call ends");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //  }

    }
}
/*
class Call {
    Lock lock = new ReentrantLock();

    void mobileCall() {
        lock.lock();
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
    void scypeCall() {
        lock.lock();
        try {
            System.out.println("Scype call starts");
            Thread.sleep(5000);
            System.out.println("Scype call ends");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
    void whatsupCall() {
        lock.lock();
        try {
            System.out.println("Whatsup call starts");
            Thread.sleep(7000);
            System.out.println("Whatsup call ends");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
*/
