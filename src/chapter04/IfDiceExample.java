package chapter04;

import java.util.Random;

public class IfDiceExample {
    public static void main(String[] args) {
        Random random = new Random(8);
        int num = random.nextInt(6)+1;//(뽑고자 하는 개수)+시작하는 숫자 ex)(11)+35->35부터 45사이의 난수 생성.

    //alt+shift+insert 누르면 컬럼형태도 블럭지정 가능.
        int ranNum1 = random.nextInt(6)+1;
        int ranNum2 = random.nextInt(6)+1;
        int ranNum3 = random.nextInt(6)+1;
        int ranNum4 = random.nextInt(6)+1;
        int ranNum5 = random.nextInt(6)+1;
        int ranNum6 = random.nextInt(6)+1;
        int ranNum7 = random.nextInt(6)+1;
        System.out.println(ranNum1);
        System.out.println(ranNum2);
        System.out.println(ranNum3);
        System.out.println(ranNum4);
        System.out.println(ranNum5);
        System.out.println(ranNum6);
        System.out.println(ranNum7);

    }
}
