package com.learnDesignPattern.abstractFactoryMethod.challenge;

public interface HollyWoodMovieInterface {
    String getMovieName();
}

class HollyWoodActionMovie implements HollyWoodMovieInterface {

    @Override
    public String getMovieName() {
        return "True lies is a hollywood action movie";
    }
}

class HollyWoodComedyMovie implements HollyWoodMovieInterface {

    @Override
    public String getMovieName() {
        return "The Jerk is a hollywood comedy movie";
    }
}
