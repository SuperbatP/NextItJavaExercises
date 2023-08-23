package chapter04;

public class Chap04Ex03 {
    public static void main(String[] args) {
        //for 문을 이용해서 1부터 100까지 정수 중에서 3의 배수의 총합을 출력하는 코드
        int sum = 0;

        for (int i = 1; i <= 100 ; i++) {
         if ( i % 3 == 0) {
             sum += i;
         }
        }
        System.out.println("1~100까지의 정수 중 3의 배수의 총 합: " + sum);
    }
}
