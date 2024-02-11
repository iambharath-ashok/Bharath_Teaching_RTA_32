package javatraining.day15.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class RequestHandler implements Runnable {
    private int requestId;

    public RequestHandler(int requestId) {
        this.requestId = requestId;
    }

    @Override
    public void run() {
        System.out.println("Processing request " + requestId + " by thread " + Thread.currentThread().getName());
        // Simulate request processing
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class WebServerWithCacheThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        int numRequests = 1000;

        for (int i = 1; i <= numRequests; i++) {
            executor.submit(new RequestHandler(i));
        }

        executor.shutdown();
    }
}
