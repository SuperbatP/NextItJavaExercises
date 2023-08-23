package Javasclassic;

public class Exercise66Mypoint {
    int x;
    int y;

    public Exercise66Mypoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    double getDistance(int x1, int y1) {
        int height = Math.abs(y - y1);
        int width = Math.abs(x - x1);
        return Math.sqrt((height * height) + (width * width));
    }

    public static void main(String[] args) {
        Exercise66Mypoint exercise66Mypoint = new Exercise66Mypoint(1, 1);
        System.out.println(exercise66Mypoint.getDistance(2,2));
    }
}
