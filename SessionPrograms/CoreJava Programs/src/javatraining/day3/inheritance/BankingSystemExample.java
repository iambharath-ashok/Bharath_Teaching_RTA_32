package javatraining.day3.inheritance;

class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

   void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        super.deposit(interest);//reusing the parent class behaviour
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {
        double availableBalance = getBalance() + overdraftLimit;
        if (amount <= availableBalance) {
            super.withdraw(amount); //reusing the parent class behaviour
        } else {
            System.out.println("Exceeds overdraft limit");
        }
    }
}

public class BankingSystemExample {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA001", 5000, 3.5);
        CurrentAccount currentAccount = new CurrentAccount("CA001", 10000, 5000);

        savingsAccount.deposit(1000);
        savingsAccount.applyInterest();
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        currentAccount.withdraw(8000);
        System.out.println("Current Account Balance: " + currentAccount.getBalance());
    }
}
