package chapter04;

import java.util.Random;

public class Chap04Ex04 {
    public static void main(String[] args) {
      /* 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고,
        눈의 합이 5이면 실행을 멈추는 코드를 작성하시오. 눈의 합이 5개 되는 경우 : 1,4/4,1/2,3/3,2 */

        Random random = new Random();

        while (true) {
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;
            System.out.println("주사위의 값 : (" + dice1 + "," + dice2 + ")");

            if ((dice1 + dice2) == 5) {
                break;
            }
        }
        System.out.println("종료되었습니다.");
    }
}

