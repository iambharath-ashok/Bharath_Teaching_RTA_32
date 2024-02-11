package com.bharath.learning.springbasicexample.injections.setterinjection;

import org.springframework.stereotype.Component;

@Component
public class ConsoleLogger implements TransactionLogger {

    @Override
    public void logTransaction(String message) {
        System.out.println("Transaction Log:: " + message);
    }
}
