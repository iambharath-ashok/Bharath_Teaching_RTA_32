package javatraining.day10.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Orange");

        System.out.println("Queue: " + queue);

        String frontElement = queue.poll();//Front of the Queue
        System.out.println("Removed: " + frontElement);
        System.out.println("Queue after removal: " + queue);

        String peekedElement = queue.peek();//Retrieve the first element of the Queue
        System.out.println("Front element (peek): " + peekedElement);
        System.out.println("Queue size: " + queue.size());
        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}
