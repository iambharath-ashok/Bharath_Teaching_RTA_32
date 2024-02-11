package javatraining.day10.collections.set.hashset;

import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

public class UniqueElementsExample {
    public static void main(String[] args) {
        int[] numbers = { 5, 8, 2, 5, 9, 8, 3, 1,5,6,1,4,1 };
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : numbers) {
            uniqueNumbers.add(num);
        }

        System.out.println("Unique Numbers: " + uniqueNumbers);
    }
}
