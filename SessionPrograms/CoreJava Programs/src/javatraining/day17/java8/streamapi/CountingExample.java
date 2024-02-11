package javatraining.day17.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "fig");


       // fruits.stream().filter(s -> s.length() > 3).map(s -> "Fruit "+ s).forEach(System.out::println);

     //   fruits.stream().filter(s -> s.length() > 3).count();

        //=======================================================================

        // fruits -- Source of Stream

        Stream<String> stringStream = fruits.stream();
        List<String> updatedFruitsCollection = stringStream
                .filter(s -> s.length() == 5)
                .map(s -> "Fruit Name:: "+ s)
                .collect(Collectors.toList());


        System.out.println(updatedFruitsCollection);

        //===================================================================================



        Stream<String> fruitesStream = fruits.stream() // Stream of Data
                .filter(fruit -> fruit.startsWith("b"));// Intermediate Operators

        long count = fruitesStream// Intermediate Operators
                .count();//Terminal

        fruits.stream().forEach(System.out::println);

        System.out.println("Count of Fruits Starting with 'a': " + count);
    }
}
