package chapter06;

public class Earth {
    static final double ERATH_RADIUS = 6400;
    static final double ERATH_SUPFACE_AREA; //상수라 '_'사용. 상수만 _사용!!

    static { //static 블럭
        ERATH_SUPFACE_AREA = 4 * Math.PI * ERATH_RADIUS * ERATH_RADIUS;
    }

    /*Earth(){ // 불가능. 생성자는 호출이 될 때만 객체를 만들 수 있기에 static의 초기값을 설정해줄 수 없음.
        ERATH_SUPFACE_AREA = 4 * Math.PI * ERATH_RADIUS * ERATH_RADIUS;
    }*/
}
