package javatraining.day10.collections.traversal.listiterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorRemoveExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        ListIterator<Integer> listIterator = numbers.listIterator();

        // Remove even numbers using ListIterator
        while (listIterator.hasNext()) {
            Integer number = listIterator.next();
           // numbers.add(80);
            if (number % 2 == 0) {
                listIterator.remove(); // Remove the current element
            }
        }

        System.out.println("Remaining numbers after removal:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
