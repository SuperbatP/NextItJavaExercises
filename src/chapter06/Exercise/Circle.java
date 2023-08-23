package chapter06.Exercise;
//javabeans pattern
public class Circle {
    private double radius;
    private double x;
    private double y;

    public Circle() {
    }

    public double getRadius() {
        if (radius < 0) {
            return 0.0;
        }
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getArea() {
        if (radius > 0) {
            return Math.PI * radius * radius;
        }
        return 0;
    }
}
