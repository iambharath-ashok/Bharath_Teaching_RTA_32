package com.bharath.learning.springframework;

public class PizzaStore {

    CheesePizza CheesePizza;

    public PizzaStore(com.bharath.learning.springframework.CheesePizza cheesePizza) {
        CheesePizza = cheesePizza;
    }

    public void preparePizza() {
        this.CheesePizza.createPizza();
        this.CheesePizza.bakePizza();
        this.CheesePizza.cutPizza();
    }


}
