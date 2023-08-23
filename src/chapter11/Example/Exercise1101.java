package chapter11.Example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1101 {
    public static void main(String[] args) {
        int dividend, divisor, result;

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("어떤 수를 나누시겠습니까?");
                dividend = Integer.parseInt(scanner.nextLine());

                System.out.print("어떤 수로 나누시겠습니까?");
                divisor = scanner.nextInt();

                result = dividend / divisor;
                System.out.printf("%d/%d = %d", dividend, divisor, result);
                scanner.close();
                break;
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력해 주세요.");
            }
        }
    }
}
