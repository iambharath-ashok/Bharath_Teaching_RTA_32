package javatraining.day10.collections.traversal.iterators;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorRemoveExample {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        Iterator<String> iterator = colors.iterator();




        // Remove "Green" from the set while iterating
        while (iterator.hasNext()) {
            String color = iterator.next();
            if (color.equals("Green")) {
                iterator.remove(); // Removes the current element safely
            }
            System.out.println("Colors:: "+ color);
        }

        System.out.println("Remaining colors after removal:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
