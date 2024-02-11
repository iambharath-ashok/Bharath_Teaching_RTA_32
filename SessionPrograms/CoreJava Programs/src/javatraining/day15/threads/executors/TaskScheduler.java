package javatraining.day15.threads.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TaskScheduler {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        // Schedule a task to run every 2 seconds
        executor.scheduleAtFixedRate(() -> {
            System.out.println("Task is running at " + System.currentTimeMillis() + " by thread " + Thread.currentThread().getName());
        }, 0, 2, TimeUnit.SECONDS);

        // Schedule another task to run after an initial delay of 3 seconds and then every 5 seconds
        executor.scheduleWithFixedDelay(() -> {
            System.out.println("Delayed Task is running at " + System.currentTimeMillis() + " by thread " + Thread.currentThread().getName());
        }, 3, 5, TimeUnit.SECONDS);
/*
        Instant instant = Instant.ofEpochSecond(epochTimestampSeconds); // Convert to Instant

        // Convert to LocalDateTime in a specific time zone (e.g., UTC)
        ZoneId zoneId = ZoneId.of("UTC");
        LocalDateTime localDateTime = instant.atZone(zoneId).toLocalDateTime();*/

        // Allow the tasks to run for some time
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
