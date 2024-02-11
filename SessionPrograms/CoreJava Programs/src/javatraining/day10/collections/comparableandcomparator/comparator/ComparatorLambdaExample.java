package javatraining.day10.collections.comparableandcomparator.comparator;

import java.util.*;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Sort in reverse alphabetical order using a lambda expression
        Collections.sort(fruits, (s1, s2) -> s2.compareTo(s1));

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
