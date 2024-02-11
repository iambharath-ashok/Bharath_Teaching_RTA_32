package javatraining.day15.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {
    private int taskNumber;

    public MyTask(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskNumber + " is executing by thread " + Thread.currentThread().getName());
    }
}


public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 10; i++) {
            final int taskNumber = i;
            executor.submit(new MyTask(taskNumber));
        }

        executor.shutdown();
    }
}
