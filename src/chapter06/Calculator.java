package chapter06;

public class Calculator {//메소드 선언(정의)->'호출'까지 해야 동작할 수 있음.
    void powerOn() { //반환타입-void;반환타입이 없음. powerOn-메소드이름 ()-매개변수 공간
        System.out.println("전원을 켭니다."); //void는 return 필요없음.
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    int plus(int x, int y) {
        //powerOff(); 같은 클래스 내에서 메소드 호출은 객체 없이도 가능.
        //why? 어차피 메소드 내에서는 생성자를 호출할 일이 없고,
        //다른 클래스에서 만들어질 때는 어차피 생성자를 만드니까.
        return x + y; // 값을 되돌려줌.
    }

    double divide(int x, int y) {
        return (double) x / y;
    }
}
