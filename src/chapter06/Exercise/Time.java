package chapter06.Exercise;

public class Time {
    private int hour;
    private int minute;
    private int second;
    //자바에서 필드는 범위를 지정할 수 없다. 굳이 필드에 범위를 지정하고 싶으면 클래스에서 부터 설정.

    public Time() {
    }

    public Time(int hour, int minute, int second) {
        this.hour = 0 <= hour && hour <= 23 ? hour : 0;
        this.minute = 0 <= minute && minute <= 59 ? minute : 0;
        this.second = 0 <= second && second <= 59 ? second : 0;
    //아니면 생성할때마다 제약조건을 걸어줌.
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
