package javatraining.day10.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();


        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        queue.offer("Fourth");

        System.out.println("Queue: " + queue);

        String frontElement = queue.poll();

        System.out.println("Removed: " + frontElement);

        //peek() method is used to get the current first element
        frontElement = queue.peek();
        System.out.println("New Front: " + frontElement);
        System.out.println("Queue after removal: " + queue);

        queue.offer("Fifth");
        System.out.println("Queue after adding fifth: " + queue);
    }
}
