package Javasclassic;

public class Exercise621 {
    public static int abs(int value) {
        return value > 0 ? value : -value;
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println("절대값: " + abs(value));
        value = -10;
        System.out.println("절대값: " + abs(value));

    }
}
