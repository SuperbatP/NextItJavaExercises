package chapter06;

import java.util.Arrays;

public class Car3 {
    int speed;

    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    static void simulate() {
        Car3 myCar = new Car3();
        myCar.speed = 200;
        myCar.run();
    }

    public static void main(String[] args) {
        simulate();
        Car3 myCar = new Car3();
        myCar.speed = 60;
        myCar.run();
    }

 }
