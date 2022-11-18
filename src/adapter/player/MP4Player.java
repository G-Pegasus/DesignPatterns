package adapter.player;

import adapter.impl.AdvancedMediaPlayer;

public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {}

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
