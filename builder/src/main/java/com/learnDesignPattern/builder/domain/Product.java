package com.learnDesignPattern.builder.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;

public class Product {
    private static final Logger logger = LoggerFactory.getLogger(Product.class);

    private LinkedList<String> parts;

    public Product() {
        this.parts = new LinkedList<>();
    }

    public void add(String part) {
        parts.addLast(part);
    }

    public void show() {
        logger.info("Product completed as bellow");
        this.parts.forEach(logger::info);
    }

}
