package adapter;

public class AdapterTest {

    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        player.play("vlc", "tongji.vlc");
        player.play("mp4", "岁月.mp4");
        player.play("mp3", "诺言.mp3");
        player.play("m3u8", "勋章.m3u8");
    }
}
