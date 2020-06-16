package com.learnDesignPattern.adapter.classAdapter;

public interface IntegerValueInterface {
    public int getInteger();
}

class IntegerValue implements IntegerValueInterface {
    @Override
    public int getInteger() {
        return 5;
    }
}

class ClassAdapter extends IntegerValue {
    @Override
    public int getInteger() {
        return 2 + super.getInteger();
    }
}

class ObjectAdapter {
    private IntegerValueInterface integerValueInterface;

    public ObjectAdapter(IntegerValueInterface integerValueInterface) {
        this.integerValueInterface = integerValueInterface;
    }

    public int getInteger() {
        return 2 + this.integerValueInterface.getInteger();
    }

}


