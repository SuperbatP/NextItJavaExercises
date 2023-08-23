package chapter04;

public class IfExample {
    public static void main(String[] args) {
        int score = 93;

        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }
        if (score < 90) // if문에 중괄호는 필수!
            System.out.println("점수가 90보다 작습니다.");//중괄호 생략시 한 줄만 실행됨.
        System.out.println("등급은 B입니다.");//if문 외의 것으로 조건에 생관없이 출력
    }
}
