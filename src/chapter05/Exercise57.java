package chapter05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise57 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};
        System.out.println(Arrays.stream(array).max().getAsInt());

        int max = 0;//최대값을 저장하는 변수 선언 및 초기 이때 초기값은 배열의 값보다 작아야한다.
        //또는 int max = array[0] 으로 지정해줘도 ok.(어차피 하나씩 비교할 거니까)
        for (int i = 0; i < array.length; i++) {
            max = (max<array[i])? array[i] : max;
        }
        System.out.println(max);
    }
}
