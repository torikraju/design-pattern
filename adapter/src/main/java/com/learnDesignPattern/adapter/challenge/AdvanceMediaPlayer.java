package com.learnDesignPattern.adapter.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface AdvanceMediaPlayer {
    void loadFileName(String fileName);

    void listen();
}

class VlcPlayer implements AdvanceMediaPlayer {
    private static final Logger logger = LoggerFactory.getLogger(VlcPlayer.class);

    private String myFile;

    @Override
    public void loadFileName(String fileName) {
        myFile = fileName;
    }

    @Override
    public void listen() {
        logger.info("Playing vlc file. Name: {}", myFile);
    }
}

class Mp4Player implements AdvanceMediaPlayer {
    private static final Logger logger = LoggerFactory.getLogger(Mp4Player.class);

    private String myFile;

    @Override
    public void loadFileName(String fileName) {
        myFile = fileName;
    }

    @Override
    public void listen() {
        logger.info("Playing mp4 file. Name: {}", myFile);
    }
}
