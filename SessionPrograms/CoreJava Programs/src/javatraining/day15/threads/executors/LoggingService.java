package javatraining.day15.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class LogMessageProcessor implements Runnable {
    private String message;

    public LogMessageProcessor(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println("Processing message: " + message + " by thread " + Thread.currentThread().getName());
        // Simulate message processing
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LoggingService {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        String[] logMessages = {"Message 1", "Message 2", "Message 3", "Message 4", "Message 5"};

        for (String message : logMessages) {
            executor.submit(new LogMessageProcessor(message));
        }

        executor.shutdown();
    }
}
