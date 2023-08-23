package chapter05;

import java.util.Scanner;

public class Exercise42 {
    public static void main(String[] args) {
     /* 사용자로부터 특정 월을 입력받은 후, 입력 받은 월의 계절이 어떤 계절인지 알아내는 프로그램을 만들어 보자.
        3월~5월은 봄, 6월~8월은 여름, 9월~11월은 가을, 12월~2월은 겨울을 출력한다.
        실행 결과는 3번 반복되어 있지만 1번만 나오도록 작성하시면 됩니다.*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("월을 입력하세요.(1~12): ");

        int num = scanner.nextInt();

        String result = switch(num){
            case 3, 4, 5 -> "봄";
            case 6, 7, 8 -> "여름";
            case 9, 10, 11 -> "가을";
            case 12, 1, 2 -> "겨울";
            default -> "잘못된 입력";
        };
        System.out.printf("%d월은 %s입니다.",num , result );
    }
}
