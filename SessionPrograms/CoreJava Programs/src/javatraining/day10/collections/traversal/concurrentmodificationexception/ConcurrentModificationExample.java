package javatraining.day10.collections.traversal.concurrentmodificationexception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            //numbers.remove(1);
            Integer number = iterator.next();
            if (number == 20 ) {
                iterator.remove();
                numbers.remove(number); // This will throw ConcurrentModificationException
            }
        }
    }
}
