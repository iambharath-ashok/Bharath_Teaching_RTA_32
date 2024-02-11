package javatraining.day10.collections.traversal.failsafeiterators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;

public class ConcurrentLinkedQueueExample {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        queue.add("Item 1");
        queue.add("Item 2");
        queue.add("Item 3");

        // Concurrent modification by another thread
        new Thread(() -> {
            queue.add("Item 4");
            queue.remove("Item 2");
        }).start();

        // Iterating using an iterator (safe in ConcurrentLinkedQueue)
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("Item: " + item);
        }
    }
}
