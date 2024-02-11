package com.bharath.learning.springbasicexample.injections.setterinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {

    private TransactionLogger transactionLogger;

    // Constructor Injection
    //@Autowired
    public BankService(TransactionLogger transactionLogger) {
        this.transactionLogger = transactionLogger;
    }

    // Setter Injection
    // @Autowired
    public void setTransactionLogger(TransactionLogger transactionLogger) {
        this.transactionLogger = transactionLogger;
    }

    // Field Injection
    // @Autowired
    // private TransactionLogger transactionLogger;

    public void deposit(int amount) {
        transactionLogger.logTransaction("Deposit Of Amount Rs::" + amount);
    }

    public void withdraw(int amount) {
        transactionLogger.logTransaction("Withdrawal Of Amount Rs::" + amount);
    }
}
