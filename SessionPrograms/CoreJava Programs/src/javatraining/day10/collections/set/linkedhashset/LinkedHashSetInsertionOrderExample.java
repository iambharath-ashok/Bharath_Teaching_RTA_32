package javatraining.day10.collections.set.linkedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetInsertionOrderExample {

    public static void main(String[] args) {
        Set<String> fruitSet = new LinkedHashSet<>(1, 1f);

        fruitSet.add(null);
        fruitSet.add(null);
        fruitSet.add(null);
        fruitSet.add("Apple");//8
        fruitSet.add("Banana");
        fruitSet.add("Orange");
        fruitSet.add("Grapes");
        fruitSet.add("Pear"); //8

        fruitSet.add("Mango"); //8
        fruitSet.add(null);
        fruitSet.add(null);
        fruitSet.add(null);
        fruitSet.add(null);
        fruitSet.add(null);
        fruitSet.add(null);
        fruitSet.add(null);
        fruitSet.add(null);
        fruitSet.add(null);

        for(String fruit: fruitSet) {
            System.out.println(fruit);
        }
    }
}
