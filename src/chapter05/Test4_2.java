package chapter05;

import java.util.Random;

public class Test4_2 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] dice = new int[6];

        for (int i = 0; i <= 10000; i++) {
            int randomdice = random.nextInt(6) + 1;
            dice[randomdice - 1]++;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println((i + 1) + "의 개수: " + dice[i]);
        }
    }
}

