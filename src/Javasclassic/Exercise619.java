package Javasclassic;

public class Exercise619 {
    public static void main(String[] args) {
        MyTv t = new MyTv();
        t.channel = 100;
        t.volume = 0;
        System.out.println("채널: " + t.channel + " 볼륨: " + t.volume);

        t.channelDown();
        t.volumeDown();
        System.out.println("채널: " + t.channel + " 볼륨: " + t.volume);

        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("채널: " + t.channel + " 볼륨: " + t.volume);
    }
}
