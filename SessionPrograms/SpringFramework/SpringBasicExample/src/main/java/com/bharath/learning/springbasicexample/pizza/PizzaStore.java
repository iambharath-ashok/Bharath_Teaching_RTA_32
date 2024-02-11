package com.bharath.learning.springbasicexample.pizza;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaStore {

    @Qualifier("chikenPizza")
    @Autowired
    Pizza pizza;


    public void preparePizza() {
        this.pizza.preparePizza();
        this.pizza.bakePizza();
        this.pizza.cutPizza();
    }

}
