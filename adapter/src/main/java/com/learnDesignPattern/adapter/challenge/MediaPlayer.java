package com.learnDesignPattern.adapter.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface MediaPlayer {
    void play(String audioType, String fileName);
}

class AudioPlayer implements MediaPlayer {

    private static final Logger logger = LoggerFactory.getLogger(AudioPlayer.class);

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            logger.info("Playing mp3 file. Name: {}", fileName);
        } else {
            logger.info("Invalid media. {} file format not supported", audioType);
        }
    }
}
