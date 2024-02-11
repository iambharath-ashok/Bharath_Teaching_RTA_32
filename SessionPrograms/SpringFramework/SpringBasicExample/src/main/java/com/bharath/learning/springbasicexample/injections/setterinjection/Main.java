package com.bharath.learning.springbasicexample.injections.setterinjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bharath.learning.springbasicexample.injections.setterinjection")
public class Main {

    public static void main(String[] args) {
        // Create Spring context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        // Get beans from the context
        TransactionLogger logger = context.getBean(TransactionLogger.class);
        BankService bankService = context.getBean(BankService.class);

        // Perform a transaction
        bankService.deposit(100);

        // Close the context
        context.close();
    }
}
