package javatraining.day7.exceptions.checkedexceptions;

public class InterruptedExceptionExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(2000); // Simulating a time-consuming task
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        });

        thread.start();

        // Let's interrupt the thread after a short delay
        try {
            Thread.sleep(1000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("Runner thread was interrupted.");
        }
    }
}
