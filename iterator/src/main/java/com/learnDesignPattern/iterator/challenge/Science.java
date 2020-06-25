package com.learnDesignPattern.iterator.challenge;

import java.util.LinkedList;

public class Science implements SubjectInterface {

    private LinkedList<String> subjects;


    public Science() {
        this.subjects = new LinkedList<>();
        subjects.addLast("Mathematics");
        subjects.addLast("Computer Science");
        subjects.addLast("Physics");

    }

    @Override
    public IteratorInterface createIterator() {
        return new ScienceIterator(subjects);
    }
}