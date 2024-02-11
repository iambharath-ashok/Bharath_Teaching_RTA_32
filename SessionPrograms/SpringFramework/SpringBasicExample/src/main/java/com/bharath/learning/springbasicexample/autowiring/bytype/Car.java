package com.bharath.learning.springbasicexample.autowiring.bytype;

public class Car {
    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Car started with " + engine.getType() + " engine.");
    }
}
