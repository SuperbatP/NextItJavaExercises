package chapter08.Example;



public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "도형의 종류: 사각형, " +
                "둘레 : " + String.format("%.2f", perimeter()) + "cm" +
                ", 넓이: " + String.format("%.2f", area()) + "㎠";
    }
}
