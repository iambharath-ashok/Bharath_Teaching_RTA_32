package javatraining.day3.encapsulation;

class BankAccount {
    private String accountNumber;
    private double balance;

    private String branch;

    public void setBranch(String branch) {
        this.branch = branch;
    }

    // Constructor
    BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance(String userName, String password) {
        if(userName.equals("bharath") && password.equals("passWoRD")) {
            return balance;
        }
        return 0;

    }

    // Setter method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        this.branch = "main";
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class EncapsulationExample2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 5000);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance("bharath", "passWoRD"));

        account.deposit(1000);
        account.withdraw(2000);

        System.out.println("Updated Balance: " + account.getBalance("bharath", "passWoRD"));
    }
}
