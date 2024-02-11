package com.bharath.learning.springbasicexample.autowiring.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Define the Customer bean
    @Bean
    public Customer customer() {
        return new Customer("Bharath Ashok");
    }

    // Define the Order bean and use Autowiring by Constructor
    @Bean
    @Autowired
    public Order order(Customer customer) {
        return new Order(customer);
    }
}
