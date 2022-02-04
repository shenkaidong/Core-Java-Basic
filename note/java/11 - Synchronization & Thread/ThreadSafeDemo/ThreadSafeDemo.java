package com.antra.corejava.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafeDemo {

    public static void main(String[] args) throws InterruptedException {
        MyNotSafeClass2 t = new MyNotSafeClass2();
        t.start();
        Thread.sleep(200);
        t.stopRun();
        t.join();
        System.out.println("Stop");
//        MyNotSafeClass myNotSafeClass = new MyNotSafeClass();
//
//        ExecutorService es = Executors.newFixedThreadPool(10);
//        for (int i = 0; i < 1000; i++) {
//            es.submit(() -> myNotSafeClass.increase());
//        }
//
//        Thread.sleep(500);
//        es.shutdown();
//        System.out.println(myNotSafeClass.i);
    }
}

class MyNotSafeClass {
    AtomicInteger i = new AtomicInteger(0);

    public void increase() {
        i.incrementAndGet();
    }
}

class MyNotSafeClass2 extends Thread {
    volatile boolean runningFlag = false;

    public void run(){
        runningFlag = true;
        while(runningFlag){
            //
            //
        }
        System.out.println("Done");
    }

    public void stopRun() {
        this.runningFlag = false;
    }
}
