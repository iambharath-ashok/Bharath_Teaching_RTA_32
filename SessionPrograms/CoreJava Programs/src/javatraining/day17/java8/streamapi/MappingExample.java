package javatraining.day17.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java");


        List<String> uppercaseWords = words.stream()
                //.map(String::toUpperCase)
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        words.stream()
                //.map(String::toUpperCase)
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);


        System.out.println("Uppercase Words: " + uppercaseWords);

        uppercaseWords.stream().forEach(System.out::println);
    }
}
