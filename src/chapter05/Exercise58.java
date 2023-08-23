package chapter05;

public class Exercise58 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {93, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int sum = 0;
        int count = 0 ;

        for (int i = 0; i <array.length; i++) { //세로방향 반복
            for (int j = 0; j <array[i].length; j++) { //가로방향 반복
                sum += array[i][j];
                count ++; //반복문이 돌 때마다 숫자를 세줌->배열의 개
            }
        }
        float avg = (float) sum/count;

        System.out.println(sum);
        System.out.println(avg);
    }
}
