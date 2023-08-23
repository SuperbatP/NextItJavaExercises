package chapter04;

public class IfElseExample {
    public static void main(String[] args) {
        int score = 85;
        //if문만 있을 때는 실행될수도 안될수도 있는데 if-else의 경우 둘 중 하나는 무조건 실행.
        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        } else {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        }
    }
}

