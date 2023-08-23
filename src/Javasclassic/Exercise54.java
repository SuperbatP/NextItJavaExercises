package Javasclassic;

public class Exercise54 {
    public static void main(String[] args) {
        int sum = 0;
        double avg;
        int count = 0;

        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                count++;
            }
        }
        avg = sum / (double) count;

        System.out.println(sum);
        System.out.println(avg);
    }
}

