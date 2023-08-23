package chapter06;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();//클래스에 객체를 생성해야 메소드를 쓸 수 있음.
        //틀만 있으면 사용할 수 없으니, 사용할 객체를 만들어야 어떤 행위를 할 수 있음~
        calculator.powerOn();
        int answer = calculator.plus(10, 20);
        System.out.println("합계: " + answer);

        int x = 10;
        int y = 4;
        double result = calculator.divide(x,y);
        System.out.println("나눗셈: " + result);

        calculator.powerOff();
    }
}
