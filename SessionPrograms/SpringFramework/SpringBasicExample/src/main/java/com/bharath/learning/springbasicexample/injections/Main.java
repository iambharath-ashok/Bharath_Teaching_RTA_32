package com.bharath.learning.springbasicexample.injections;

public class Main {

    public static void main(String[] args) {
        TransactionLogger logger = new ConsoleLogger();
        BankService bankService = new BankService(logger);
        bankService.deposit(100);
    }
}
