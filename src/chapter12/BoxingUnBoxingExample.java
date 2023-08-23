package chapter12;

import org.apache.commons.lang3.builder.JsonToStringStyleTest;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        Integer obj = 100; //auto boxing
        int value = obj; //auto unboxing

        long starTime = System.nanoTime();
        int sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        long endTime = System.nanoTime();
        System.out.println(sum);
        System.out.println("기본타입 걸린시간: " + (endTime - starTime));

        long starTime1 = System.nanoTime();
        int sum1 = 0;
        for (Integer i = 0; i < 1_000_000; i++) {
            sum1 += i;
        }
        long endTime1 = System.nanoTime();
        System.out.println(sum1);
        System.out.println("Wrapper Class 걸린시간: " + (endTime1 - starTime1));
    }
}
