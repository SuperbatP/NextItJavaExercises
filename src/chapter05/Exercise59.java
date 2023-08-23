package chapter05;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean run = true; //boolen 변수로 flag를 잘 사용.
        int students = 0;
        int[] scores = null;

        while (run) {
            System.out.println("-----------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-----------------------------------------------");
            System.out.print("선택>");
            String strNum = scanner.nextLine();

            switch (strNum) {
                case "1" -> { //화살표 사용시 break 없어도 됨.
                    System.out.print("학생수>");
                    students = Integer.parseInt(scanner.nextLine());
                    scores = new int[students]; //점수를 저장할 배열 만드는
                }
                case "2" -> {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.printf("scores[%d]> ",i);
                        scores[i] = Integer.parseInt(scanner.nextLine());
                    }
                }
                case "3" -> {
                    System.out.print("점수리스트>");
                    for (int i = 0; i < scores.length; i++) {
                        System.out.printf("scores[%d]: [%d]\n", i,scores[i]);
                    }
                }
                case "4" -> {
                    int max = 0;
                    int sum = 0;
                    double avg = 0;
                    for (int i = 0; i < scores.length; i++) {
                        max = (max < scores[i]) ? scores[i] : max;
                        sum += scores[i];
                    }
                    avg = (double) sum / students;
                    System.out.println("최고 점수: " + max);
                    System.out.println("평균 점수: " + avg);
                }
                case "5" -> {
                    run = false;
                    System.out.println("프로그램 종료");
                }
            }
        }
    }
}