package javatraining.day10.collections.traversal.listiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        ListIterator<String> listIterator = fruits.listIterator();
        Iterator<String> iterator = fruits.iterator();

        // Traverse the list forwards using ListIterator
        System.out.println("Traversing list forwards:");
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);
        }

        // Traverse the list backwards using ListIterator
        System.out.println("Traversing list backwards:");
        while (listIterator.hasPrevious()) {
            String fruit = listIterator.previous();
            System.out.println(fruit);
        }
    }
}
