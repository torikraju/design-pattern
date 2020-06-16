package com.learnDesignPattern.composite.example2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Manager implements Employee {

    private static final Logger logger = LoggerFactory.getLogger(Manager.class);

    private String name;
    private double salary;

    private List<Employee> employeeList = new ArrayList<>();

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void showEmployeeDetails() {
        logger.info("--------------");
        logger.info("Name = {}", getName());
        logger.info("Salary = {}", getSalary());
        logger.info("--------------");

        employeeList.forEach(Employee::showEmployeeDetails);
    }

    public void addEmployees(Employee... employee) {
        this.employeeList.addAll(Arrays.asList(employee));
    }

    public void removeEmployee(Employee employee) {
        this.employeeList.remove(employee);
    }

    public Employee getChild(int i) {
        return this.employeeList.get(i);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
