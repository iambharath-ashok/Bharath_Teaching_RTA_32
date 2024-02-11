package javatraining.day10.collections.set.hashset;

import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

public class RemoveDuplicatesFromArrayExample {
    public static void main(String[] args) {
        int[] numbers = { 5, 2, 8, 2, 9, 8, 3, 5 };

        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Double> uniqueFloat = new HashSet<>();

        for (int num : numbers) {
            uniqueNumbers.add(num);
        }

        System.out.println("Unique Numbers: " + uniqueNumbers);
    }
}
