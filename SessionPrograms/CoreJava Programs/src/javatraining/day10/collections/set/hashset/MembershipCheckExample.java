package javatraining.day10.collections.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class MembershipCheckExample {
    public static void main(String[] args) {
        Set<String> employeeIds = new HashSet<>();
        employeeIds.add("EMP123");
        employeeIds.add("EMP456");
        employeeIds.add("EMP456");
        employeeIds.add("EMP456");
        employeeIds.add("EMP789");

        String targetEmployeeId = "EMP456";

        if (employeeIds.contains(targetEmployeeId)) {
            System.out.println(targetEmployeeId + " is a valid employee ID.");
        } else {
            System.out.println(targetEmployeeId + " is not a valid employee ID.");
        }
    }
}

class Car {

}

