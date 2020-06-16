package com.learnDesignPattern.composite.example2;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Employee {
    void showEmployeeDetails();
}

@Data
class Developer implements Employee {
    private static final Logger logger = LoggerFactory.getLogger(Developer.class);

    private String name;
    private String employeeId;
    private String position;

    public Developer(String name, String employeeId, String position) {
        this.name = name;
        this.employeeId = employeeId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        logger.info("{} {} {}", employeeId, name, position);
    }
}
