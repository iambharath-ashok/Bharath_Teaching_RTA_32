package javatraining.assignments.oops.bank;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public String deposit(double amount) {
        balance += amount;
        return "Deposited $" + amount + ". New balance: $" + balance;
    }

    public String withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return "Withdrew $" + amount + ". New balance: $" + balance;
        } else {
            return "Insufficient balance";
        }
    }

    public String displayBalance() {
        return "Account balance for " + accountHolder + ": $" + balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public String calculateInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        return "Interest added. New balance: $" + getBalance();
    }

    @Override
    public String withdraw(double amount) {
        if (amount <= getBalance()) {
            return super.withdraw(amount);
        } else {
            return "Withdrawal would result in insufficient balance";
        }
    }
}

class CheckingAccount extends BankAccount {
    private double minBalance;

    public CheckingAccount(String accountNumber, String accountHolder, double balance, double minBalance) {
        super(accountNumber, accountHolder, balance);
        this.minBalance = minBalance;
    }

    @Override
    public String withdraw(double amount) {
        if (getBalance() - amount >= minBalance) {
            return super.withdraw(amount);
        } else {
            return "Withdrawal would result in insufficient balance";
        }
    }

    @Override
    public String displayBalance() {
        return "Checking account balance for " + getAccountHolder() + ": $" + getBalance();
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAcc = new SavingsAccount("SA123", "Alice", 1000, 0.05);
        System.out.println(savingsAcc.deposit(500));
        System.out.println(savingsAcc.calculateInterest());
        System.out.println(savingsAcc.withdraw(1200));
        System.out.println(savingsAcc.displayBalance());

        CheckingAccount checkingAcc = new CheckingAccount("CA456", "Bob", 1500, 200);
        System.out.println(checkingAcc.deposit(300));
        System.out.println(checkingAcc.withdraw(1700));
        System.out.println(checkingAcc.displayBalance());
    }
}
