package javatraining.day17.java8.lambda;

public class RunnableFunctionalInterfaceUnderstanding {

    public static void main(String[] args) {


        //Before Java 8 using Anonymous Inner class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World, from Anonymous Inner Class");
            }
        };
        Thread t1 = new Thread(runnable);
       // t1.start();;
        //From Java 8 using Lambda

        //Syntax: () -> {Expression}
        Runnable runnableLambda = () -> {
            System.out.println("Hello World, from Lambda");
        };


        Thread threadLambda = new Thread(runnableLambda);
        threadLambda.start();




    }
}
