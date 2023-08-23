package chapter05;

public class ArrayCreateByValueListExample {
    public static void main(String[] args) {
        String[] season = {"Spring","Summer","Fall","Winter"};

        System.out.println("season[0] : " + season[0]);
        System.out.println("season[1] : " + season[1]);
        System.out.println("season[2] : " + season[2]);
        System.out.println("season[3] : " + season[3]);

        season[1] = "여름"; //새로운 값 대입
        System.out.println("season[1] : " + season[1]);
        System.out.println();

        int[] scores = {83, 90, 87};

        int sum = 0;
        for (int i = 0; i <3; i++) {
            sum += scores[i];
        }//배열은 반복문이랑 계속 사용. 많은 데이터 값을 처리하기 위함.
        System.out.println("총합 : " + sum);
        double avg = (double)  sum / 3;
        System.out.println("평균 : " + avg);
    }
}
