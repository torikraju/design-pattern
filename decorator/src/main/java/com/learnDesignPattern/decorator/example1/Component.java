package com.learnDesignPattern.decorator.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Component {
    public abstract void doJob();
}

class ConcreteComponent extends Component {
    private static final Logger logger = LoggerFactory.getLogger(ConcreteComponent.class);

    @Override
    public void doJob() {
        logger.info("I am from ConcreteComponent - I am close for modification");
    }
}


