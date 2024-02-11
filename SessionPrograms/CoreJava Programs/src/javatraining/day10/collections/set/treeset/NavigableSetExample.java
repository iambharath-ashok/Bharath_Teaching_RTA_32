package javatraining.day10.collections.set.treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        
        // Adding elements to the NavigableSet

        //10,20,30,40,50
        navigableSet.add(10);
        navigableSet.add(20);
        navigableSet.add(30);
        navigableSet.add(40);
        navigableSet.add(50);
        
        System.out.println("NavigableSet: " + navigableSet);
        
        // Using NavigableSet methods
        System.out.println("Lower than 25: " + navigableSet.lower(25)); // 20
        //Returns the greatest element in the set less than or equal to the given
        System.out.println("Floor of 25: " + navigableSet.floor(25));   // 20
        // Returns the smallest element in the set greater than or equal to the given element e,
        // or null if there is no such element.
        System.out.println("Ceiling of 25: " + navigableSet.ceiling(25)); // 30
        //Returns the smallest element in the set strictly greater than the given element e,
        // or null if there is no such element.
        System.out.println("Higher than 25: " + navigableSet.higher(25)); // 30
        
       // System.out.println("Poll first: " + navigableSet.pollFirst()); // 10
     //   System.out.println("Poll last: " + navigableSet.pollLast());   // 50
        
      //  System.out.println("NavigableSet after polls: " + navigableSet); // [20, 30, 40]
        
        // SubSet example
        NavigableSet<Integer> subSet = navigableSet.subSet(25, true, 40, true);
        System.out.println("SubSet [25, 40]: " + subSet); // [30, 40]
        
        // HeadSet example
        NavigableSet<Integer> headSet = navigableSet.headSet(30, false);
        System.out.println("HeadSet <= 30: " + headSet); // [20, 30]
        
        // TailSet example
        NavigableSet<Integer> tailSet = navigableSet.tailSet(30, false);
        System.out.println("TailSet > 30: " + tailSet); // [40]
    }
}
