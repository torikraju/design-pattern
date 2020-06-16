package com.learnDesignPattern.composite.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Employee {

    private static final Logger logger = LoggerFactory.getLogger(Directory.class);

    private List<Employee> employeeList = new ArrayList<>();


    @Override
    public void showEmployeeDetails() {
        employeeList.forEach(Employee::showEmployeeDetails);
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        this.employeeList.remove(employee);
    }
}
