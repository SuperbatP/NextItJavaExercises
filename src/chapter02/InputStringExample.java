package chapter02;
import java.util.Scanner;

public class InputStringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");//커서의 위치 : 뒤에
        String name = sc.next();//이름 받아옴
        System.out.print("나이을 입력하세요: ");
        int age = sc.nextInt();//나이를 받는 문자열로 받을지 숫자열로 받을지 고민해야함.
        //숫자열의 경우 연산이 가능하지만 문자열로 받아올 경우 순수하게 출력만.
        System.out.print("전화번호를 입력하세요: ");//커서의 위치 : 뒤에
        String phone = sc.next();

        System.out.println("이름: "+name);
        System.out.print("나이: "+age+"\n");
        System.out.printf("전화: %s",phone);

    }
}
