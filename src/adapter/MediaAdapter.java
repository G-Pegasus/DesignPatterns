package adapter;

import adapter.impl.AdvancedMediaPlayer;
import adapter.impl.MediaPlayer;
import adapter.player.MP4Player;
import adapter.player.VlcPlayer;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equals("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equals("mp4")) {
            advancedMusicPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equals("mp4")) {
            advancedMusicPlayer.playMP4(fileName);
        }
    }
}
