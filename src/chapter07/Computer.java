package chapter07;

public class Computer extends Calculator{
    @Override //Annotation[어노테이션] : 해시태그와 비슷한 느낌. 오버라이딩이 제대로 되었는지 오류를 더 빨리 찾고 알려주기위함.
    public double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI*r*r;
    }
}
