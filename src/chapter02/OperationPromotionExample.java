package chapter02;

public class OperationPromotionExample {
    public static void main(String[] args) {
        byte v1 = 10;
        byte v2 = 20;
        int result = v1+v2;

        byte v3 = 10;
        byte v4 = 20;
        byte result2 = (byte) (v3+v4);//연산 후(+-*/) 기본인자가 int로 변함

        int v5 =1;
        int v6 =2;
        double result3 = v5/v6;//기본 연산 후 값을 int로 지정되기에, 이때 값이 0이 나옴.
        double result4 = (double)v5/v6;//하나의 피연산자만 캐스팅해주면, 나머지 피연산자는 자동캐스팅
        System.out.println(result3);//double로 선언했어도 v5/v6연산자가 선행되어 int값이 반환됨.
        System.out.println(result4);


    }
}
