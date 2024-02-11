package javatraining.day3.encapsulation;

public class Employee {

    public BankAccount createBankAccount(String accountNumber, double balance) {
        BankAccount account = new BankAccount(accountNumber, balance);
        return account;
    }
}
