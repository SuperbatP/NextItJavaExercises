package chapter06.Exercise;

public class NewCar {
    private double speed;
    private String color;

    private static final double MAX_SPEED = kiloToMile(200);


    public NewCar() {
    }

    public NewCar(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return mileToKilo(speed);
    }

    public void setSpeed(double speed) {
        this.speed = kiloToMile(speed);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static double getMaxSpeed() {
        return mileToKilo(MAX_SPEED);
    }

    public boolean speedUp(double speed) {
        speed = kiloToMile(speed);
        if (speed > 0 && speed < MAX_SPEED) {
            this.speed += speed;
            return false;
        }
        return true;
    }

    private static double kiloToMile(double distance) { //km->mile
        return distance / 1.6; //즉, 이 때 받는 disctance는 km
    }

    private static double mileToKilo(double distance) {//mile->km
        return distance * 1.6; //즉, 이 때 받는 disctance는 mile
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }
}
