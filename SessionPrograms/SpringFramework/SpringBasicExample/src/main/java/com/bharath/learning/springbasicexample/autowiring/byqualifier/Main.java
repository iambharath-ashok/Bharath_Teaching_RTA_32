package com.bharath.learning.springbasicexample.autowiring.byqualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the Project bean from the Spring context
        Project project = context.getBean(Project.class);

        // Display project information, which should show the project manager's name
        project.displayProjectInfo(); // This will print "Project managed by: John Doe"
    }
}
