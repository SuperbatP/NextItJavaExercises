package chapter05;

import java.util.Arrays;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //로또번호를 생성하는 프로그램을 작성하시오.
        //(로또 번호는 1 ~ 45번까지 있으며 이 중에서 중복되지 않는 6개의 숫자를 추출하여 결과를 출력한다.)
        Random random = new Random();
        /*int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = random.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                }
            }
        }
        System.out.println("로또번호 : " + Arrays.toString(lotto));*/

        //카드 셔플 후 드로우 하는 방법으로 수를 추출할 수 있음.
        int[] card = new int[45];

        for (int i = 0; i < card.length; i++) {
            card[i] = i + 1;
        }

        for (int i = 0; i < card.length; i++) {
            int randomIndex = random.nextInt(card.length); // 랜덤 인덱스 생성
            int blank = card[i];
            card[i] = card[randomIndex];
            card[randomIndex] = blank;
        }

        //마지막 쉼표 제거->라고 생각하는 게 아니라, 쉼표 갯수를 제한해서 넣으면 되는 거 ㅠㅠ
        for (int i = 0; i < 6; i++) {
            System.out.print(card[i]);
            if (i < 5) {
                System.out.print(", ");
            }
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(card[i]);
            System.out.print(i < 5 ? ", " : ""); // 삼항연산자를 사용하여 마지막 쉼표 출력 여부 결정
        }

        for (int i = 0; i < 6; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(card[i]);
        }
    }
}

