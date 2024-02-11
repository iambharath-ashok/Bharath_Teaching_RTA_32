package javatraining.day10.collections.comparableandcomparator.comparator.treeset;

import java.util.*;

public class TreeSetBuiltInComparatorExample {
    public static void main(String[] args) {
        // Create a TreeSet with reverse order comparator
        TreeSet<Integer> reverseSortedSet = new TreeSet<>(Comparator.reverseOrder());

        // Add integers to the set
        reverseSortedSet.add(5);
        reverseSortedSet.add(12);
        reverseSortedSet.add(8);
        reverseSortedSet.add(3);

        // Print integers in reverse sorted order
        for (Integer num : reverseSortedSet) {
            System.out.println(num);
        }
    }
}
