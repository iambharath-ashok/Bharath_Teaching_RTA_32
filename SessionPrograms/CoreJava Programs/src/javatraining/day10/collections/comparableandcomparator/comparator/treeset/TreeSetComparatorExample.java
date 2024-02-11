package javatraining.day10.collections.comparableandcomparator.comparator.treeset;

import java.util.*;

public class TreeSetComparatorExample {
    public static void main(String[] args) {
        // Create a TreeSet with custom length-based comparator
        TreeSet<String> lengthSortedSet = new TreeSet<>(new LengthComparator());

        // Add strings to the set
        lengthSortedSet.add("Apple");
        lengthSortedSet.add("Banana");
        lengthSortedSet.add("Orange");
        lengthSortedSet.add("Grapes");

        // Print strings in sorted order by length
        for (String fruit : lengthSortedSet) {
            System.out.println(fruit);
        }
    }
}

class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }
}
