package javatraining.day15.threads.creatingthreads;


public class RunnableRuntimeExample {

    public static void main(String[] args) {

        System.out.println("Thread Name:: "+Thread.currentThread().getName());
        RunnableTask runnableTask = new RunnableTask();

        Thread thread1 = new Thread(runnableTask);

       // runnableTask.run();
        thread1.start();


    }
}



class RunnableTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread Name:: "+Thread.currentThread().getName());
        System.out.println("Hello World");
    }

}

