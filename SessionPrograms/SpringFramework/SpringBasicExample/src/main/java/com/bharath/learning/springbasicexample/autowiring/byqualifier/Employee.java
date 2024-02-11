package com.bharath.learning.springbasicexample.autowiring.byqualifier;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
