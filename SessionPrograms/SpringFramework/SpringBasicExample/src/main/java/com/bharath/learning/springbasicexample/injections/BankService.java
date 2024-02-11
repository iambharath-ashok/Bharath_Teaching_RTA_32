package com.bharath.learning.springbasicexample.injections;

public class BankService {

    private TransactionLogger transactionLogger;

    public BankService(TransactionLogger transactionLogger) {
        this.transactionLogger = transactionLogger;
    }


    public void setTransactionLogger(TransactionLogger transactionLogger) {
        this.transactionLogger = transactionLogger;
    }
    public void deposit(int amount) {
        transactionLogger.logTransaaction("Deposit Of Amount Rs::");
    }

    public void withdraw(int amount) {
        transactionLogger.logTransaaction("Withdrawal Of Amount Rs::");
    }
}
