package javatraining.day15.threads.creatingthreads;

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread A: " + i);
        }
    }
}


public class ThreadExample {
    public static void main(String[] args) {
        MyThread threadA = new MyThread();
        threadA.start();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Runner Thread: " + i);
        }
    }
}
