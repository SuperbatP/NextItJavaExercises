package Javasclassic;

import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) {
        /*화씨(Fahrenheit)를 섭씨(Celcius)로 변환공식이 'C =5/9 ×(F - 32)'라고 할 때,
        단, 변환 결과값은 소수점 셋째자리에서 반올림해야한다.(Math.round()를 사용하지 않고 처리할 것)*/
        System.out.print("화씨를 입력하시오: ");
        Scanner sc = new Scanner(System.in);
        int Fahrenheit = sc.nextInt();
        float Celcius = 5/9f*(Fahrenheit - 32);
        System.out.println(Fahrenheit+"℉를 섭씨로 바꾸면 "+Celcius+"℃ 입니다.");

    }
}
