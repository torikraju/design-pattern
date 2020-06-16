package com.learnDesignPattern.factoryMethod.challenge;

public class AnimalFactory {
    public Animal getAnimal(AnimalType animalType) {
        if (AnimalType.TIGER.equals(animalType)) {
            return new Tiger();
        } else if (AnimalType.DUCK.equals(animalType)) {
            return new Duct();
        } else return null;
    }
}
