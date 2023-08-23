package Javasclassic;

public class Exercise62 {
    public static void main(String[] args) {
        Exercise61Student s = new Exercise61Student("홍길동", 1, 1, 100, 60, 76);
        System.out.println(s);
        System.out.println(s.getTotal());
        System.out.printf("%.2f", s.getAverage());
    }
}
