package javatraining.day17.java8.optional;

import java.util.Optional;

public class OptionalFilterExample {
    public static void main(String[] args) {
        Integer i = 42;

        Optional<Integer> integerOptional = Optional.ofNullable(i);
        Optional<Integer> optionalValue = Optional.of(42);

        String studentName = "Bharath";
        Optional<String> studentNameOptional = Optional.ofNullable(studentName);

        Optional<String> filteredOptional  =  studentNameOptional.filter(v -> v.length() > 30);

        System.out.println(filteredOptional);

        // Using filter() to conditionally filter the value
        Optional<Integer> filteredValue = optionalValue.filter(value -> value % 2 == 0);

       // filteredValue.ifPresent(value -> System.out.println("Filtered Value: " + value));
    }
}
