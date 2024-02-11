package javatraining.day15.threads.executors;

import java.util.Timer;
import java.util.TimerTask;

public class TaskSchedulerWithoutJava8 {
    public static void main(String[] args) {
        Timer timer = new Timer();

        // Schedule a task to run every 2 seconds
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task is running at " + System.currentTimeMillis());
            }
        }, 0, 2000);

        // Schedule another task to run after an initial delay of 3 seconds and then every 5 seconds
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Delayed Task is running at " + System.currentTimeMillis());
            }
        }, 3000, 5000);

        // Allow the tasks to run for some time
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        timer.cancel();
    }
}
