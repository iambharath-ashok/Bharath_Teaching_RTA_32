package com.bharath.learning.springbasicexample.autowiring.byname;

public class EmployeeService {
    private Department department;

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getEmployeeInfo() {
        return "Employee works in the " + department.getDepartmentName() + " department.";
    }
}
