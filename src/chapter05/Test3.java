package chapter05;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //인공지능 컴퓨터와 게이머(사람)가 가위바위보 게임을 할 수 있도록 프로그램을 작성하시오.
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] game = {"가위", "바위", "보"};
        String pc = game[random.nextInt(3)];

        System.out.print("게이머 : ");
        String human = scanner.nextLine();
        System.out.println("인공지능 컴퓨터 : " + pc);

        if (human.equals(pc)) {
            System.out.println("결과: 무승부!");
        } else if (human.equals("가위") && pc.equals("보") ||
                human.equals("바위") && pc.equals("가위") ||
                human.equals("보") && pc.equals("바위")) {
            System.out.println("결과: 게이머 승리!");
        } else {
            System.out.println("결과: 인공지능 컴퓨터 승리!");
        }
    }
}
