package javatraining.day17.java8.optional;

import java.util.Optional;

public class OptionalDefaultValueExample {
    public static void main(String[] args) {
       // Optional<String> optionalValue = Optional.empty();
        Optional<String> optionalValue = Optional.ofNullable("some vlaue");

        // Using orElse() to provide a default value
        String result1 = optionalValue.orElse("Default Value 1");

        // Using orElseGet() with a supplier
        String result2 = optionalValue.orElseGet(() -> {
                    System.out.println("do something here");
                    return "Default Value 2";
                }
                );

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
