package javatraining.day15.threads.creatingthreads;

import java.util.concurrent.Callable;

class Task implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " :: " + i);
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {

//        Runnable runnable = () -> {
//            for (int i = 0; i < 5; i++) {
//                System.out.println(Thread.currentThread().getName() + " :: " + i);
//            }
//        };

            Task task1 = new Task();
            Task task2 = new Task();
            Task task3 = new Task();
            Task task4 = new Task();

           // Thread thread1 = new Thread(runnable, "Thread 1");
            Thread thread2 = new Thread(task2, "Thread 2");
            Thread thread3 = new Thread(task3, "Thread 3");
            Thread thread4 = new Thread(task4, "Thread 4");

          //  thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();


            for (int i = 0; i < 5; i++) {
                System.out.println("Runner Thread: " + i);
            }
        }
    }
