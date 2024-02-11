package javatraining.day17.java8.methodreferences.instancemethodreference;

import java.util.function.Function;

public class StringInstanceMethodRefernce {

    public static void main(String[] args) {
        // Lambda expression to find the length of a string
        Function<String, Integer> lambda = str -> str.length();

        // Method reference to String's length() static method
        Function<String, Integer> methodReference = String::length;

        int length1 = lambda.apply("Hello, Lambda!"); // Using lambda expression
        int length2 = methodReference.apply("Hello, Method Reference!"); // Using method reference

        System.out.println("Length 1 "+length1);
        System.out.println("Length 2 "+length2);
    }
}
