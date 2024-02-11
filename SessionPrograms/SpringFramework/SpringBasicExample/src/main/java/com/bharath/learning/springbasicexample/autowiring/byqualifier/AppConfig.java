package com.bharath.learning.springbasicexample.autowiring.byqualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Define two Employee beans with different names
    @Bean(name = "managerA")
    public Employee employeeA() {
        return new Employee("Bharath Ashok");
    }

    @Bean(name = "managerB")
    public Employee employeeB() {
        return new Employee("Ashok Smith");
    }

    // Define the Project bean and use Autowiring by Qualifier
    @Bean
    public Project project(@Qualifier("managerA") Employee projectManager) {
        Project project = new Project();
        project.setProjectManager(projectManager);
        return project;
    }
}
