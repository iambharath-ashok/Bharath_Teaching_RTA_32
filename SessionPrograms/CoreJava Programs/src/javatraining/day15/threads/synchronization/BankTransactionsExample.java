package javatraining.day15.threads.synchronization;

class BankAccount {
    private static int balance;


    public static void deposit(int amount) {
        synchronized (BankAccount.class) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public  void withdraw(int amount) {
        //security
        //Authentication
        //tokens
        //validation
        synchronized (BankAccount.class) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }

    public static synchronized void withdrawStatic(int amount) {
      //  synchronized (BankAccount.class){}
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public  int getBalance() {
        return balance;
    }
}

public class BankTransactionsExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Runnable withdrawTask = () -> {
            account.withdrawStatic(50);
        };

        Runnable depositTask = () -> {
            account.deposit(100);
        };


        Runnable withdrawTaskByHacker = () -> {
            account.withdrawStatic(25);
        };


        Thread thread1 = new Thread(depositTask);//new
        Thread thread2 = new Thread(withdrawTask);
        Thread thread3 = new Thread(withdrawTaskByHacker);



        thread1.start();//Runnable or running
        thread2.start();
        thread3.start();



        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + account.getBalance());// terminated
    }
}
