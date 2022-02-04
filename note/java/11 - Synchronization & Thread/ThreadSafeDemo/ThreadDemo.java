package com.antra.corejava.thread;

import java.time.LocalDateTime;
import java.util.concurrent.*;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread().getName() + " - print in main thread");
        MyThread t = new MyThread();
        t.start();

        Thread t2 = new Thread(new MyThread2());
        t2.start();

        ExecutorService es = Executors.newFixedThreadPool(10);
        es.submit(new MyThread2());

        Future<String> future = es.submit(new MyCallableClass());
        System.out.println(future.get());

        es.shutdown();

    }
}

class MyCallableClass implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "Today is " + LocalDateTime.now();
    }
}

class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " - print in a new thread");
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " - print in a new thread");
    }
}
