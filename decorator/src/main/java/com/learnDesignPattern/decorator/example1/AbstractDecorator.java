package com.learnDesignPattern.decorator.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractDecorator extends Component {
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void doJob() {
        if (component != null) {
            component.doJob();
        }
    }
}

class ConcreteDecoratorEx1 extends AbstractDecorator {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteDecoratorEx1.class);

    @Override
    public void doJob() {
        super.doJob();
        logger.info("I am explicitly form ConcreteDecoratorEx1");
    }
}

class ConcreteDecoratorEx2 extends AbstractDecorator {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteDecoratorEx2.class);

    @Override
    public void doJob() {
        logger.info("");
        logger.info("***START EX-2***");
        super.doJob();
        logger.info("I am explicitly form ConcreteDecoratorEx2");
        logger.info("***END EX-2***");
    }
}
