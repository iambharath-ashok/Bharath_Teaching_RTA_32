package javatraining.day10.collections.traversal.foreach;

import java.util.ArrayList;
import java.util.List;

public class ArrayListForEachExample {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        System.out.println("Traversing ArrayList using for-each loop:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }



        // Enhanced For-Each loop uses Iterator Behind the Scenes
        // Any modification/change to the underlying collection will throw
        // ConcurrentModificationExample
        for (String fruit : arrayList) {
            System.out.println("Fruit Name:: "+ fruit);
        }
    }
}
