package javatraining.day17.java8.streamapi;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", " is", " awesome!");

        // Using reduce to concatenate strings
        String result = strings.stream().reduce("", (a, b) -> a + b);

        System.out.println("Concatenated String: " + result);
    }
}
