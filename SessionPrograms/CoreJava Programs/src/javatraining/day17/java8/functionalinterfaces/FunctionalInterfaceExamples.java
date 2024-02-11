package javatraining.day17.java8.functionalinterfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalInterfaceExamples {

    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("Hello, Lambda!");

        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

        Callable<Integer> callable = () -> {
            return 42;
        };

        Predicate<String> predicate = str -> str.length() > 5;

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Predicate<String> namePredicate = name -> name.length() > 4;
        List<String> longNames = names.stream().filter(namePredicate).collect(Collectors.toList());

    }
}
