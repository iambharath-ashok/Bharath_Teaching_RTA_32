package com.bharath.learning.springbasicexample.autowiring.byname;

public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
