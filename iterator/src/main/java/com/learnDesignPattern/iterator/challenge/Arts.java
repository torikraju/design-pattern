package com.learnDesignPattern.iterator.challenge;

import java.util.LinkedList;

public class Arts implements SubjectInterface {

    private String[] subjects;

    public Arts() {
        this.subjects = new String[2];
        subjects[0] = "Bengali";
        subjects[1] = "English";
    }

    @Override
    public IteratorInterface createIterator() {
        return new ArtsIterator(subjects);
    }
}


