package com.bharath.learning.springbasicexample.autowiring.byname;

public class School {
    private Teacher teacher;

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void displaySchoolInfo() {
        System.out.println("School has a teacher named " + teacher.getName());
    }
}
