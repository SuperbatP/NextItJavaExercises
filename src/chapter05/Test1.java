package chapter05;

public class Test1 {
    public static void main(String[] args) {
        //다음 배열에서 최대값과 최소값을 구하시오.
        //{38, 94, 16, 3, 76, 94, 82, 47, 59, 8}

        int[] array = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};

        //자바에서 제공하는 최소값 최대값 상수.
        int max =  Integer.MIN_VALUE;
        int min =  Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            max = (max > array[i]) ? max : array[i];
            min = (min < array[i]) ? min : array[i];
        }
        System.out.println("최대값 : " + max + ", 최소값 : " + min);
    }
}
