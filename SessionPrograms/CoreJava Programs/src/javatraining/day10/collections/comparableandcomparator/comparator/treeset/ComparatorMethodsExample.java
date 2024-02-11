package javatraining.day10.collections.comparableandcomparator.comparator.treeset;

import java.util.*;



public class ComparatorMethodsExample {
    public static void main(String[] args) {

        //Comparator equals method
        Comparator<String> lengthComparator1 = new LengthComparator();
        Comparator<String> lengthComparator2 = new LengthComparator();

        boolean areEqual = lengthComparator1.equals(lengthComparator2);
        System.out.println("Comparators are equal: " + areEqual);

        //Comparator naturalOrder and  reversed methods
        Comparator<Integer> naturalOrder = Comparator.naturalOrder();
        Comparator<Integer> reversedOrder = naturalOrder.reversed();

        TreeSet<Integer> numbers = new TreeSet<>(reversedOrder);
        numbers.add(5);
        numbers.add(12);
        numbers.add(8);
        numbers.add(3);

        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
