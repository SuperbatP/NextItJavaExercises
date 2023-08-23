package chapter17;

import java.util.Arrays;
import java.util.List;

public class AggregateExample {
    public static void main(String[] args) {
        /*List<Integer> list = Arrays.asList(8, 96, 16, 3, 76, 94, 82, 47, 59, 8);
        list.stream().*/

        int[] array = {38,96,16,3,76,94,82,47,59,8};
        int max = Arrays.stream(array).max().getAsInt();
        int sum = Arrays.stream(array).sum();
        System.out.println(max);
        System.out.println(sum);
        Arrays.stream(array).findFirst().getAsInt();//예외가 발생할 수 있어서 getAsInt로 종단.
        Arrays.stream(array).findAny().getAsInt();//예외가 발생할 수 있어서 getAsInt로 종단.


    }
}
