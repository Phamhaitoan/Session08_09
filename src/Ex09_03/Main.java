package Ex09_03;

public class Main {
    public static void main(String[] args) {
        Playable audio = new AudioPlayer();
        Playable video = new VideoPlayer();
        audio.play();
        video.play();
    }
}
