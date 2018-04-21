package com.shadab.java.core.threads.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static final int NTHREDS = 10;

    public static void main(String[] args) {
       // ExecutorService executor =  Executors.newSingleThreadExecutor();
       ExecutorService executor =  Executors.newFixedThreadPool(NTHREDS);
        Executors.newSingleThreadExecutor();
        for (int i = 0; i < 500; i++) {
            Runnable worker = new MyRunnable(10000000L + i);
            executor.execute(worker);
        }
        // This will make the executor accept no new threads
        // and finish all existing threads in the queue
        executor.shutdown();
        // Wait until all threads are finish
       // executor.awaitTermination();
        System.out.println("Finished all threads");
    }
}