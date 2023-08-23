package chapter05;

import java.util.Random;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        Random random = null;
        int num = random.nextInt(6);
        String str = null;
        System.out.println("총 문자수: "+str.length());

    }
}
