package Javasclassic;

import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {
        /*아래는 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다. 삼항 연산
        자를 이용해서 코드를 작성하시오. [Hint] 삼항 연산자를 두 번 사용하라.*/
        System.out.print("값을 입력하시오.: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String result = number > 0 ? "양수" : (number == 0 ? "0" : "음수");
        System.out.println(result);


    }
}
