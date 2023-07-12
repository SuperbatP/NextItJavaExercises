package chapter02;
import java.util.Scanner;

public class PhoneNumberExample {
    public static void main(String[] args) {
        /*전화번호를 세 부분(010, 1234, 1234)으로 나누어 입력받고
        010-1234-1234로 출력하는 코드를 작성하시오*/
        Scanner sc = new Scanner(System.in);
        System.out.print("전화번호 첫번째 자리: ");
        String firstnumber =  sc.next();
        System.out.print("전화번호 두번째 자리: ");
        int secondnumber =  sc.nextInt();
        System.out.print("전화번호 세번째 자리: ");
        int thirdnumber =  sc.nextInt();
        System.out.print("전화번호는 "+firstnumber+"-"+secondnumber+"-"+thirdnumber+" 입니다."+"\n");
        System.out.printf("%s-%s-%s", firstnumber,secondnumber,thirdnumber);
    }
}
