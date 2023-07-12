package chapter02;

public class LongExample {
    public static void main(String[] args) {
        long val = 10;
        long va2 = 20;
        long va3 = 10_000_000_00;//숫자 사이에 쉼표는 문자로 인식해 오류, 언더바는 숫자로 인식해, 보이지 않음.
        long va4 = 10_000_000_000L;//숫자는 기본적으로 int로 인식, 그 이상의 숫자는 뒤에 L/l을 붙여 확인함. L을 지향

        System.out.println(va3);
        System.out.println(va4);
    }
}
