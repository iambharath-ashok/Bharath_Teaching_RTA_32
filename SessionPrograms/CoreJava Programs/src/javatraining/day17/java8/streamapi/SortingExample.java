package javatraining.day17.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList( "banana","date", "fig", "apple", "banana", "cherry");
        System.out.println("Original list:: "+ fruits);

        List<String> sortedFruits = fruits.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Sorted Fruits: " + sortedFruits);
    }
}
