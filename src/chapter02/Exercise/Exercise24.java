package chapter02.Exercise;

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        /*원기둥 밑면의 반지름과 높이를 입력 받아서 밑면의 넓이와 부피를 계산하는 프로그램을 작성하여 보자.
        원주율은 Math.PI를 사용한다.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위: cm):");
        double radius = sc.nextDouble();
        System.out.print("원기둥 높이를 입력하시오.(단위: cm):");
        double height = sc.nextDouble();
        double square = Math.pow(radius,2);//제곱 radius*radius
        double bottomarea = square* Math.PI;
        double volume = square* height * Math.PI;
        System.out.println("원기둥 밑변의 넓이는 " + bottomarea + "㎠이고, 원기둥의 부피는 " + volume + "㎤이다.");


    }
}