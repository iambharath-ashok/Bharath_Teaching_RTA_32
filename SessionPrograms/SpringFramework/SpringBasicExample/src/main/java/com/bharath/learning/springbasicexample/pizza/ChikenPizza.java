package com.bharath.learning.springbasicexample.pizza;

import org.springframework.stereotype.Component;

@Component
public class ChikenPizza implements Pizza {
    @Override
    public void preparePizza() {
        System.out.println("Prepare Cheese Pizza");
    }

    @Override
    public void bakePizza() {
        System.out.println("Bake Cheese Pizza");
    }

    @Override
    public void cutPizza() {
        System.out.println("Cut Cheese Pizza");
    }
}