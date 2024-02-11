package javatraining.day17.java8.defaultmethods;

interface Greeting {
    default void greet() {
        System.out.println("Hello, Default Method!");
    }
}

class GreetingImpl implements Greeting {
    // No need to override the default method
}



public class DefaultMethodSimpleExample {



    public static void main(String[] args) {
        Greeting greeting = new GreetingImpl();
        greeting.greet(); // Prints "Hello, Default Method!"
    }
}
