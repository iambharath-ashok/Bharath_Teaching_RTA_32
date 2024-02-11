package javatraining.day10.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class OnlineOrderProcessingExample {
    public static void main(String[] args) {
        Queue<String> orderQueue = new ArrayDeque<>();

        // New orders arrive
        orderQueue.offer("Order #001");
        orderQueue.offer("Order #002");
        orderQueue.offer("Order #003");

        // Process orders in the order they are received
        while (!orderQueue.isEmpty()) {
            String order = orderQueue.poll();
            System.out.println("Processing: " + order);
        }
    }
}
