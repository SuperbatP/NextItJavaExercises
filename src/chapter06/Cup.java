package chapter06;

public class Cup {
    double height;
    double radius;
    String color;
    Cup(){}
    Cup(double height, double radius, String color){
        this.height = height;
        this.radius = radius;
        this.color = color;
    } // 생성자에 값을 한 줄로 표현.
    //동일한 변수값을 쓰면 클래스 내의 변수값과 지역변수값이 같음

}
