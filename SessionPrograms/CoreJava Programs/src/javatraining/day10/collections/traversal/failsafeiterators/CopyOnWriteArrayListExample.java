package javatraining.day10.collections.traversal.failsafeiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) throws InterruptedException {

        List<String> list = new CopyOnWriteArrayList<>();


        list.add("One");
        list.add("Two");
        list.add("Three");

        // Concurrent modification by another thread
        new Thread(() -> {
            list.add("Four");
            list.remove("Two");
        }).start();

        Thread.sleep(1000);

        // Iterating using a fail-safe iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("Item: " + item);
            list.add("Four");
            list.add("Five");
        }
    }
}
