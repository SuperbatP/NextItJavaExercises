package chapter02;
import java.util.Scanner;
public class InputSumExample {
    public static void main(String[] args) {
        //사용자에게 두개의 숫자를 받아서 더하고 반환
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 수: ");
        int firstnumber = sc.nextInt();
        System.out.print("두번째 수: ");
        int secondnumber = sc.nextInt();

        int result = firstnumber+secondnumber;
        System.out.println("덧셈 결과: "+result);

    }
}
