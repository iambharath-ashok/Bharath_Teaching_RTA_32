package javatraining.day10.collections.traversal.iterators;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);


//        for (int num: numbers) {
//           numbers.add(1,90);
//        }

        numbers.add(40);
        numbers.add(50);

        // Get an iterator for the list
        Iterator<Integer> iterator = numbers.iterator();


        // Traverse the list using the iterator
        System.out.println("Traversing list using Iterator:");
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if(number == 50) {
                iterator.remove();
            }
            System.out.println(numbers);
            System.out.println(number);
        }
    }
}
