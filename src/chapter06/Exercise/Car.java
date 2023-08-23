package chapter06.Exercise;

public class Car {
    private double speed;
    private String color;
    final static private double MAX_SPEED = 200;

    public Car() {
    }

    public Car(String color) {
        this.color = color;
    }

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

    public boolean speedUp(double speed) {
       /* if (speed < 0 || speed > MAX_SPEED) {
            this.speed = 0;
            return false;
        } else {
            this.speed += speed;
            return true;*/

        if (speed > 0 && speed < MAX_SPEED) {
            this.speed += speed;
            return true;
        } else {
            return false;
        }
    }
    public String toString(){
        return null; //객체(인스턴스)가 가지고 있는 필드의 데이터를 확인하기 위한 용도
    }

    /*@Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", color='" + color + '\'' +
                '}';*/

}
