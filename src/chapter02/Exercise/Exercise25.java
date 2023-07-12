package chapter02.Exercise;

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        /*사용자로부터 500원, 100원, 50원, 10원짜리 동전의 갯수를 입력 받아
        저금통 안에 총 얼마가 들어 있는지 출력하는 프로그램을 만들어 보자.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("500원짜리 동전의 갯수: ");
        int a = sc.nextInt();
        System.out.print("100원짜리 동전의 갯수: ");
        int b = sc.nextInt();
        System.out.print("50원짜리 동전의 갯수: ");
        int c = sc.nextInt();
        System.out.print("10원짜리 동전의 갯수: ");
        int d = sc.nextInt();
        int result = 500*a+100*b+50*c+10*d;
        System.out.print("저금통 안의 동전의 총 액수: "+result);

    }
}
