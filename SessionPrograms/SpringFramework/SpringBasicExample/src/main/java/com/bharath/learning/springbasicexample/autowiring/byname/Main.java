package com.bharath.learning.springbasicexample.autowiring.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // The "employeeService" bean will be autowired with the "department" bean by name.
        EmployeeService employeeService = context.getBean(EmployeeService.class);

        // Use the autowired beans to get employee information.
        String employeeInfo = employeeService.getEmployeeInfo();
        System.out.println(employeeInfo);
    }
}
