package javatraining.day10.collections.traversal.failfastiterators;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class FailFastIteratorExample {
    public static void main(String[] args) throws InterruptedException {
        List<String> transactions = new ArrayList<>();
        System.out.println("Thread Name:: "+Thread.currentThread().getName());

        transactions.add("Transaction 1");
        transactions.add("Transaction 2");
        transactions.add("Transaction 3");



        Iterator<String> iterator = transactions.iterator();

        // Concurrent modification by another thread
        new Thread(() -> {
            transactions.add("Transaction 4"); // Concurrent modification
            transactions.remove("Transaction 2"); // Concurrent modification
            System.out.println("Thread Name:: "+Thread.currentThread().getName());
            System.out.println("Transactions:: "+transactions);
        }).start();

        Thread.sleep(1000);
        // Iterating using a fail-fast iterator
        try {
            while (iterator.hasNext()) {
                String transaction = iterator.next();
                System.out.println(transaction);
            }
        } catch (ConcurrentModificationException ex) {
            System.out.println("ConcurrentModificationException caught!");
        }
    }

}
