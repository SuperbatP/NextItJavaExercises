package Javasclassic;

import java.util.Scanner;

public class Exercise47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하시오.: ");

        int sum = 0;
        String str = scanner.next();
        int number = Integer.parseInt(str);
        for (int i = 0 ; i < str.length() ; i++) {
            sum += str.charAt(i) - '0';
        }
        System.out.println("숫자의 합계는" + sum + "입니다.");




    }
}
