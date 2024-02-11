package javatraining.day3.encapsulation;

public class Demo {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        BankAccount bankAccountEmployee1 = employee1.createBankAccount("1234", 5000);
        Employee employee2 = new Employee();
        BankAccount bankAccountEmployee2 = employee2.createBankAccount("2347", 25000);
        Employee employee3= new Employee();
        BankAccount bankAccountEmployee3 = employee3.createBankAccount("34454", 15000);

        bankAccountEmployee1.getBalance("bharath", "password");
        bankAccountEmployee1.setBranch("New Delhi");

        bankAccountEmployee2.setBranch("bangalore");
    }
}
