package com.bharath.learning.springbasicexample.autowiring.constructor;

public class Order {
    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void displayOrderInfo() {
        System.out.println("Order placed by: " + customer.getName());
    }
}
