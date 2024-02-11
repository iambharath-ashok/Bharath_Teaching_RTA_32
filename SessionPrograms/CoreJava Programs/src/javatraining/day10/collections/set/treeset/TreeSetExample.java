package javatraining.day10.collections.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {
    public static void main(String[] args) {



        Set<Integer> numbers = new TreeSet<>(Comparator.reverseOrder());
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        System.out.println("Sorted Numbers: " + numbers);
    }
}
