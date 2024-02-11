package javatraining.day17.java8.optional;

import java.util.Optional;

public class OptionalMappingExample {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("Hello");
        // Using map() to transform the value inside Optional
        Optional<String> transformedValue = optionalValue.map(value -> value + " World");

        transformedValue.ifPresent(value -> System.out.println("Mapped Value: " + value));

    }
}
