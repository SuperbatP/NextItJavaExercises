package chapter05;

import java.util.Scanner;

public class Exercise43 {
    public static void main(String[] args) {
        /*사용자로부터 5과목의 점수를 입력받아 평균을 구하는 프로그램을 작성하여 보자.
        평균 점수로 학점을 계산하여 출력한다.(평균 점수는 소숫점 둘째자리까지만 출력)
        평균 점수가 90점 이상이면 A, 80점 이상 90점 미만이면 B, 70점 이상 80점 미만이면 C,
        60점 이상 70점 미만이면 D, 60점 미만이면 F로 계산한다.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("점수를 입력하세요.");

        System.out.print("프로그래밍 기초: ");
        int num1 =  scanner.nextInt();

        System.out.print("데이터베이스: ");
        int num2 =  scanner.nextInt();

        System.out.print("화면 구현: ");
        int num3 =  scanner.nextInt();

        System.out.print("애플리케이션 구현: ");
        int num4 =  scanner.nextInt();

        System.out.print("머신러닝: ");
        int num5 =  scanner.nextInt();

        int sum = num1 + num2 + num3 + num4 + num5;
        float avg = (float)sum / 5;

        System.out.println("총점: " + sum);
        System.out.printf("평균: %.2f\n", avg);

        if(avg >= 90){
            System.out.println("학점: A");
        } else if (avg >= 80) {
            System.out.println("학점: B");
        } else if (avg >= 70) {
            System.out.println("학점: C");
        } else if (avg >= 60) {
            System.out.println("학점: D");
        } else {
            System.out.println("학점: F");
        }
    }
}
