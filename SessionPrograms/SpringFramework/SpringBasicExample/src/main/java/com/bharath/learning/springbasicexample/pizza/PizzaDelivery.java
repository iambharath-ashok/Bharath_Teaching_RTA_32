package com.bharath.learning.springbasicexample.pizza;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PizzaDelivery {

    public static void main(String[] args) {

        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PizzaConfiguration.class)){
            PizzaStore pizzaStore = context.getBean("pizzaStore", PizzaStore.class);
            pizzaStore.preparePizza();
        }

    }
}
