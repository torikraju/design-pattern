package com.learnDesignPattern.adapter.challenge;

public class AdvancedMediaPlayerAdapter implements MediaPlayer {

    private AdvanceMediaPlayer advanceMusicPlayer;

    public AdvancedMediaPlayerAdapter(AdvanceMediaPlayer advanceMusicPlayer) {
        this.advanceMusicPlayer = advanceMusicPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        advanceMusicPlayer.loadFileName(fileName);
        advanceMusicPlayer.listen();
    }
}
