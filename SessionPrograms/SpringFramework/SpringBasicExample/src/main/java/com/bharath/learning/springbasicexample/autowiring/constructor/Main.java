package com.bharath.learning.springbasicexample.autowiring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the Order bean from the Spring context
        Order order = context.getBean(Order.class);

        // Display order information, which should show the customer's name
        order.displayOrderInfo(); // This will print "Order placed by: John Doe"
    }
}
