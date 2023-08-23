package chapter04;

import java.util.Scanner;

public class Chap04Ex07_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int balance = 0;

        while(run){
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            System.out.print("선택> ");
            String strNum = scanner.nextLine(); //next는 한 종류로 맞춰줘야함.

            switch(strNum) {
                case "1" -> {
                    System.out.print("예금액>");
                    balance += Integer.parseInt(scanner.nextLine());
                }
                case "2" -> {
                    System.out.print("출금액>");
                    balance -= Integer.parseInt(scanner.nextLine());
                }
                case "3" -> {
                    System.out.print("잔고>" + balance+"\n");
                    System.out.println();
                }
                case "4" -> {
                    run = false;
                    System.out.println("프로그램 종료");
                }
            }
        }
    }
}