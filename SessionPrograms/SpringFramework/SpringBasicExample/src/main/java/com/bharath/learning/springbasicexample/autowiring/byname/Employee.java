package com.bharath.learning.springbasicexample.autowiring.byname;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
