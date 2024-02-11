package javatraining.day17.java8.methodreferences.referencetostaticmethod;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {



        List<String> numbersAsString = Stream.of("1", "2", "3", "4", "5")
                .collect(Collectors.toList());

        // Using a lambda expression to convert strings to integers
        List<Integer> numbers1 = numbersAsString.stream()
                .map(str -> Integer.parseInt(str))
                .collect(Collectors.toList());

        // Using a method reference to convert strings to integers
        List<Integer> numbers2 = numbersAsString.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Numbers (Using Lambda Expression): " + numbers1);
        System.out.println("Numbers (Using Method Reference): " + numbers2);
    }
}
