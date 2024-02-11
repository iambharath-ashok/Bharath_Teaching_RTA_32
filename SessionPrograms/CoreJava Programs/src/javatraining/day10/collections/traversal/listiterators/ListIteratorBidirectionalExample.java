package javatraining.day10.collections.traversal.listiterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorBidirectionalExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        ListIterator<Integer> listIterator = numbers.listIterator();

        // Forward traversal
        System.out.println("Forward traversal:");
        while (listIterator.hasNext()) {
            Integer number = listIterator.next();
            if (number.equals(30)) {
                listIterator.remove(); // Safely remove 30
            }
            System.out.println(number);
        }

        // Backward traversal
        System.out.println("Backward traversal:");
        while (listIterator.hasPrevious()) {
            Integer number = listIterator.previous();
            System.out.println(number);
        }

        System.out.println("Numbers after removal and bidirectional traversal:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
