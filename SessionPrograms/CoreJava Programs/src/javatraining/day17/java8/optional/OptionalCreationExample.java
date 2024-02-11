package javatraining.day17.java8.optional;

import java.util.Optional;

public class OptionalCreationExample {
    public static void main(String[] args) {
        // Creating an Optional with a non-null value
        String helloWorld = "Hello, World";

        Optional<String> optionalWithValue = Optional.of(helloWorld);
        System.out.println("Optional Value: "+optionalWithValue);

        // Creating an empty Optional
        Optional<String> emptyOptional = Optional.empty();

        // Creating an Optional that allows null values
        String nullableValue = null;
        Optional<String> optionalNullable = Optional.ofNullable(nullableValue);
        Optional<String> opNull = Optional.of(nullableValue);
        System.out.println("Nullable Opitonal: "+ optionalNullable);

        // Accessing the value from Optional (if present)
        if (optionalNullable.isPresent()) {
        //if (helloWorld != null) {
            String value = optionalWithValue.get();
            System.out.println("Value from Optional: " + value);
        } else {
            System.out.println("Optional is empty");
        }
    }
}
