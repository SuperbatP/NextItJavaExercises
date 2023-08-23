package Javasclassic;

import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        /*사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 만일
        사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니
        가 필요할 것이다.*/
        System.out.print("사과의 개수를 입력하시오:");
        Scanner sc = new Scanner(System.in);
        int apple = sc.nextInt();
        int bucket = (apple / 10) + ((apple % 10)>0 ? 1 : 0);
        System.out.println("필요한 바구니의 개수는: "+bucket+"입니다.");

    }
}
