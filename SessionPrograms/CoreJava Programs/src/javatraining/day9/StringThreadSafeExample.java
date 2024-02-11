package javatraining.day9;

public class StringThreadSafeExample {

    public static void main(String[] args) {

        String name = "Bharath";
        String message = "Hello ";
        String password = "password";

        StringBuffer sb = new StringBuffer();

        Runnable r1 = () -> {
           // message = "Bikash";
            System.out.println(Thread.currentThread().getName());
            System.out.println(message + name);
        };
        Runnable r2 = () -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(message + name);
        };

        Thread t1 = new Thread(r1 );
        Thread t2 = new Thread(r2);

        //t1.start();
       // t2.start();

    }

}
