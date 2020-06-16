package com.learnDesignPattern.adapter.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "banglaMusic.mp3");

        AdvanceMediaPlayer mp4Player = new Mp4Player();
        MediaPlayer advanceMediaPlayer1 = new AdvancedMediaPlayerAdapter(mp4Player);
        advanceMediaPlayer1.play("mp4", "alone.mp4");

        AdvanceMediaPlayer vlcPlayer = new VlcPlayer();
        MediaPlayer advanceMediaPlayer2 = new AdvancedMediaPlayerAdapter(vlcPlayer);
        advanceMediaPlayer2.play("vlc", "far far away.mp4");

        audioPlayer.play("mp4", "banglaNewMusic.mp3");
    }

}
