package javatraining.day10.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);

        int frontElement = queue.poll();
        System.out.println("Removed: " + frontElement);
        System.out.println("Queue after removal: " + queue);

        int peekedElement = queue.peek();
        System.out.println("Front element (peek): " + peekedElement);
        System.out.println("Queue size: " + queue.size());
        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}
