package chapter07;

public class Calculator { //부모클래스는 임의로 못바꿈 -> 상속받아서 수정해야함.
    public double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return 3.14159*r*r;
    }
}
