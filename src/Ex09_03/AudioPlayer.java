package Ex09_03;


public class AudioPlayer implements Playable{
    public AudioPlayer() {
    }
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public void play() {
        System.out.println("Đang phát audio …");
    }
}
