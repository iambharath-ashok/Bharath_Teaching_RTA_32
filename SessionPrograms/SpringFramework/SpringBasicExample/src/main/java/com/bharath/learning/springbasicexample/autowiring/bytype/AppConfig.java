package com.bharath.learning.springbasicexample.autowiring.bytype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Define the Engine bean
    @Bean
    public Engine engine() {
        return new Engine("V8");
    }

    // Define the Car bean and use Autowiring by Type
    @Bean
    @Autowired
    public Car car(Engine engine) {
        Car car = new Car();
        car.setEngine(engine);
        return car;
    }
}
