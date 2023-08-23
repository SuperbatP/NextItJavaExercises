package chapter05;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        /*주사위를 던져서 각 면이 나오는 횟수를 출력하는 프로그램을 만들어 보자.
        주사위를 던지는 동작은 1부터 6까지의 임의로 만들어내는 난수 발생기(Random 객체)가 대신한다.
        난수 발생기를 10,000번 호출하여 각 면이 나타나는 횟수를 계산하여 배열에 저장한다.
        확률 이론에 의하면 주사위의 각각의 면들이 거의 동일한 횟수로 나와야 한다.*/

        Random random = new Random();
        int[] dice = new int[6];

        for (int i = 0; i <= 10000; i++) {
            int randomdice = random.nextInt(6) + 1;
            switch (randomdice) {
                case 1 -> dice[0]++;
                case 2 -> dice[1]++;
                case 3 -> dice[2]++;
                case 4 -> dice[3]++;
                case 5 -> dice[4]++;
                case 6 -> dice[5]++;
            }
        }
        System.out.println("-------------");
        System.out.println("면        빈도");
        System.out.println("-------------");
      /*  System.out.println("1       " + dice[0]);
        System.out.println("2       " + dice[1]);
        System.out.println("3       " + dice[2]);
        System.out.println("4       " + dice[3]);
        System.out.println("5       " + dice[4]);
        System.out.println("6       " + dice[5]);*/
        for (int i = 0; i < dice.length; i++) {
            System.out.println((i + 1) + "\t\t" + dice[i]);
        }
    }
}
