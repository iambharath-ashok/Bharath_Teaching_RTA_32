package javatraining.day3.abstraction;


// Abstract class representing a general bank account
abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("New Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Abstract method to calculate interest (to be implemented by subclasses)
    public abstract void calculateInterest();
}

// Concrete class representing a savings account
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.println("Interest added: $" + interest);
    }
}

// Concrete class representing a checking account
class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Exceeded overdraft limit");
        }
    }

    @Override
    public void calculateInterest() {
        // Checking accounts do not earn interest
        System.out.println("No interest for checking accounts");
    }
}

// Runner class to test the banking system
public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA123", 1000.0, 0.05);
        CheckingAccount checkingAccount = new CheckingAccount("CA456", 800.0, 200.0);

        savingsAccount.deposit(500.0);
        savingsAccount.calculateInterest();

        checkingAccount.withdraw(100.0);
        checkingAccount.calculateInterest();
    }
}
