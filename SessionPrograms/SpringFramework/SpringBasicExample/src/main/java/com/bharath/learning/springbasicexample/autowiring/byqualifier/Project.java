package com.bharath.learning.springbasicexample.autowiring.byqualifier;

public class Project {
    private Employee projectManager;

    public Project() {
        // Constructor
    }

    public void setProjectManager(Employee projectManager) {
        this.projectManager = projectManager;
    }

    public void displayProjectInfo() {
        System.out.println("Project managed by: " + projectManager.getName());
    }
}
