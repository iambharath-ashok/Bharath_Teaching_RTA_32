package javatraining.day15.threads.interuption;

public class ThreadInterruptionExample {
    public static void main(String[] args) {
        Thread longRunningThread = new Thread(() -> {
            //A thread can check its own interrupted status using the isInterrupted() method
            while (!Thread.currentThread().isInterrupted()) { //while(true) {}
                // Do some work
                System.out.println("Working...");
                try {
                    Thread.sleep(1000); // Simulate work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Re-set interrupted status
                    System.out.println("Thread was interrupted while sleeping.");
                }
            }
            System.out.println("Thread has stopped.");
        });
        //We can interrupt a thread by calling the interrupt() method on the thread object
        longRunningThread.start();

        try {
            Thread.sleep(5000); // Let the thread run for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Runner will interrupt the below Thread
        longRunningThread.interrupt(); // Request thread interruption
    }
}
