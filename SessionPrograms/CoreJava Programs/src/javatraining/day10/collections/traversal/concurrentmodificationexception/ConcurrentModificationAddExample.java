package javatraining.day10.collections.traversal.concurrentmodificationexception;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationAddExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Obtain an iterator for the list
        Iterator<String> iterator = fruits.iterator();
        fruits.add("Grapes");
        // Attempt to add an element while iterating
        // This will lead to ConcurrentModificationException

        // Traverse the list using the iterator
        try {
            while (iterator.hasNext()) {
                String fruit = iterator.next();
                System.out.println(fruit);
            }
        } catch (ConcurrentModificationException ex) {
           ex.printStackTrace();
        }
    }
}
