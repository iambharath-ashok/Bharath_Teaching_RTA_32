package com.bharath.learning.springframework;

public class PizzaDelivery {

    public static void main(String[] args) {
        // 1. Object Creating
        CheesePizza cheesePizza = new CheesePizza();
        // 2. Object Creation + Wiring Of Dependency
        PizzaStore pizzaStore = new PizzaStore(cheesePizza);
        pizzaStore.preparePizza();
        System.out.println("Delivering cheese pizza");
    }
}
