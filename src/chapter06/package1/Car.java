package chapter06.package1;

public class Car {
    private double speed; // 속도 (km/h)
    private String color;
    private static final double MAX_SPEED = 200.0; // 최대 속력 상수

    // 생성자
    public Car(double speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    // Getter와 Setter 메소드
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static double getMaxSpeed() {
        return MAX_SPEED;
    }

    // speedUp 메소드
    public boolean speedUp(double speed) {
        if (speed < 0 || speed > MAX_SPEED) {
            return false;
        } else {
            this.speed = speed;
            return true;
        }
    }

    // 거리 단위 변환 메소드: km -> mile
    public double kiloToMile(double distanceKm) {
        return distanceKm / 1.60934;
    }

    // 거리 단위 변환 메소드: mile -> km
    public double mileToKilo(double distanceMile) {
        return distanceMile * 1.60934;
    }
}
