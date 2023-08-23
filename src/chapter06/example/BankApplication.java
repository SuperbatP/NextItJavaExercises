package chapter06.example;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] arr = new Account[100];
        int totalCount = 0;

        outer : while (true) {
            System.out.println("------------------------------------");
            System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
            System.out.println("------------------------------------");
            System.out.print("선택>");
            String select = scanner.nextLine();

            switch (select) {
                case "1" -> {
                    System.out.println("----------");
                    System.out.println("1.계좌생성");
                    System.out.println("----------");
                    System.out.print("계좌번호: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("계좌주: ");
                    String holder = scanner.nextLine();
                    System.out.print("초기입금액: ");
                    int balance = Integer.parseInt(scanner.nextLine());

                    arr[totalCount++] = new Account(accountNumber, holder, balance);
                    System.out.println("결과: 계좌가 생성되었습니다.");
                }
                case "2" -> {
                    System.out.println("----------");
                    System.out.println("2.계좌목록");
                    System.out.println("----------");
                    System.out.println("계좌번호\t 계좌주\t 잔액\t");

                    for (Account account: arr) {
                        if (account != null){
                            System.out.printf("%s   %s   %,d \n",
                                    account.getAccountNumber(), account.getHolder(), account.getBalance());
                        } //%,d : 1000단위마다 ,를 표시해주는 형식
                    }
                }
                case "3" -> {
                    System.out.println("----------");
                    System.out.println("예금");
                    System.out.println("----------");
                    System.out.print("계좌번호: ");
                    String searchNumber = scanner.nextLine();//계좌번호를 받음
                    System.out.print("예금액: ");
                    int amount = Integer.parseInt(scanner.nextLine());

                    for (Account account: arr) {
                        if (account != null){
                            if(account.getAccountNumber().equals(searchNumber)){
                                account.deposit(amount); //메소드 할당
                                //account.setBalance(account.getBalance() + amount);
                            }
                        }
                    }
                    System.out.println("입금이 완료 되었습니다.");
                }
                case "4" -> {
                    System.out.println("----------");
                    System.out.println("출금");
                    System.out.println("----------");
                    System.out.print("계좌번호: ");
                    String searchNumber = scanner.nextLine();//계좌번호를 받음
                    System.out.print("출금액: ");
                    int amount = Integer.parseInt(scanner.nextLine());

                    for (Account account: arr) {
                        if (account != null){
                            if(account.getAccountNumber().equals(searchNumber)){
                                account.withdraw(amount);//메소드 할당
                            }
                        }
                    }
                    System.out.println("출금이 완료 되었습니다.");
                }
                case "5" -> { //case 에서 ->는 break 필요 없음. 단 : 는 필요함.
                    System.out.println("프로그램 종료");
                  break outer; // case에 있는 break문이 아닌, as를 사용해, while문의 break를 실행시킴.
                }
            }
        }
    }
}
