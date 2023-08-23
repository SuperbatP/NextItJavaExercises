package Javasclassic;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"televison", "computer", "phone"};
        Random random = new Random();
        for (int i = 0; i < words.length; i++) {
            char[] charArr = words[i].toCharArray();
            for (int j = 0; j < charArr.length; j++) {
                int randomIndex = random.nextInt(charArr.length); // 0부터 (charArr.length - 1) 사이의 난수 생성
                char temp = charArr[j];
                charArr[j] = charArr[randomIndex];
                charArr[randomIndex] = temp;
            }
            System.out.print(Arrays.toString(charArr) + "의 정답을 입력하세요>");
            String answer = scanner.nextLine();
            if (words[i].equals(answer)) {
                System.out.println("정답입니다.");
            } else {
                System.out.println("오답입니다.");
            }
        }
    }
}
