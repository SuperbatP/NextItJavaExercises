package chapter05;

import java.util.Scanner;

public class Exercise41 {
    public static void main(String[] args) {
        /*사용자로부터 세 변의 길이를 입력받은 후, 입력받은 변의 길이로 삼각형을 만들 수 있는지 판별하는 프로그램을 만들어 보자.
        삼각형을 판별하는 방법은 가장 긴 변의 길이가 다른 두 변의 길이의 합보다 작으면 삼각형을 만들 수 있다.*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("삼각형의 첫번째 변의 길이를 입력하세요.: ");
        int num1 = scanner.nextInt();

        System.out.print("삼각형의 두번째 변의 길이를 입력하세요.: ");
        int num2 = scanner.nextInt();

        System.out.print("삼각형의 세번째 변의 길이를 입력하세요.: ");
        int num3 = scanner.nextInt();

        int maxnum = Math.max(Math.max(num1, num2), num3);

        if(maxnum == num1){
            if((num2 + num3) >= maxnum){
                System.out.println("삼각형을 만들 수 있습니다.");
            } else {
                System.out.println("삼각형을 만들 수 없습니다.");
            }
        } else if (maxnum == num2) {
            if((num1 + num3) >= maxnum){
                System.out.println("삼각형을 만들 수 있습니다.");
            } else {
                System.out.println("삼각형을 만들 수 없습니다.");
            }
        } else if (maxnum == num3) {
            if ((num1 + num2) >= maxnum) {
                System.out.println("삼각형을 만들 수 있습니다.");
            } else {
                System.out.println("삼각형을 만들 수 없습니다.");
            }
        }
    }
}
