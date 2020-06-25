package com.learnDesignPattern.iterator.challenge;

public interface IteratorInterface {
    void first();//reset to first element

    String next();//get next element

    boolean isDone();//end of collection check

    String currentItem();//retrieve current item
}
