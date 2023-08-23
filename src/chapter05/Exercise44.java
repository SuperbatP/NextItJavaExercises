package chapter05;

import java.util.Scanner;

public class Exercise44 {
    public static void main(String[] args) {
        /*두 사람이 하는 가위 바위 보 게임을 만들어 보자. 두 사람이 입력한 문자열을 비교하여 누가 이겼는지 출력하는 프로그램이다.
          문자열을 읽기 위해서는 Scanner 클래스의 next() 메소드를 이용하면 된다. 또 자바에서 문자열 비교는 주의를 기울여야 한다.
          String 타입 변수와 문자열 비교는 == 이 아닌 equals() 메소드로 비교하여야 한다.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위 바위 보 게임");

        System.out.print("철수: ");
        String man = scanner.next();

        System.out.print("영희: ");
        String woman = scanner.next();

        //코드를 짤 때는 결과를 먼저 출력 후 역으로 재생해서 올라간다.(철수가 이김/비김/짐)
        //중복된 내용은 한 번만 쓸 수 있게 작성해보자.
        //철수가 이긴 경우의 수를 출력 -> 나머지는 영희가 이긴 경우니까 따로 표기할 필요 없음.
        if (man.equals(woman) == true){
            System.out.println("결과: 무승부!");
        } else if (man.equals("가위") && woman.equals("보") ||
                man.equals("바위") && woman.equals("가위") ||
                man.equals("보") && woman.equals("바위"))
        {
            System.out.println("결과: 철수 승리!");
        } else {
            System.out.println("결과: 영희 승리!");
        }
    }
}
