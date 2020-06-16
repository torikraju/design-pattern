package com.learnDesignPattern.abstractFactoryMethod.challenge;

public interface BollyWoodMovieInterface {
    String getMovieName();
}

class BollyWoodActionMovie implements BollyWoodMovieInterface {

    @Override
    public String getMovieName() {
        return "Bang bang is a bollywood action movie";
    }
}

class BollyWoodComedyMovie implements BollyWoodMovieInterface {

    @Override
    public String getMovieName() {
        return "Hera pheri is a bollywood comedy movie";
    }
}
