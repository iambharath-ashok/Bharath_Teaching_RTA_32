package javatraining.day15.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExampleWithJava8 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            final int taskNumber = i;
            executor.submit(() -> {
                System.out.println("Task " + taskNumber + " is executing by thread " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}
