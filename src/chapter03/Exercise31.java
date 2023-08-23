package chapter03;

import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        /*두 정수를 입력받아 큰 수를 작은 수로 나눈 몫과 나머지를 출력하는 프로그램을 만들어 보자.
        임의의 두 정수는 a, b에 대하여 ((a + b) + |a - b|) / 2는 큰 수,
        ((a + b) - |a - b|) / 2는 작은 수이다. 절대값을 반환하는 메소드는 Math.abs(숫자)이다.
        만약 |-3|을 알아보고 싶으면 Math.abs(-3)이라고 쓰면 3이 반환된다. 이것을 이용하여 만들어 보자.
        어떤 수를 0으로 나누는 것은 수학적으로 성립하지 않으므로 0을 입력하지 않는다고 가정하고 프로그램을 작성
        비교연산자를 넣지 않음*/

        Scanner sc = new Scanner(System.in);
       System.out.print("A값을 입력하시오 :");
       int a = sc.nextInt();
       System.out.print("B값을 입력하시오 :");
       int b = sc.nextInt();
       //a,b 중 큰 수와 작은수를 찾음
       int max = ((a + b) + Math.abs(a - b) )/ 2;
       int min = ((a + b) - Math.abs(a - b) )/ 2;
        String result = (b!= 0)
                ? "큰 수를 작은 수로 나눈 몫: " + (max / min) + "\n큰 수를 작은 수로 나눈 나머지: " + (max % min)
                : "0으로 나눌 수 없습니다.";
        System.out.println(result);

    }
}
