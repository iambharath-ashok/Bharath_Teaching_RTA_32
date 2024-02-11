package javatraining.day10.collections.traversal.foreach;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSetForEachExample {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);




        System.out.println("Traversing HashSet using for-each loop:");

        hashSet.iterator();
        for (int num : hashSet) {
            if(num == 30) {
                //dadadaa
            }
            System.out.println(num);
        }
    }
}
