package com.bharath.learning.springbasicexample.beanscopes;


public class MyPrototypeBean {
    private int counter = 0;

    public void incrementCounter() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}

