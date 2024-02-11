package javatraining.day10.collections.list.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListWithGenerics {
    public static void main(String[] args) {
        List<String> studentNames = new ArrayList<>();

        studentNames.add("Alice");
        // studentNames.add(42); // Compilation error, only String elements allowed
//        studentNames.add(3.14); // Double
//        studentNames.add(true); // Boolean

        for (String name : studentNames) {
            // No casting required, elements are already of type String
            System.out.println(name);
        }
    }
}
