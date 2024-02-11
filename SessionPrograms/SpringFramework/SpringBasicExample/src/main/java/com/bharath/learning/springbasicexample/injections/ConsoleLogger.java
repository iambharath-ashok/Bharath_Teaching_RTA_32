package com.bharath.learning.springbasicexample.injections;

public class ConsoleLogger implements TransactionLogger{
    @Override
    public void logTransaaction(String message) {
        System.out.println("Transaction Log:: "+ message);

    }
}
