package chapter02;

public class FloatDoubleExample {
    public static void main(String[] args) {
        float var1 = 0.1234567890123456789f;//실수의 기본 타입은 double f/F를 붙여서 캐스팅 소문자 f 지향
        double var2 = 0.1234567890123456789;
        System.out.println(var1);//유효숫자 7자리
        System.out.println(var2);//유효숫자 15자리
        //float vs double 더 정밀하다 차이.
        double var3 = 1e2;
        double var4 = 1.23e-5;
        System.out.println(var3);
        System.out.println(var4);
    }
}
