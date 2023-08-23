package Javasclassic;

public class Exercise64 {
    static double getDistance(int x, int y, int x1, int y1) {
        int height = Math.abs(y - y1);
        int width = Math.abs(x - x1);
        return Math.sqrt((height * height) + (width * width));
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1,1,2,2));
    }
}
