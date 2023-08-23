package chapter06;

public class Car2Example {
    public static void main(String[] args) {
        Car2 myCar = new Car2();
        myCar.setGas(5);
        if (myCar.isLeftGas()) {
            System.out.println("출발합니다.");
            myCar.run();
        }
        System.out.println("gas를 주입하세요.");
    }
}
