package javatraining.day10.collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.naturalOrder());

        priorityQueue.offer(20);
        priorityQueue.offer(30);
        priorityQueue.offer(10);


        System.out.println("Priority Queue: " + priorityQueue);

        int frontElement = priorityQueue.poll();
        System.out.println("Removed: " + frontElement);
        System.out.println("Priority Queue after removal: " + priorityQueue);

        int peekedElement = priorityQueue.peek();
        System.out.println("Front element (peek): " + peekedElement);
        System.out.println("Priority Queue size: " + priorityQueue.size());
        System.out.println("Is the priority queue empty? " + priorityQueue.isEmpty());
    }
}
