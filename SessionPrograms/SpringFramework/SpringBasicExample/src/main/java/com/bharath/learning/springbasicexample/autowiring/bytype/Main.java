package com.bharath.learning.springbasicexample.autowiring.bytype;

import com.bharath.learning.springbasicexample.autowiring.bytype.AppConfig;
import com.bharath.learning.springbasicexample.autowiring.bytype.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the Car bean from the Spring context
        Car car = context.getBean(Car.class);

        // Start the car and display the engine type
        car.start(); // This will print "Car started with V8 engine."
    }
}
