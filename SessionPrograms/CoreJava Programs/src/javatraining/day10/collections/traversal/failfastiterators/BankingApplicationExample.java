package javatraining.day10.collections.traversal.failfastiterators;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;


public class BankingApplicationExample {
    public static void main(String[] args) {
        List<String> transactions = new ArrayList<>();
        transactions.add("Deposit: $100");
        transactions.add("Withdrawal: $50");
        transactions.add("Deposit: $200");





        // Create a thread for processing transactions
        Thread transactionProcessor = new Thread(() -> {
            try {
                Thread.sleep(100); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            transactions.add("Withdrawal: $30"); // Concurrent modification
            System.out.println("New withdrawal processed.");
        });

        // Create a thread for iterating over transactions
        Thread transactionIterator = new Thread(() -> {
            Iterator<String> iterator = transactions.iterator();
            try {
                while (iterator.hasNext()) {
                    String transaction = iterator.next();
                    System.out.println("Processing: " + transaction);
                    Thread.sleep(50); // Simulate some processing time
                }
            } catch (ConcurrentModificationException ex) {
                System.out.println("ConcurrentModificationException caught!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        // Start both threads
        transactionProcessor.start();
        transactionIterator.start();

        try {
            transactionProcessor.join();
            transactionIterator.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
