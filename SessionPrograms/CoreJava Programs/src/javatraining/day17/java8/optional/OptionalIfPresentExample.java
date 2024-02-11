package javatraining.day17.java8.optional;

import java.util.Optional;

public class OptionalIfPresentExample {
    public static void main(String[] args) {
//        Optional<String> optionalValue = Optional.of("Hello, Optional");
        Optional<String> optionalValue = Optional.ofNullable(null);

        // Using ifPresent() to perform an action if the value is present
        optionalValue.ifPresent(value -> System.out.println("Value is present: " + value));

        // Using ifPresentOrElse() to perform different actions based on presence
        optionalValue.ifPresentOrElse(
            value -> System.out.println("Value is present: " + value),
            () -> System.out.println("Value is absent")
        );
    }
}
