package com.bharath.learning.springbasicexample.autowiring.constructor;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
