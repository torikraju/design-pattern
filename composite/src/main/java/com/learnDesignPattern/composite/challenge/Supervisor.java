package com.learnDesignPattern.composite.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Supervisor extends CommonElement implements Faculty {

    private String department;
    private List<Faculty> facultyList = new ArrayList<>();

    public Supervisor(String name, String department) {
        setName(name);
        this.department = department;
    }

    public void add(Faculty... faculties) {
        this.facultyList.addAll(Arrays.asList(faculties));
    }

    public void remove(Faculty faculty) {
        this.facultyList.remove(faculty);
    }

    public List<Faculty> getFacultyList() {
        return this.facultyList;
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "name='" + getName() + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public String getDetails() {
        return getName() + " is the " + department;
    }
}
