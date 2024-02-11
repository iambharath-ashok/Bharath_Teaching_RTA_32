package com.bharath.learning.springbasicexample.autowiring.byname;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Employee employee() {
        return new Employee("John");
    }

    @Bean
    public Department department() {
        return new Department("HR");
    }

    @Bean
    public EmployeeService employeeService() {
        return new EmployeeService();
    }
}
