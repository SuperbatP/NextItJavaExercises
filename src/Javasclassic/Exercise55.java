package Javasclassic;

import java.util.Arrays;
import java.util.Random;

public class Exercise55 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        //중복되지 않은 3자리 반환.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
