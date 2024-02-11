package com.bharath.learning.springbasicexample.autowiring.bytype;

public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
