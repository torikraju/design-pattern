package com.learnDesignPattern.composite.challenge;

public interface Faculty {
    String getDetails();
}

class Professor extends CommonElement implements Faculty {

    private String position;
    private String officeNumber;

    public Professor(String name, String position, String officeNumber) {
        super();
        setName(name);
        this.position = position;
        this.officeNumber = officeNumber;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + getName() + '\'' +
                ", position='" + position + '\'' +
                ", officeNumber='" + officeNumber + '\'' +
                '}';
    }

    @Override
    public String getDetails() {
        return toString();
    }
}
