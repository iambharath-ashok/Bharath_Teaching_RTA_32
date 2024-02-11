package javatraining.day15.threads.creatingthreads;

//First Way
class CreatingThreadByExtendingThreadClass extends Thread {

    @Override
    public void run() {
        System.out.println("Hello, Thread Created By Extending Thread Classs");
    }


}

//Second Way
class CreatingThreadByImplementingRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello, Thread Created By Implementing Runnable Interface");
    }
}



public class WaysToCreateThreadInJava {

    public static void main(String[] args) {
        CreatingThreadByExtendingThreadClass thread1 = new CreatingThreadByExtendingThreadClass();
        thread1.start();

        CreatingThreadByImplementingRunnable runnable = new CreatingThreadByImplementingRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}