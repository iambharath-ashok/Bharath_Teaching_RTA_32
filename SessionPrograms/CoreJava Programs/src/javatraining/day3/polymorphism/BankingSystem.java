package javatraining.day3.polymorphism;

class Account {
    void displayBalance() {
        System.out.println("Displaying account balance");
    }
}

class SavingsAccount extends Account {
    @Override
    void displayBalance() {
        System.out.println("Displaying savings account balance");
    }
}

class CurrentAccount extends Account {
    @Override
    void displayBalance() {
        System.out.println("Displaying current account balance");
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Account account1 = new SavingsAccount();
        Account account2 = new CurrentAccount();

        account1.displayBalance(); // Output: Displaying savings account balance
        account2.displayBalance(); // Output: Displaying current account balance
    }
}
